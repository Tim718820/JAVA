package tw.org.iii;

public class TEST38 {

	public static void main(String[] args) {
		int[] x = {1,2,3};
		int y[] = {4,5,6};
		new TEST38().go(x,y);
	}
	void go(int[] ... z){
		//int = int[] []={{1,2,3},{4,5,6}}
		for(int[] a : z)
			System.out.print(a[0]);
		
	}

}
