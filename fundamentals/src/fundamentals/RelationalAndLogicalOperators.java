package fundamentals;

import java.util.Random;

public class RelationalAndLogicalOperators {

	public static void main(String[] args) {
		Random random = new Random(); //className objName = new className();
		int i= random.nextInt(100);
		int j = random.nextInt(100);
		System.out.println("i= " +i);
		System.out.println("j= " +j);
		System.out.println("i>j " +(i>j));
		System.out.println("i<j " +(i<j));
		System.out.println("i>=j " +(i>=j));
		System.out.println("i<=j " +(i<=j));
		System.out.println("i==j " +(i==j));
		System.out.println("i!=j " +(i!=j));
		System.out.println("(i<10)&&(j<10) " +((i<10)&&(j<10)));
		System.out.println("(i<10)||(j<10) " +((i<10)&&(j<10)));
		



	}

}
