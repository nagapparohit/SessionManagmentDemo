package dto;

public class User {
	
	private  String fname;
	private String lname;
	private String city;
	private long contact;
	private String email;
	private int age;
	
	public User() {
	
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", city=" + city + ", contact=" + contact + ", email="
				+ email + ", age=" + age + "]";
	}
	
	
	
}
