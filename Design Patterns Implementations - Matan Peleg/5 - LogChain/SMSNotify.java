import java.util.ArrayList;
import java.util.List;

public class SMSNotify {
	List<String> registeredPhoneNumbers = new ArrayList<String>();
	
	public SMSNotify()
	{}
	
	public void RegisterPhoneNumber(String phoneNumber)
	{
		registeredPhoneNumbers.add(phoneNumber);
	}
	
	public void SendSMS(String log)
	{
		for (String phone : registeredPhoneNumbers)
		{
			System.out.println("Sending SMS : \"" + log + "\" to " + phone);
		}
	}
}
