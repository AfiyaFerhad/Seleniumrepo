package week1.d2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int fNum=0;
		int secNum=1;
		int sum;
		System.out.println("Fibonacci series");
		System.out.println(fNum);
		System.out.println(secNum);
		for(int i=0;i<=range;i++) {
			sum=secNum+fNum;
			System.out.println(sum);
			fNum=secNum;
			secNum=sum;
		}
	}
}
