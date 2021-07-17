
public class Member {
	
	private String firstname,lastname,email,password,C1,gender,cities;

	
	public Member() {
		super();
	}

	public Member(String firstname, String lastname, String email, String password, String c1, String gender,
			String cities) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		C1 = c1;
		this.gender = gender;
		this.cities = cities;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getC1() {
		return C1;
	}

	public void setC1(String c1) {
		C1 = c1;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCities() {
		return cities;
	}

	public void setCities(String cities) {
		this.cities = cities;
	}
	

}
