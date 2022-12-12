import java.io.*;
import java.util.Scanner;


class RomanToInt 
{
	public static int RomanToInt(String str) {
		int nums[] = new int[str.length()];
		for(int i = 0; i < str.length(); i++){
			switch (str.charAt(i)) {
				case 'M':
					nums[i] = 1000;
					break;
				case 'D':
					nums[i] = 500;
					break;
				case 'C':
					nums[i] = 100;
					break;
				case 'L':
					nums[i] = 50;
					break;
				case 'X' :
					nums[i] = 10;
					break;
				case 'V':
					nums[i] = 5;
					break;
				case 'I':
					nums[i] = 1;
					break;
			}
		} 

		int sum = 0;
		for(int i=0; i<nums.length-1; i++){
			if(nums[i] < nums[i+1])
				sum -= nums[i];
			else
				sum += nums[i];
		}

		return sum + nums[nums.length-1];
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String p = s.nextLine();
		int k = RomanToInt(p);
		System.out.println(k);

	}
}
