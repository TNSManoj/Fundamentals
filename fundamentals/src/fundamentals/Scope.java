package fundamentals;

public class Scope {

	public static void main(String[] args) {
		int outer =3;
		{
		int inner =5;
		System.out.println("inner =" + inner);
		System.out.println("outer =" + outer);
		}
		int inner =7;
		System.out.println("inner =" + inner);
		System.out.println("outer =" + outer);
	}

}
