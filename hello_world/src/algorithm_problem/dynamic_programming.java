package algorithm_problem;

import java.util.*;
public class dynamic_programming {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = Integer.parseInt(scanner.nextLine());
			String str1 = scanner.nextLine();
			String str2 = scanner.nextLine();
			String[] str1_split = str1.split(" ");
			String[] str2_split = str2.split(" ");
			int str1_len = str1_split.length;
			int[] weight = new int[str1_len];
			int[] score = new int[str1_len];
			for(int i=0;i<str1_len;i++) {
				weight[i] = Integer.parseInt(str1_split[i]);
				score[i] = Integer.parseInt(str2_split[i]);
			}
			int h = str1_len + 1;
			int w = n+1;
			int[][] dp = new int[h][w];
			for(int i=0;i<w;i++) {
				dp[0][i] = 0;
			}
			for(int i=0;i<h;i++) {
				dp[i][0] =0;
			}
			for(int i=1;i<h;i++) {
				for(int j=1;j<w;j++) {
					if(j-weight[i-1] >= 0) {
						dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - weight[i - 1]] + score[i-1]);
					}else {
						dp[i][j] = dp[i-1][j];
					}
					//System.out.print(dp[i][j]);
					//System.out.print(" ");
				}
				//System.out.println();
			}
			int i = h - 1;
			int j = w - 1;
			Vector<Integer> vec = new Vector<Integer>();
			while(i>=1 && j>=0) {
				if(dp[i][j] == dp[i - 1][j] ) {					
					i--;
				}else {
					vec.add(i);
					i--;
					j = j - weight[i];
				}
			}
			for(int k=vec.size()-1;k>=0;k--){
				System.out.println(vec.get(k));;
			}
		}
		
	}
}