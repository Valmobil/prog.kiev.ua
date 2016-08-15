
public class Lesson01_ATC {

	public static void main(String[] args) {
		// Define cople of Phones
		// Register to Station
		// Call to each other
		Station officeStation = new Station("Office");
		Phone myPhone = new Phone("0504443322","My");

		
		officeStation.registerPhone(myPhone);
		officeStation.registerPhone(myPhone);

		System.out.println(officeStation.toString());
		myPhone.pleaseCall(officeStation, "0683334455");
		myPhone.pleaseCall(officeStation, "0504443322");
		
		Phone myWifePhone = new Phone("0683334455","MyWife");
		officeStation.registerPhone(myWifePhone);
		myPhone.pleaseCall(officeStation, "0683334455");
	}
}
