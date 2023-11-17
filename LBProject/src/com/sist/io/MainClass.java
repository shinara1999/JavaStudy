package com.sist.io;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

public class MainClass {

		public static void main(String[] args) {
			
			try
			{
				Document doc=Jsoup.connect("https://lib.seoul.go.kr/searchS/alq").get();
				for(int i=19;i<=24;i++)
				{		
					Elements link=doc.select("ul#sub1-"+i+" li a.more");
					
						//String subGenre="";
						for (Element element:link)
						{
							// 중분류 제목
							String subGenre=element.text();
							//System.out.println(subGenre);
						
						for(int j=1;j<=9;j++)
						{	
							Elements link2=doc.select("ul#sub1-"+i+" ul#sub2-"+j+" li a");
					
							for(Element element1:link2)
							{
								//소분류 숫자
								String miniGenre=element1.attr("href");
								String miniNum=miniGenre.substring(miniGenre.indexOf("sq=")+3, miniGenre.indexOf("main")-1);
								System.out.println("분류번호: "+miniNum);
								
								String msg=i+"|"
											+subGenre+"|"
											+miniNum+"|"+"\r\n";
								msg=msg.substring(0, msg.lastIndexOf("|"));
								msg+="\r\n";
				
								FileWriter fw=new FileWriter("c:\\java_data\\sep.txt", true);
								fw.write(msg);
								fw.close();
							}			
						}
					}
				}
						
			}catch(Exception ex) {}
		}
}