package com.example.demo;

public class StringPartReverse {
	
	public StringPartReverse() {
		System.out.println(" Parent Const");
	}
	
	public static void main(String[] args) {
		
		String input = "My name is Khan";
		char[] c = input.toCharArray();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();

				
		for(int i=0;i<c.length;i++) {
			sb1.append(c[i]);
			if(c[i]==' ' || i==c.length-1) {
				sb2.append(sb1.reverse());
				sb1 = new StringBuilder();
			}
		}
		
		System.out.println(sb2.reverse().toString());
		
		checkChildConst cn = new checkChildConst();
						
	}

}

class checkChildConst extends StringPartReverse{
	public checkChildConst() {
		System.out.println(" Child Const ");
	}
}

