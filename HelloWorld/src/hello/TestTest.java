package hello;

import java.util.Arrays;
import java.util.Comparator;

public class TestTest {
	public static void main(String[] args) {
		int max=0;
		int result=0;
		for(int i=0;i<200;i++) {
			if(i%(3*7)==0) {
				result=(i>max ? i:max);
				//System.out.println(i);
			}
		}
		System.out.println(result);
		
	}
	
	
}
