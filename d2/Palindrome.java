package week1.d2;

public class Palindrome {

	public static void main(String[] args) {
		int a=34343;
		int temp=0;
		int b=a;

		for(int i=0;i<=a+1;i++) {
			temp=(temp*10)+(a%10);
			a=a/10;
		}
		System.out.println(temp);

		if(b==temp)
		{
			System.out.println("Palindrome Number");
		}
		else {

			System.out.println("Not Palindrome Number");
		}
	}

}
