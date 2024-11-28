package com.jspider.Upcasting;
class Color{
	
}
class Red extends Color{
	
}
class Green extends Color{
	
}
class Blue extends Color{
	
}
class ColorPalette{
	static void pickColor(Color c) {
		System.out.println("color selected");
	}
}
public class Mainclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Red r=new Red();
		Green g=new Green();
		Blue b=new Blue();
		
		ColorPalette.pickColor(r);
		ColorPalette.pickColor(g);
		ColorPalette.pickColor(b);

	}

}
