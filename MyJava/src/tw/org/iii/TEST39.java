package tw.org.iii;

public class TEST39 {

	public static void main(String[] args) {
		sayYa1("A","B","C");
		sayYa2(new String[]{"A","B","C"});
	}
//	static void sayYa(String name){
//		System.out.println("Ya," + name);
//	}
//	static void sayYa(String name1,String name2){
//		System.out.println("Ya," + name1);
//		System.out.println("Ya," + name2);
//	}					
					//ˇ自少要一個参數          //ˇ為不定個數参數
	static void sayYa1(String name1,String...names){ //names已經是字串陣列
		for(String z : names)
		System.out.println("OK" + z);
	}
	static void sayYa2(String[] names){ //names已經是字串陣列
		for(String z : names)
		System.out.println("OK" + z);
	}
}
