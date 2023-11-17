package com.sist.io;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class SeoulLibrary_BookInfo {
	SeoulLibrary_BookInfo(){
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr = new FileReader("C:\\oracleDev\\cate.txt");
			// 저장 객체
			fw=new FileWriter("C:\\oracleDev\\bookVO.txt");
			final String URL = "https://lib.seoul.go.kr/search/detail/";
			StringBuffer sb = new StringBuffer();
			StringBuffer sb2=new StringBuffer();
			int j = 0;
			while((j=fr.read())!=-1) {
				sb.append((char)j);
			}
			String[] data = sb.toString().split("\n");
			for(int k = 0; k<data.length;k++) {
				int start_number = 0;
				int last_number = 0;
				String[] a = data[k].split("\\|");
				// 지정된 번호까지
				if(Integer.parseInt(a[0])>0 && Integer.parseInt(a[0])<=6) {
					Document doc = Jsoup.connect("https://lib.seoul.go.kr/searchS/alq/result?pn="+start_number+"&os=&cpp=100&sNo=0&mainLink=%2FsearchS%2Falq&sts=Y&sq="+a[2]+"&st=SUBJ&oi=").get();
					Element first_page = doc.selectFirst("div.paging span a");
					Elements last_page = doc.select("div.paging a");
					// 게시물이 있는 경우
					if(first_page!=null) {
						start_number = Integer.parseInt(first_page.text());
					}
					for(int i = 0; i<last_page.size();i++) {
						// 마지막 페이지 태그
						String last = last_page.get(i).attr("href");
						last=last.replaceAll("&(?!amp;)", "&amp;");
						// 마지막 페이지 넘버
						last_number = Integer.parseInt(last.substring(last.indexOf("pn=")+3,last.indexOf("&amp;")));
					}
					if(start_number != 0) {
						String data_catal = "";
						if(last_number !=0) {
							for(int f = start_number;f<=last_number;f++) {
								// start_number : 시작페이지, last_number : 끝페이지
								doc = Jsoup.connect("https://lib.seoul.go.kr/searchS/alq/result?pn="+f+"&os=&cpp=100&sNo=0&mainLink=%2FsearchS%2Falq&sts=Y&sq="+a[2]+"&st=SUBJ&oi=").get();
								Elements find_id = doc.select("ul.book-list li");
								for(int find_id2 = 0; find_id2<find_id.size();find_id2++) {
									// 카탈로그값
									String s = find_id.get(find_id2).attr("id");
									data_catal = s.substring(s.indexOf("_")+1);
									//System.out.println(data_catal);
									// 상세보기 페이지 접근
									doc = Jsoup.connect(URL+data_catal).get();
									Elements detail_data = doc.select("div.right tr");
									String bookTitle=doc.selectFirst("div.right div.profileHeader h3").text();
									String bookAuthor=doc.selectFirst("div.right div.profileHeader p").text();
									String bookDtype=""; // 자료유형
									String bookPerson=""; // 개인저자
									String bookSign=""; // 서명
									String bookPublisher=""; // 출판사
									String bookDate=""; // 발행연도
									String bookISBN=""; // 고유번호
									String bookAccessionNo=""; // 등록번호
									String bookCallNum=""; // 청구기호
									String bookLocation=""; // 자료실/서가
									try {
										bookAccessionNo=doc.selectFirst("tr.footable-detail-show td.accessionNo").text();
									} catch (Exception e) {}
									try {
										bookCallNum=doc.selectFirst("tr.footable-detail-show td.callNum").text();
									} catch (Exception e) {}
									try {
										bookLocation=doc.selectFirst("tr.footable-detail-show td.location").text();
									} catch (Exception e) {}
									//System.out.println(bookAccessionNo);
									//System.out.println(bookCallNum);
									//System.out.println(bookLocation);
									for(int w=0;w<detail_data.size();w++) {
										if(detail_data.get(w).text().contains("자료유형")) {
											bookDtype=detail_data.get(w).text().substring(detail_data.get(w).text().indexOf(" ")+1);
											//System.out.println(bookDtype);
										}
										if(detail_data.get(w).text().contains("개인저자")) {
											bookPerson=detail_data.get(w).text().substring(detail_data.get(w).text().indexOf(" ")+1);
											//System.out.println(bookPerson);
										}
										if(detail_data.get(w).text().contains("저자사항")) {
											bookSign=detail_data.get(w).text().substring(detail_data.get(w).text().indexOf(" ")+1);
											//System.out.println(bookSign);
										}
										if(detail_data.get(w).text().contains("발행사항") && !(detail_data.get(w).text().contains("원본주기"))) {
											// 서울:밥북,2017 => 일반
											// 헬스조선,2013:YES24. => 형식이 다른 발행사항
											try {
												bookPublisher=detail_data.get(w).text().substring(detail_data.get(w).text().indexOf(":")+1, detail_data.get(w).text().indexOf(","));
											}catch (Exception e) {
												try {
												bookPublisher=detail_data.get(w).text().substring(detail_data.get(w).text().indexOf(" ")+1,detail_data.get(w).text().indexOf(","));
												}catch(Exception e2) {}
											}
											try{
												bookDate=detail_data.get(w).text().substring(detail_data.get(w).text().indexOf(",")+1,detail_data.get(w).text().indexOf(",")+5);
											}catch(Exception e) {}
											//System.out.println(bookPublisher);
											//System.out.println(bookDate);
										}
										if(detail_data.get(w).text().contains("ISBN")) {
											String[] isbnArr=detail_data.get(w).text().split(" ");
											bookISBN=isbnArr[1];
											if(bookISBN.contains("(")) {
			                                    bookISBN=bookISBN.substring(0,bookISBN.indexOf("("));
			                                    bookISBN=bookISBN.replaceAll("[^0-9]", "");
			                                 }else if(bookISBN.contains(":")) {
			                                    bookISBN=bookISBN.substring(0,bookISBN.indexOf(":"));
			                                    bookISBN=bookISBN.replaceAll("[^0-9]", "");
			                                 }
										}
									}
									// a[0]|a[1]|ISBN|제목|저자|bookDtype|bookPerson|bookSign|bookPublisher|bookDate
									sb2.append(a[0]+"|"+a[1]+"|"+bookISBN+"|"+bookTitle+"|"+bookAuthor+"|"+bookDtype
											+"|"+bookPerson+"|"+bookSign+"|"+bookPublisher+"|"+bookDate+"|"+bookAccessionNo+"|"+bookCallNum+"|"+bookLocation+"\n");
									fw.write(sb2.toString());
			                        System.out.println(sb2.toString());
			                        sb2=new StringBuffer();
								}
								
							}
							// 파일저장
						//fw.write(sb2.toString());
						}
					}
				}
				else {
		               continue;
		            }
			}
			System.out.println(sb2.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	public static void main(String[] args) {
		new SeoulLibrary_BookInfo();
	}

}
