package tw.org.iii;

import javax.swing.JOptionPane;

/*
 * Program: Guess Number game
 */
public class TEST18 {
	
	public static void main(String[] args) {
		// 1. Create Answer
		String answer = createAnswer(3);
		System.out.println(answer);
		
		// 2. Start
		boolean isWinner = false;
		for (int i=0; i<10; i++){
			// 2-1. input a number string
			String guess = JOptionPane.showInputDialog("²q¤@­Ó¼Æ¦r");
			
			// 2-2. compare string => result
			String result = checkAB(answer, guess); 
			JOptionPane.showMessageDialog(null, result);
			if (result.equals("3A0B")){
				isWinner = true;
				break;
				
			}
			// 2-3. WINNER -> break
			// 2-4. repeat 10 times > LOSSER
		}
		
		// 3. show ..... / .... 
		if(isWinner){
			System.out.println("WIN");
		}
	}
	
	// method: checkAB(answer, guess) => ?A?B 
	static String checkAB(String a, String g){
		int A, B; A = B = 0;
		for (int i=0;i<g.length();i++){
			if(g.charAt(i) == a.charAt(i)){
				A++;
			}else if(a.indexOf(g.charAt(i))!=-1){
				B++;
			}
		}
		return A + "A" + B + "B";
	}
	
	
	// method: create a answer
	static String createAnswer(int d){
		// ¬~µP
		boolean[] check = new boolean[10];	// 0 - 9: false
		int[] poker = new int[d]; // 0-2: 0
		int temp; int counter=0;
		for (int i=0; i<poker.length; i++){
			do{
				temp = (int)(Math.random()*10);
				counter++;
			}while (check[temp]);
			poker[i] = temp;
			check[temp] = true;
		}
		String ret = "";
		for(int v:poker) ret += v;
		
		return ret;
	}
}