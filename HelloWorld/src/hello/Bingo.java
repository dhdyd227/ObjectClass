package hello;

public class Bingo {
	public static void main(String[] args) {
		int[][] intAry= new int[5][5];
		

		int count=1;
		int i=(intAry.length-1);
		
		for(int j=0;j<=(intAry[i].length-1);j++)
		{
			for(i=(intAry.length-1);i>=0;i--)
			{
				intAry[i][j]=count;
				count++;
			}
			if(i==-1)
				i=0;
		}
		
		for(i=0;i<intAry.length;i++)
		{
			for(int j=0;j<=intAry[i].length-1;j++)
			{
				System.out.println("[" + i + ","+j + "]=>" +intAry[i][j]);
			}
		}
	}

}
