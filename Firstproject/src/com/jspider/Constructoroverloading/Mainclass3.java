package com.jspider.Constructoroverloading;
class Example{
	Example(int a,String s){
		System.out.println("Example(int,String) constructor");
	}
	Example(String s,int a){
		System.out.println("Example(String,int) constructor");
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e1=new Example(10,"nanda");
		Example e2=new Example("nanda",10);

	}

}
