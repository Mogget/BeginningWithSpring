package pl.Work.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "userData")
public class UserData implements Serializable {

	private static final long serialVersionUID = 1920351139060245633L;
	@Id
	@GeneratedValue
	@Column(name = "User_Id")
	private Long userId;

	@NotEmpty(message = "Name field is mandatory.")
	@Column(name = "First_Name", nullable = true, length = 20)
	private String firstname;

	@NotEmpty
	@Column(name = "Last_Name", nullable = true, length = 20)
	private String lastname;

	@Email
	@NotEmpty
	@Column(name = "Email", nullable = false, length = 20)
	private String email;

	@Past
	@NotNull
	@Column(name = "Date")
	private Date date;

	public UserData() {
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		// SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		this.date = date;
	}

	@Override
	public String toString() {
		return "UserData{" + "userId=" + userId + ", name=" + firstname
				+ ", fullName=" + date + '}';
	}
}
