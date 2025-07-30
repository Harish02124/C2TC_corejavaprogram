package polymorphism_override;

class college{
	protected college getObject() {
		return new college();
	}
}

public class OverrideDemo  {
	public static void main(String[] args) {
		PLTraining p1=new PLTraining();
		p1.session("Full Stack Devop");
		p1=new JFS();
		p1.session("Method overloading");
		p1=new Python();
		p1.session("String Manipulation");
		
	}
}