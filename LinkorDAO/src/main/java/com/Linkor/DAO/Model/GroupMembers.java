package com.Linkor.DAO.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class GroupMembers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7228626647116530154L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long groupMemberId;
	@ManyToOne
	private UserDetails user;
	private boolean groupAdmin;
	@ManyToOne
	
	private Group group;
	private boolean status;
	
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public long getGroupMemberId() {
		return groupMemberId;
	}
	public void setGroupMemberId(long groupMemberId) {
		this.groupMemberId = groupMemberId;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	public boolean isGroupAdmin() {
		return groupAdmin;
	}
	public void setGroupAdmin(boolean groupAdmin) {
		this.groupAdmin = groupAdmin;
	}
	

}
