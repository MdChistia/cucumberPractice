package present;

public class Testing 
{
 void huaman (String firstName , String lastName) {
	 String fullName= firstName+lastName;
	 System.out.println("my first name is :" + firstName + "and my last name is : "+ lastName);
 }
 public static void main(String [] arge) {
	 
	 Testing body = new Testing();
	  body.huaman(" Shamim ", "Chistia ");
	  body.huaman(" Munna ", "Rahman");
	  body.huaman(" Summit ", "Chistia");
	  body.huaman(" Masum ", "Billa");
	  body.huaman(" Asfak ", "Rahman");
	  body.huaman(" Amzad", "Hossain");
 }
}
