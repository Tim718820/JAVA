package tw.org.iii;

public class TEST60 {

	public static void main(String[] args) {
		Brad771 obj1 = new Brad771();
		obj1.setDaemon(true);//主緒結束obj1跟著結束
		obj1.start();
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OK");
	}

}
class Brad771 extends Thread{
	@Override
	public void run() {
		for (int i=0;i<10;i++){
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}
