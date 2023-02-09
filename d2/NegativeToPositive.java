package week1.d2;

public class NegativeToPositive {

	public static void main(String[] args) {
		int number = -40;

		if (number<0) {
			System.out.println(number + " Negative number");

			int positiveNumber = number*(-1);

			System.out.println("The number " + number + " is converted to " + number*(-1));
		}

	}

}
