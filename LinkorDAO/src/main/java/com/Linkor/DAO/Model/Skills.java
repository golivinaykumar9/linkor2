package com.Linkor.DAO.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3485118014647244915L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long skillUUID;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long skillID;
	private String skillName;
	private String skillDesc;
	public long getSkillUUID() {
		return skillUUID;
	}
	public void setSkillUUID(long skillUUID) {
		this.skillUUID = skillUUID;
	}
	public long getSkillID() {
		return skillID;
	}
	public void setSkillID(long skillID) {
		this.skillID = skillID;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSkillDesc() {
		return skillDesc;
	}
	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}
	
	

}
