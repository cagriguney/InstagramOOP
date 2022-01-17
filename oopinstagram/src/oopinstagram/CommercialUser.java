package oopinstagram;

public class CommercialUser extends Users {
	
	private String companyName;
	private String contactNumber;
	public CommercialUser(String companyName, String contactNumber) {
		super();
		this.companyName = companyName;
		this.contactNumber = contactNumber;
	}
	public CommercialUser() {
		super();
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
}
