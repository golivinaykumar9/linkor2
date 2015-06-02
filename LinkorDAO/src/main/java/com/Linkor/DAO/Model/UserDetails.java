package com.Linkor.DAO.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class UserDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6483539651126467719L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userUUID;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userName;
	private String userPassword;
	private long phoneNumber;
	private Date userDateOfBirth;
	private String userStatus;
	private String userGender;
	
	
	@OneToMany(mappedBy="user")
	private List<AddRequestUser> friends;
	@OneToMany(mappedBy="user")
	private List<Address> address;
	@OneToMany(mappedBy="user")
	private List<Education> education;
	
	private Login login;
	private ProfilePic profilePic;
	private ResumeTemplete resumeTemplete;
	@OneToMany(mappedBy="user")
	private List<Working> working;
	@OneToMany(mappedBy="user")
	private List<Post> post;
	
	
	
	
	public List<Post> getPost() {
		return post;
	}
	public void setPost(List<Post> post) {
		this.post = post;
	}

	public List<AddRequestUser> getFriends() {
		return friends;
	}
	public void setFriends(List<AddRequestUser> friends) {
		this.friends = friends;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public List<Education> getEducation() {
		return education;
	}
	public void setEducation(List<Education> education) {
		this.education = education;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public ProfilePic getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(ProfilePic profilePic) {
		this.profilePic = profilePic;
	}
	public ResumeTemplete getResumeTemplete() {
		return resumeTemplete;
	}
	public void setResumeTemplete(ResumeTemplete resumeTemplete) {
		this.resumeTemplete = resumeTemplete;
	}
	public List<Working> getWorking() {
		return working;
	}
	public void setWorking(List<Working> working) {
		this.working = working;
	}
	public long getUserUUID() {
		return userUUID;
	}
	public void setUserUUID(long userUUID) {
		this.userUUID = userUUID;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getUserDateOfBirth() {
		return userDateOfBirth;
	}
	public void setUserDateOfBirth(Date userDateOfBirth) {
		this.userDateOfBirth = userDateOfBirth;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	
	

}
