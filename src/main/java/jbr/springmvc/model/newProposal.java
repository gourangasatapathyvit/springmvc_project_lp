package jbr.springmvc.model;

public class newProposal {
	private int id;
	private String firstName;
	private String lastName;
	private String DOB;
	private String email;
	private String contactNumber;
	private String gender;
	private String consume;
	private int annualIncome;
	private String policyType;
	private String ageOfInsurance;
	private String action;

	public newProposal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public newProposal(int id, String firstName, String lastName, String dOB, String email, String contactNumber,
			String gender, String consume, int annualIncome, String policyType, String ageOfInsurance, String action) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		DOB = dOB;
		this.email = email;
		this.contactNumber = contactNumber;
		this.gender = gender;
		this.consume = consume;
		this.annualIncome = annualIncome;
		this.policyType = policyType;
		this.ageOfInsurance = ageOfInsurance;
		this.action = action;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getConsume() {
		return consume;
	}

	public void setConsume(String consume) {
		this.consume = consume;
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
		return "newProposal [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", DOB=" + DOB
				+ ", email=" + email + ", contactNumber=" + contactNumber + ", gender=" + gender + ", consume="
				+ consume + ", annualIncome=" + annualIncome + ", policyType=" + policyType + ", ageOfInsurance="
				+ ageOfInsurance + ", action=" + action + "]";
	}

}
