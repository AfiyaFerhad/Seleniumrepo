package week1.d1;

public class Mobile {

	public void makeCall()
	{
		System.out.println("Calling");
	}
	String mobileModel="xiaomi";
	float mobileWeight=100.2f;

	public void sendSms()
	{
		System.out.println("This is my mobile");
	}

	boolean isfullcharged= true;
	int mobileCost=36000;

	public static void main(String[] args) {

		Mobile object=new Mobile();

		object.makeCall();
		object.sendSms();

	}
}