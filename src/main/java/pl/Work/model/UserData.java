package pl.Work.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userData")
public class UserData implements Serializable{

	private static final long serialVersionUID = 1920351139060245633L;
	@Id
	@GeneratedValue
	@Column(name = "User_Id")
	private Long userId;
	
	@Column(name = "Name")
	private String firstname;
	
	@Column(name = "Last_name")
	private String lastname;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Telephone")
	private String telephone;

	public UserData(){
	}

	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
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


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	@Override
	public String toString() {
		return "UserData{" + "userId=" + userId + ", name=" + firstname
				+ ", fullName=" + lastname + '}';
	}
}
