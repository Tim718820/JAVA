package tw.org.iii;
import java.util.Scanner;
public class TEST04 {

	public static void main(String[] args) {
		System.out.print("�п�J�@�ӼƦr:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int count = 0;
		
		
		for(int i = 2;i<=number;i++){
			boolean n = true;
			
			for(int j = 2;j<i;j++)
				if(i%j==0){
					n = false;
					break;
				}
				if(n){	
					System.out.print(i+"\t");
					count++;
					if(count%5==0)
					System.out.println();
					
						
				}
		}
		System.out.print("�@�X��:" + count);
	}

}
