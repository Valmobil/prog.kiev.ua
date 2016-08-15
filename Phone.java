public class Phone {
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	public String getPhOwner() {
		return phOwner;
	}
	public void setPhOwner(String phOwner) {
		this.phOwner = phOwner;
	}
	private String phNumber;
	private String phOwner;
	
	public Phone(String phNumber, String phOwner) {
		super();
		this.phNumber = phNumber;
		this.phOwner = phOwner;
	}
	public Phone() {
		super();
	}
	
	public void pleaseCall(Station officeStation, String toPhoneNum) {
		System.out.print("Phone: Try to call " + toPhoneNum + "... ");
		if (this.phNumber == toPhoneNum) System.out.println("Bip!Bip!Bip! You cannot call on own phone number!");
		if (officeStation.phoneIsCalling(this,toPhoneNum ) != "Calling") {
			System.out.println("Bip!Bip!Bip! No such number registered!");	
		} else {
			System.out.println("Calling... B e e e p!.. B e e e p!.. B e e e p!..");
			try {
			    Thread.sleep(2000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			System.out.println("Please talk to " + toPhoneNum);
		}
	}
	
	@Override
	public String toString() {
		return "Phone [phNumber=" + phNumber + ", phOwner=" + phOwner + "]";
	}
}
