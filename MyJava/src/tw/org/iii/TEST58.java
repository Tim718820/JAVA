package tw.org.iii;

public class TEST58 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");
		MyThread mt2 = new MyThread("B");
		mt1.start();
		mt2.start();
		try {
			Thread.sleep(400);				//讓主執行緒停留0.4秒在印
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		System.out.println("Hello, World");
		
	}

}
class MyThread extends Thread{
	private String name;
	MyThread(String name){this.name=name;}
	@Override
	public void run() {
		for (int i=0;i<10;i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
