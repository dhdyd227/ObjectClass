package hello;

public class Alphasample {
	public static void main(String[] args) {
		char chr ='A';
		int num = chr;
		
		//System.out.println(chr+ "," +num);
		
		//for(int i=0;i<26;i++)
		//	System.out.println((char)(chr+i) + "," +(num+i));
			
		String[] strAry= {"Hellow","World","Good","Morning"};
		String[] copyAry= new String[strAry.length];
		
		System.arraycopy(strAry,1,copyAry,1,3);
		for(String str:copyAry)
			System.out.println(str);
	
	}

}
