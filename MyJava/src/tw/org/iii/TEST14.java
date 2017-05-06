package tw.org.iii;

import java.util.Arrays;

public class TEST14 {

	public static void main(String[] args) {
		//�~�P
		boolean[] check = new boolean[52];
		int [] poker = new int[52];
		int temp;
		for (int i = 0; i<52; i++){
			do{
				temp = (int)(Math.random()*52);
			}while(check[temp]);
			poker[i] = temp;
			check[temp] = true;
			//System.out.println(temp);
		}
		
		//�o�P
		int[][] player = new int [4][13];
		for (int i=0; i<poker.length;i++){
			player[i%4][i/4] = poker[i];
		}
		//�u�P
		System.out.println("---------------------");
		String[] suits = {"�®�","����","���","����"};
		String[] values = {"A","2","3","4","5","6","7","8","9","10","11","12","13"};
		for (int[] cards:player){
			//�z�P
			Arrays.sort(cards);
			
			for (int card:cards){
				System.out.print(suits[card/13] + values[card%13]+"\t");	
			}
			System.out.println();
		}
	}

}
