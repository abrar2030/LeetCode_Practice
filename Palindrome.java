import java.util.Scanner;
import java.io.*;

class Palindrome{

	static boolean FindingPalindrome(int n)
	{
		int r = 0;
		int temp = n;
		while (temp != 0) {
			r = (r * 10) + (temp % 10);
			temp = temp / 10;
		}
		return (r == n); 
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (FindingPalindrome(n) == true) {
			System.out.println("Yes, it is a Palindrome.");
		}
		else {
			System.out.println("No, it is not a Palindrome.");
		}
	}
}


