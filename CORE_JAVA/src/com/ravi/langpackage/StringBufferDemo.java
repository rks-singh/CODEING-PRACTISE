package com.ravi.langpackage;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println("Length :: "+sb.length());
		System.out.println("Capacity :: "+sb.capacity());
		
		StringBuffer sb1 = new StringBuffer("Ravi Singh");
		System.out.println("Length :: "+sb1.length());
		System.out.println("Capacity :: "+sb1.capacity());
		
		System.out.println(sb1.charAt(5));
		sb1.setCharAt(4, '-');
		System.out.println(sb1);
		
		
		StringBuffer sb3 = new StringBuffer();
		sb3.append("The value of PI is ");
		sb3.append("3.14");
		sb3.append(" which is ");
		sb3.append(true);
		System.out.println(sb3);
		
		StringBuffer sb4 = new StringBuffer("Hello");
		sb4.insert(5, " Welcome");
		System.out.println(sb4);
		
		System.out.println(sb4.reverse());
		System.out.println(sb4.capacity());
		sb4.trimToSize();
		System.out.println(sb4.capacity());
		
		sb4.reverse();
		System.out.println(sb4);
		
		sb4.setLength(5);
		System.out.println(sb4);
		
		sb4.deleteCharAt(4);
		System.out.println(sb4);
		
		sb4.delete(1, 4);
		System.out.println(sb4);
		
		System.out.println(sb4.charAt(0));
		sb4.setCharAt(0, 'R');
		System.out.println(sb4);
		
		System.out.println(sb3.capacity());
		sb3.ensureCapacity(80);
		System.out.println(sb3.capacity());
	}

}
