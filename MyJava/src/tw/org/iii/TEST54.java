package tw.org.iii;

import java.util.HashSet;
import java.util.TreeSet;

public class TEST54 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		while (set.size()<6){
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set);
		
		
	}

}
