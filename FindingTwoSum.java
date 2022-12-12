import java.util.Scanner;
import java.io.*;

class FindingTwoSum
{
	public static int[] FindingTwoSum(int[] n, int t) {
		int[] ans = new int[2];

		for (int i = 0; i < n.length-1; ++i) {
			for (int j = i + 1; j < n.length; ++j) {
				if (n[i] + n[j] == t) {
					ans[0] = i;
					ans[1] = j;
					break;
				}
			}
		}

		return ans;
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

		int[] b = FindingTwoSum(a, target);

		for(int i =0; i<b.length;i++)
		{
			System.out.print(b[i]+ " ");
		}
		System.out.println();


	}
}



