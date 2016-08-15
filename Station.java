import java.util.ArrayList;

public class Station {
	private String stName;
	// public String phList[];
	ArrayList<Phone> phoneList = new ArrayList<Phone>();

	public Station(String stName) {
		this.stName = stName;
		// phList = new String[10];
	}

	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String phoneIsCalling(Phone fromPhone, String toPhoneNum) {
		Phone curPhone = phoneExists(toPhoneNum);
		if ( curPhone == null ) {
			return "No such phone";
		} else {
			return "Calling";
		}
	}
	
	private Phone phoneExists(String phone) {
		for ( Phone item : phoneList ) {
			if (item.getPhNumber() == phone) {
				return item;
			}
		}
		return null;
	}

	public void registerPhone(Phone newPhone) {
		System.out.print("Station: Try to registed new phone...");
		if (phoneList.contains(newPhone)) {
			System.out.println(" Error: number " + newPhone.getPhNumber() + " already registerd!");
		} else {
			phoneList.add(newPhone);
			System.out.println("Ok. Plese see current phone list:");
			System.out.println(phoneList.toString());
		}
	}

	@Override
	public String toString() {
		return "Station status: [statinName=" + stName + ", phList=" + phoneList.toString() +  "]";
	}

}
