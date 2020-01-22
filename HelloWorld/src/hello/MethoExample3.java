package hello;

public class MethoExample3 {
	public static void main(String[] args) {
		//printStar2(9,5);
		//printnumber(9,5);
		//printStar2(6);
		int[] ary = showArray(1,2,3,4,5,6,7);
		
		for(int i=0;i<ary.length;i++)
		System.out.println(ary[i]);
		
		// ==>enhanced for
		for(int a:ary) {
			System.out.println(a);
		}
	
	}
	
	public static int[] showArray(int... arg) {
		int[] ary=new int[arg.length];
		for(int i=0; i<ary.length;i++) {
			ary[i]=i;
		}
		return ary;
	}
	
	public static int[] showArray(int a,int b,int c,int d,int e) {
		int [] copyary= {a,b,c,d,e};
		return copyary; 
	}
	
	public static void printStar2(int rows, int cols) {
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public static void printStar2(int number) {
		for (int i = number; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	
	public static void printnumber(int rows, int cols) {
		int k=1;
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.printf("%3d",k++);
			}
			System.out.println();
		}

	}

}
