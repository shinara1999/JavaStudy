package com.sist.main2;
class Super
{
	
}
class Sub extends Super
{
	
}
// NullPointException , ClassCastException => 가장 많이 발생하는 오류들
public class MainClass4 {
	static String str; // null인데 잘라달라고 해서 오류 발생
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s=new Sub();
		
		// Sub ss=new Super(); => 오류 발생
		Sub ss=(Sub)s;
		
		// Super sss=new Super();
		// Sub ssss=(Sub)sss;
		
		// str.charAt(0);
	}

}
