package Assn6;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenNumThread t1 = new EvenNumThread();
		t1.start();
		
		OddNumThread t2 = new OddNumThread();
		t2.start();

		
	}

}

