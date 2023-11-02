package com.sist.manager;
import java.util.*;


import com.sist.vo.BookHouseVO;

import java.io.*;
public class BookManager {
	
   private static ArrayList<BookHouseVO>
        fList=new ArrayList<BookHouseVO>();
   /*
    *         Throwable 
    *         ---------
    *            |
    *     -------------------------------
    *     |                             |
    *    Error                     Exception 
    *                                  |
    *                ---------------------------------
    *                |                               |
    *              CheckedException       UnCheckedException
    *              ----------------      -------------------
    *              컴파일시에 예외처리 확인      예외처리 확인(X)
    *              ------------------    -------------------
    *               java.io                  java.lang
    *               java.net                 java.util
    *               java.sql
    *      목적 : 에러를 사전에 방지 
    *            에러시 정상 수행을 할 수 있게 만든다 
    */
   // 초기화 블록 => static 변수가 있는 경우에 주로 사용 
   // 자동 수행이 된다 , 상속은 안된다 
   
   static
   {
//	   FileReader fr=null;
//	   ObjectOutputStream ois=null;
//	   FileOutputStream fis=null;
//	   try
//	   {
//		   // 정상 수행 문장 
//		   fr=new FileReader("c:\\java_data\\book.txt");
//		   String data="";
//		   int i=0;
//		   while((i=fr.read())!=-1)//-1 (EOF)
//		   {
//			   data+=(char)i;
//		   }
//		   fr.close();
//		   
//		   String[] cates=data.split("\n");
//		   for(String s:cates)
//		   {
//			   StringTokenizer st=new StringTokenizer(s,"|");
//			   
//			   BookHouseVO vo=new BookHouseVO();
//			   vo.setFno(Integer.parseInt(st.nextToken().replace("\ufeff", "")));
//			   vo.setName(st.nextToken());
//			   vo.setAuthor(st.nextToken());
//			   vo.setPoster(st.nextToken());
//			   vo.setPubl(st.nextToken());
//			   vo.setScore(Double.parseDouble(st.nextToken()));
//			   fList.add(vo);
//		   }
//		   
//		   fis=new FileOutputStream("c:\\java_data\\bc.txt");
//		   ois=new ObjectOutputStream(fis);
//		   ois.writeObject(fList);
//		   
//	   }catch(Exception ex)
//	   {
//		   // 에러 확인후 복구
//		   ex.printStackTrace();
//	   }
//	   finally
//	   {
//		   // 무조건 수행하는 문장 => 파일 닫기 , 서버 닫기
//		   try
//		   {
//			   fis.close();
//			   ois.close();
//		   }catch(Exception ex) {}
//	   }
	   
	   FileInputStream fis=null;
	   ObjectInputStream ois=null;
	   try
	   {
		   fis=new FileInputStream("c:\\java_data\\bc.txt");
		   ois=new ObjectInputStream(fis);
		   fList=(ArrayList<BookHouseVO>)ois.readObject();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   fis.close();
			   ois.close();
		   }catch(Exception ex) {}
	   }
	   /*
	    *  1|
	    *  1|
	    *  가양칼국수버섯매운탕
	    *  |4.3|
	    *  서울특별시 영등포구 국제금융로 78 
	    *  홍우빌딩 B1 지번 서울시 영등포구 
	    *  여의도동 43-3 홍우빌딩 B1
	    *  |02-784-0409
	    *  |국수 / 면 요리
	    *  |만원-2만원
	    *  |유료주차 가능
	    *  |11:30 - 21:30
	    *  |가양칼국수버섯매운탕 12,000원 샤브 소고기 (200g) 
	    *  12,000원
	    *  |https://mp-seoul-image-production-s3.mangoplate.com/52481_1621066187997112.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/673960_1689725902210805.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/673960_1689725904425496.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/24979_1686491189261172.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/24979_1686491193055171.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80

	    */

   }
   public static void main(String[] args) {
	   BookManager fm=new BookManager();
	   System.out.println("저장");
	   for(BookHouseVO vo:fList)
	   {
		   System.out.println("번호:"+vo.getFno());
		   System.out.println("제목:"+vo.getName());
		   System.out.println("작가:"+vo.getAuthor());
		   System.out.println("출판사:"+vo.getPubl());
		   System.out.println("평점:"+vo.getScore());
	   }
	   
   }
   public ArrayList<BookHouseVO> BookHouseData(int no)
   {
	   ArrayList<BookHouseVO> list=
			   new ArrayList<BookHouseVO>();
	   int start=0;
	   int end=0;
	   if(no==1)
	   {
		   start=0;
		   end=11;
	   }
	   else if(no==2)
	   {
		   start=12;
		   end=17;
	   }
	   else if(no==3)
	   {
		   start=18;
		   end=29;
	   }
	   for(int i=start;i<=end;i++)
	   {
		   list.add(fList.get(i));
	   }
	   return list;
   }
   
   public BookHouseVO houseInfoData(String title)
   {
	   BookHouseVO vo=new BookHouseVO();
	   for(BookHouseVO fvo:fList)
	   {
		   if(fvo.getName().equals(title))
		   {
			   vo=fvo;
			   break;
		   }
	   }
	   return vo;
   }
   public ArrayList<BookHouseVO> BookHouseListData(int fno)
   {
	   ArrayList<BookHouseVO> list=
			   new ArrayList<BookHouseVO>();
	   for(BookHouseVO fvo:fList)
	   {
		   if(fvo.getFno()==fno)
		   {
			   list.add(fvo);
		   }
	   }
	   return list;
   }
   public BookHouseVO BookInfoData(int fno)
   {
	   BookHouseVO vo=new BookHouseVO();
	   for(BookHouseVO fvo:fList)
	   {
		   if(fvo.getFno()==fno)
		   {
			   vo=fvo;
			   break;
		   }
	   }
	   return vo;
   }
   
   public ArrayList<BookHouseVO> BookFindData(String title)
   {
	   ArrayList<BookHouseVO> list=
			   new ArrayList<BookHouseVO>();
	   for(BookHouseVO fvo:fList)
	   {
		   if(fvo.getName().contains(title))
		   {
			   list.add(fvo);
		   }
	   }
	   return list;
   }
}