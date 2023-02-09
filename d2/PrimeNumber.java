package week1.d2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=13;
		boolean isPrime =false;
		for (int i=2;i<=num%2;i++) 
		{
			if (num%i==0)
			{
				isPrime=true;
				break;

			}
		}
		if(isPrime==false) 

			System.out.println("It is a Prime Number");

		else 

			System.out.println("It is not a Prime Number");


	}
}

