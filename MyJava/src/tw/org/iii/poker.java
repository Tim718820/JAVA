package tw.org.iii;

public class poker {

	public static void main(String[] args) {
		int []a = new int[52];
		int c;boolean isReapt;
		for(int i=0; i<52; i++){
		//ÀË¬d¾÷¨î
		do{
			c = (int)(Math.random()*52);
			isReapt = false;
			for(int j=0; j<i;j++){
				if(a[j]==c){
					isReapt = true;
					break;
				}
			}
		}while(isReapt);
		a[i]=c;
		System.out.println(a[i]);
		
			
		}
	}

}
