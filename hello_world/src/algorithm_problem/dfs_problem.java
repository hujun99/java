package algorithm_problem;

import java.util.Scanner;

public class dfs_problem {
	private static int count = 0;
	private static int n = 0;
	private static int total = 0;
	public static void main(String[] args) {
		System.out.println("dfs_problem");
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()){
			count = 0;
			n = scanner.nextInt();
			total = scanner.nextInt();
			int[] nums = new int[n];
			long sum = 0;
			for (int i = 0; i < n; i++) {
				nums[i] = scanner.nextInt();
				sum += nums[i];
			}
			if (sum <= total){
				System.out.println((int)Math.pow(2, n));
			} else{
				dfs(0, 0, nums);
				System.out.println(count + 1);
				}
			}
	}

private static void dfs(long sum, int cur, int[] nums) {
		if (cur < n) {
			if (sum > total) {
				return;
			}
			//             不添加这件零�?
			dfs(sum, cur + 1, nums);
			//             当前这种添加方式合理,添加这件零食
			if (sum + nums[cur] <= total) {
				count++;
				dfs(sum + nums[cur], cur + 1, nums);
			}
		}
	}
}