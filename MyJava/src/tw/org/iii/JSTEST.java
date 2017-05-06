package tw.org.iii;

public class JSTEST {

	public static void main(String[] args) {
		int [][] a ={{1,1,1,2,3,1,2,1},{0,0,0,1,2,3,1,2},
				{2,0,1,1,3,0,1,1},{2,2,1,2,1,1,0,0}};
		for(int i=0; i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
			System.out.println(a[i][j]);
		}
	}

}
