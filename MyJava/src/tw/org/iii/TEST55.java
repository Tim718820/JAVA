package tw.org.iii;

import java.util.HashSet;
import java.util.TreeSet;

public class TEST55 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("1");
		set.add("2");
		set.add("12");
		System.out.println(set);
		for(String obj:set){
			System.out.println(obj);
		}
	}

}
