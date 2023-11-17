package com.sist.io;

import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class dd {

    public static void main(String[] args) {

        try {
            Document doc = Jsoup.connect("https://lib.seoul.go.kr/searchS/alq").get();

            // Use a Set to store unique miniNum values
            Set<String> uniqueMiniNums = new HashSet<>();

            for (int i = 19; i <= 24; i++) {
                Elements link = doc.select("ul#sub1-" + i + " li a.more");

                for (Element element : link) {
                    String subGenre = element.text();

                    for (int j = 1; j <= 9; j++) {
                        Elements link2 = doc.select("ul#sub1-" + i + " ul#sub2-" + j + " li a");

                        for (Element element1 : link2) {
                            String miniGenre = element1.attr("href");
                            String miniNum = miniGenre.substring(miniGenre.indexOf("sq=") + 3,
                                    miniGenre.indexOf("main") - 1);

                            // Check if miniNum is already processed
                            if (uniqueMiniNums.add(miniNum)) {
                                System.out.println("분류번호: " + miniNum);

                                String msg = i + "|" + subGenre + "|" + miniNum + "|" + "\r\n";
                                msg = msg.substring(0, msg.lastIndexOf("|"));
                                msg += "\r\n";

                                FileWriter fw = new FileWriter("c:\\java_data\\sep.txt", true);
                                fw.write(msg);
                                fw.close();
                            }
                        }
                    }
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
