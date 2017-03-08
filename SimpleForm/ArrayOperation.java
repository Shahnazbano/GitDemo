package com.learn.myfirstprogram;

public class ArrayOperation {

	public static void main(String[] args) {
		String word = "abcd";
		String reversedString = "";
		/*StringBuffer buff = new StringBuffer();
		StringBuilder buider = new StringBuilder();*/
		for (int i = word.length() - 1; i >= 0; i--) {
			/*buff.append(word.charAt(i));
			buider.append(word.charAt(i));{*/
			reversedString = reversedString+ word.charAt(i);
		}
		//System.out.println(buff.toString());
		System.out.println(reversedString);
		//System.out.println(buider.toString());
	}
}
