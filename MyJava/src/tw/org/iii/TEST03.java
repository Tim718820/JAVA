package tw.org.iii;
import java.util.Scanner;
public class TEST03 {

	public static void main(String[] args) {
		System.out.println("輸入時間:");
		int startH,startM,endH,endM,time;
		Scanner scanner = new Scanner(System.in);
		startH = scanner.nextInt();
        startM = scanner.nextInt();
        endH = scanner.nextInt();
        endM = scanner.nextInt();
        time = ((endH*60)+endM)-((startH*60)+startM);
        fe(time);
	}
        static void fe(int time) {
		int fee;
		if(time>=240) {
			fee = 280 + ((time-240)/30)*60;
			System.out.println("總停車費為："+fee);
		    }
		else if(time<240 && time>=120) {
			fee = 120 + ((time-120)/30)*40;
			System.out.println("總停車費為："+fee);
			}
		else if(time<120) {
			fee = (time/30)*30;
			System.out.println("總停車費為："+fee);
			
        }
	}
}
