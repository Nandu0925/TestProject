package com.jspider.Widening;
class Utility{
	void play(float f) {
		System.out.println("play method :"+f);
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		u.play(2.5f);
		u.play(45);//--->auto widening :int--->float
		u.play('a');//--->auto widening :char--->float
	}

}
