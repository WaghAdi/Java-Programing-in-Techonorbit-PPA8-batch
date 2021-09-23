interface Sim
{
   void call();
   void sms();
}
class Airtel implements Sim
{
	int callRate=1;
	int smsRate=2;
	public void call()
	{
		System.out.println("Airtel call rate is "+callRate+"");
		//System.out.println("Airtel call rate is");
	}
	public void sms()
	{
		System.out.println("Airtel sms rate is"+smsRate+"");
		//System.out.println("Airtel sms rate is");
	}
}
class Jio implements Sim
{
	double callRate=0.5;
	double smsRate=1.5;
	public void call()
	{
		System.out.println("JIo call rate is "+this.callRate);
          //System.out.println("jio call rate is");	
	}
	public void sms()
	{
		System.out.println("Jio sms rate is"+this.smsRate);
	    // System.out.println("jio sms rate is");
	}
}

class mobile
{
	void makeCall(Sim simcard)
	{
		simcard.call();
	}
	void sendSms(Sim simcard)
	{
		simcard.sms();
	}
}

class mobileUser
{
	public static void main(String args[])
	{
		mobile apple=new mobile();
		Jio jiocard=new Jio();
		apple.makeCall(jiocard);
		apple.sendSms(jiocard);
		apple.makeCall(new Airtel());
		apple.sendSms(new Airtel());
	}
}