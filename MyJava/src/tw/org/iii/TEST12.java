package tw.org.iii;

public class TEST12 {

	public static void main(String[] args) {
		int[] poker = new int[52];	// 0-51 => 0
		for (int i=0; i<52; i++){
			int temp = (int)(Math.random()*52);
			// �ˬd����
			boolean isRepeat = false;
			for(int j=0; j<i; j++){
				if (poker[j]==temp){
					isRepeat = true;
					break;
				}
			}
			if (!isRepeat){
				poker[i] = temp;
				  System.out.println(poker[i]);
			}else{
				i--;
			}
		}
		
	}

}

		

