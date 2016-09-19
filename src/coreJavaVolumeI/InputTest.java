package coreJavaVolumeI;

import java.util.Scanner;

public class InputTest {
	enum Size {S,M,L,XL,XXL,XXXL};

	public static void main(String[] args) {
		Size s = Size.XL;
		System.out.println(s);
		
		teststring();
		scannertest();
		
	}
	public static void teststring(){
		System.out.println("teststring:");
		String e = "  ";// 
		String greeting = "Hello";
		String s = greeting.substring(0, 3);
		System.out.print(s+e);
		int age = 13;
		String rating ="PG"+age;
		System.out.print(rating+e);
		greeting = greeting.substring(0,3)+"p!";
		System.out.print(greeting+e);
		System.out.print("Hello".equals("hello")+e);//检测字符串（区分大小写
		System.out.print("Hello".equalsIgnoreCase("hello")+e);//检测字符串（不区分大小写
		System.out.print("hello".startsWith("he")+e);//判断字符串以什么开始
		System.out.print("hello".endsWith("lo")+e);//字符串以什么结束
		StringBuilder builder = new StringBuilder();
		builder.append(rating);
		builder.append(s);
		builder.append(e);
		System.out.println(builder.toString());
	}
	private static void scannertest() {
		Scanner in = new Scanner(System.in);
		System.out.println("scannertest:");
		System.out.print("what's your name? ");
		String name = in.nextLine();
		System.out.print("How old are you? ");
		int age = in.nextInt();
		System.out.println("Hello, "+name+". Next year, you'll be "+(age+1));
		

	}
}
