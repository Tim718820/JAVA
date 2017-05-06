package tw.org.iii;

public class TEST15 {

	public static void main(String[] args) {
		int[] a ={0,1,2,3,4,5};
		
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		System.out.println("------");
		
		for (int v:a){ //for each
			System.out.println(v);
		}
		
		//exchange:
		int temp = a[2];
		a[2] = a[5];
		a[5] = temp;
		for (int v:a){ //for each
			System.out.println(v);
		}
		System.out.println("------");
		int[][] b = {{1,3,2},{5,7},{1,5,9,5},{4},{8,9}};
		for (int[] v1:b){
			for(int v2:v1){
			System.out.print(v2 + " ");
			}
			System.out.println();
			}
		
		}

}
