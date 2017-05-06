package tw.org.iii;

public class TEST16 {

	public static void main(String[] args) {
		int a = 1,sum=0;
		while(a<=100){
			sum += a++ ;
		}
		System.out.println(sum);
		System.out.println("----------");
		
		for(;a<100;a++){
			sum += a++ ;
		}
		System.out.println(sum);
		
	}

}
