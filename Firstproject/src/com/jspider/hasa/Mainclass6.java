package com.jspider.hasa;
class Printer{
	void writeln() {
		System.out.println("write the statement");
	}
}
class Computer{
	static Printer out=new Printer();
}
public class Mainclass6 {

	public static void main(String[] args) {
		Computer.out.writeln();

	}

}
