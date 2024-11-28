package com.jspider.pureabstraction;
interface Translator{
	void translate();
}
class English implements Translator{
	@Override
	public void translate() {
		System.out.println("english");
		
	}
}
class Kannada implements Translator{
	@Override
	public void translate() {
		System.out.println("kannda");
		
	}
}
class Hindi implements Translator{
	@Override
	public void translate() {
		System.out.println("hindi");
		
	}
}
class Telugu implements Translator{
	@Override
	public void translate() {
		System.out.println("telugu");
		
	}
}
class TranslationEngine{
	static void TranslateTo(Translator t1,Translator t2) {
		if(t1!=null &&t2!=null) {
			t1.translate();
			System.out.println("to");
			t2.translate();
			System.out.println("");
		}
	}
}
public class Mainclass7 {
	public static void main(String[] args) {
		English e=new English();
		Kannada k=new Kannada();
		Hindi h=new Hindi();
		Telugu t=new Telugu();
		TranslationEngine.TranslateTo(h, k);
		
		TranslationEngine.TranslateTo(t, h);
		
		TranslationEngine.TranslateTo(k, h);
		
		TranslationEngine.TranslateTo(e, k);
		
	}

}
