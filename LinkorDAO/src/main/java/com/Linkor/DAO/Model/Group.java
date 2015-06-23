package com.Linkor.DAO.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Group implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9139423105472403372L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long groupId;
	private String groupName;
	private String groupDesc;
	private Date groupCreatedOn;
	@OneToMany	
	private List<GroupMembers> groupMembers;
	@OneToMany
	private List<Post> post;
		public List<GroupMembers> getGroupMembers() {
		return groupMembers;
	}
	public void setGroupMembers(List<GroupMembers> groupMembers) {
		this.groupMembers = groupMembers;
	}
	public List<Post> getPost() {
		return post;
	}
	public void setPost(List<Post> post) {
		this.post = post;
	}
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupDesc() {
		return groupDesc;
	}
	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}
	public Date getGroupCreatedOn() {
		return groupCreatedOn;
	}
	public void setGroupCreatedOn(Date groupCreatedOn) {
		this.groupCreatedOn = groupCreatedOn;
	}
	
	
	

}
