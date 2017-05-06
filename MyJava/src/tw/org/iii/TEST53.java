package tw.org.iii;

import java.util.HashSet;
import java.util.Iterator;

public class TEST53 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		int i1 = 12;
		Integer i2 = new Integer(34);
		set.add(i1); //il = auto-boxing = new Integer(il)
		set.add(i2);
		System.out.println(set);
		System.out.println("-----------------");
//		Iterator it = set.iterator();
//		while (it.hasNext()){
//			Object obj = it.next();
//			Integer i =(Integer)obj;
//			System.out.println(i.floatValue());
		for (Object obj : set){
			System.out.println((Integer)obj);
		}
		
	
	}

}
