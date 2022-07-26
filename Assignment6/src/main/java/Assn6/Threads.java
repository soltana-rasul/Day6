package Assn6;

//Q1
class FiftyThread extends Thread{
	public void run() {
		for(int i =0; i <= 50; i++) {
			System.out.println(i);
		}
	}
}

//Q2
class Even extends Thread{
	public void run() {
		System.out.println("Even");
	for(int i = 0; i <= 50; i = i + 2) {
		System.out.println(i);
		}
	}
}
//Q2
class Odd extends Thread{
	public void run() {
		System.out.println("Odd");
	for(int j = 1; j <= 50; j = j + 2) {
		System.out.println(j);
		}
	}
}
//Q3
class EvenNumThread extends Thread{
	
	public void run () {
		for (int i = 0; i < 50; i = i+ 2) {
			System.out.println(i);
			try{
				Thread.sleep(200);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
 class OddNumThread extends Thread{
		public void run() {
		for (int j = 1; j < 50; j = j + 2) {
			System.out.println(j);
			try{
				Thread.sleep(200);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		}
 }
