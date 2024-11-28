package com.jspider.Constructoroverloading;

class Sample{
	Sample(int a){
		System.out.println("Sample (int) constructor");
	}
	Sample(int a,int b){
		System.out.println("Sample (int,int) constructor");
	}
	Sample(int a,int b,int c){
		System.out.println("Sample (int,int,int) constructor");
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1=new Sample(12);
		Sample s2=new Sample(12,14);
		Sample s3=new Sample(12,14,16);

	}

}
