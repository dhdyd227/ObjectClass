package com.yedam.generic;

class Tv{
	
}
public class ProductExample {
	public static void main(String[] args) {
		Product<String,Integer> prd1 = new Product<>();
		prd1.setKind("å��");
		prd1.setModel(10);
		
		System.out.println(prd1.getKind()+", "+prd1.getModel());
		
		Product<Tv,String> prd2 = new Product<>();
		prd2.setKind(new Tv());
		prd2.setModel("����ƮTv");
		
		Tv tv = prd2.getKind();
		String str = prd2.getModel()
;	}

}
