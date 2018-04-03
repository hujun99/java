package algorithm_problem;

import java.util.*;
public class temp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str_FFFF = "FFFF";
		String str_FE80 = "FE80";
		String str_FEC0 = "FE80";
		while(scanner.hasNext()) {
			String str1 = scanner.next();
			if(str1.length() != 39){
				System.out.println("Error");
			}
			try {
			int first = Integer.valueOf(str1.substring(0, 4), 16);
			int second = Integer.valueOf(str1.substring(5, 9), 16);
			int third = Integer.valueOf(str1.substring(10, 14), 16);
			int forth = Integer.valueOf(str1.substring(15, 19), 16);
			int fifth = Integer.valueOf(str1.substring(20, 24), 16);
			int sixth = Integer.valueOf(str1.substring(25, 29), 16);
			int seventh = Integer.valueOf(str1.substring(30, 34), 16);
			int eight = Integer.valueOf(str1.substring(35, 39), 16);
			}catch(Exception e){
			      System.out.println("Error");
			}
		}
//		String str = "FFFF";
//		int i = Integer.valueOf(str, 16);
//		System.out.println(i);
		
	}
}
