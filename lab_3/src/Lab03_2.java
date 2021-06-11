public class Lab03_2 {

	public static void main(String[] args) {
		
		int ary2d[][] = new int[5][];
		ary2d[0]=new int[1];
		//{1};
		ary2d[1]=new int[3];
		//{1,2,3};
		ary2d[2]=new int[1];
		//{1};
		ary2d[3]=new int[4];
		//{1,2,3,4};
		ary2d[4]=new int[2];
		//{1,2}};
		
		for(int i=0;i<ary2d.length; i++) {
			for(int j=0;j<ary2d[i].length;j++) {
				ary2d[i][j]=1+j;
			}
		}
		
		for(int i=0; i<ary2d.length;i++) {
			for(int j=0;j<ary2d[i].length;j++) {
				System.out.print(ary2d[i][j] + " ");
			}
			System.out.println();
		}	
	}
}