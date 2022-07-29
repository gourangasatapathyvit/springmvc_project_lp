package jbr.springmvc.model;

public class newProposal {
	private String firstName;
	private String lastName;
	private String DOB;
	private String email;
	private int contactNumber;
	private String gender;
	private String isConsume;
	private int annualIncome;
	private String policyType;
	private String ageOfInsurance;

	public newProposal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public newProposal(String firstName, String lastName, String dOB, String email, int contactNumber, String gender,
			String isConsume, int annualIncome, String policyType, String ageOfInsurance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		DOB = dOB;
		this.email = email;
		this.contactNumber = contactNumber;
		this.gender = gender;
		this.isConsume = isConsume;
		this.annualIncome = annualIncome;
		this.policyType = policyType;
		this.ageOfInsurance = ageOfInsurance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String isConsume() {
		return isConsume;
	}

	public void setConsume(String isConsume) {
		this.isConsume = isConsume;
	}

	public int getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getAgeOfInsurance() {
		return ageOfInsurance;
	}

	public void setAgeOfInsurance(String ageOfInsurance) {
		this.ageOfInsurance = ageOfInsurance;
	}

	@Override
	public String toString() {
		return "newProposal [firstName=" + firstName + ", lastName=" + lastName + ", DOB=" + DOB + ", email=" + email
				+ ", contactNumber=" + contactNumber + ", gender=" + gender + ", isConsume=" + isConsume
				+ ", annualIncome=" + annualIncome + ", policyType=" + policyType + ", ageOfInsurance=" + ageOfInsurance
				+ "]";
	}

}
