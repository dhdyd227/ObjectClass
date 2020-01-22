package hello;

public class ForAndForExample {
	public static void main(String[] args) {
	/*	for(int i=2 ; i<10;i++)
		{
			System.out.println("<<" + i + "´Ü>>");
			for(int j=1;j<10;j++) {
				System.out.println(i + "*" + j + "="+i*j);
			}
		}
		*/
		/*
		int i=2,j=1;
		
		while(true)
		{
			j=1;
			System.out.println("<<" + i + "´Ü>>");
			while(true)
			{
				System.out.println(i + "*" + j + "="+i*j);
				j++;
				if(j==9)
					break;
			}
			i++;
			if(i==10)
				break;
			
		}
		*/
		int sum=0;
		for(int i=1 ; i<11;i=i+2)
		{
			sum +=i;
		}
		System.out.println(sum);
		sum=0;
		for(int i=5 ; i<16;i++)
		{
			sum +=i;
		}
		System.out.println(sum);

	}

}
