import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class FindingThreeSum{
	public static int FindingThreeSumClosest(int[] nums, int target) {
		int len = nums.length;
		int d = Integer.MAX_VALUE;
		Arrays.sort(nums);
		for(int i = 0; i < len-2; i++){
			if(i > 0 && nums[i-1] == nums[i]) continue;
			int left = i+1; int right=len-1;
			while(left < right){
				int t = target - nums[i] - nums[left] - nums[right];
				if(t == 0) return target;
				else if(t > 0){
					if(Math.abs(t) < Math.abs(d))
						d = t;
					left++;
				} 
				else{
					if(Math.abs(t) < Math.abs(d))
						d = t;
					right--;
				}
			}
		}
		return target - d;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of Elements in the Array: ");
		int n = s.nextInt();
		System.out.print("Enter the Elements: ");
		int[] a = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}

		System.out.print("Enter the target number: ");
		int target = s.nextInt();

		int b = FindingThreeSumClosest(a, target);

		System.out.println(b);


	}
}


