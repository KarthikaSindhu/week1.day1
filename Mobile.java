package week1.day1;

public class Mobile {
	int Number =2123456;
	short screenCount=1;
	long imeiNumber=1234562654L;
	float screenLenght= 6.5F;
	char chargerType='C';
	String mobileName= "Motorola";
	
	public void sendMsg ()
	{
		System.out.println("Special Message :" + "You have won 3000000Rs");
	}
	private int makeCall()
	{
		int numberOfCalls =12;
		return (numberOfCalls);
	}
	void saveContact(String mobileName)
	{
		System.out.println(mobileName);
	}

	public static void main(String[] args) {
				
		Mobile o = new Mobile();
		o.sendMsg();
		int V = o.makeCall();
		System.out.println("Number of missed calls :" + V);
		System.out.println("Mobile Model Name :"  + o.mobileName);
			}
}
