public class Jp{

	public static void main(String[] args){

		UseThread u1 = new UseThread();
		UseThread u2 = new UseThread();
		UseThread u3 = new UseThread();

		Thread t1 = new Thread(u1, "U1");
		Thread t2 = new Thread(u2, "U2");
		Thread t3 = new Thread(u3, "U3");

		System.out.println(t1.getName());
		t1.start();

		try {
			t1.suspend();
			t1.resume();
			t1.stop();
			t1.notify();
			t1.notifyAll();
		}catch(Exception e){
			System.out.println(e);
		}

		t1.setPriority(10); // Range is 1-10
		System.out.println(t2.getName());
		t2.start();
		System.out.println(t3.getName());
		System.out.println("isAlive: " + t1.isAlive());
		System.out.println("Priority: " + t1.getPriority());
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(Exception e){
			System.out.println(e);
		}

	}

}

class UseThread implements Runnable{

	int count = 0;

	synchronized public void run(){

		while(count != 11){
			count++;
			System.out.println(count);
			try {
				Thread.sleep(100);
			}catch(Exception e){
				System.out.println(e);
			}

//			synchronized (this){
//				System.out.println("Hello");
//			}

		}

	}

}
