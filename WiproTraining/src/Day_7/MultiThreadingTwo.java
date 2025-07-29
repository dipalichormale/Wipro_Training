package Day_7;
class MyThread1 implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread1");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}

class MyThread2 implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread2");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}
public class MultiThreadingTwo {

	public static void main(String[] args) {
		// creating reference of runnable to our classes
		MyThread1 obj1 = new MyThread1();
		MyThread2 obj2 = new MyThread2();
		
		// creating reference of thread class by passing obj of runnable in const of threaad class
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();

	}

}
