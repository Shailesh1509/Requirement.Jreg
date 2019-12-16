package com.java.mobiliya.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "RegDTO")
public class RegDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)

	private Long cid;
	private String cname;
	private String cQualification;
	private float Experience;
	private String skill;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "exam_id")
	private List<Exam> exam;

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getcQualification() {
		return cQualification;
	}

	public void setcQualification(String cQualification) {
		this.cQualification = cQualification;
	}

	public float getExperience() {
		return Experience;
	}

	public void setExperience(float experience) {
		Experience = experience;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public List<Exam> getExam() {
		return exam;
	}

	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}

	public RegDTO(Long cid, String cname, String cQualification, float experience, String skill, List<Exam> exam) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cQualification = cQualification;
		Experience = experience;
		this.skill = skill;
		this.exam = exam;
	}

	public RegDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n RegDTO [cid=" + cid + ", cname=" + cname + ", cQualification=" + cQualification + ", Experience="
				+ Experience + ", skill=" + skill + ", exam=" + exam + "]";
	}

}
