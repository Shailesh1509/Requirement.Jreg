package com.java.mobiliya.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Exam")
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)

	private int exam_id;
	private String position;
	@Temporal(TemporalType.DATE)
	private Date date;
	@ManyToOne
	private RegDTO regdto;
	public int getExam_id() {
		return exam_id;
	}
	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public RegDTO getRegdto() {
		return regdto;
	}
	public void setRegdto(RegDTO regdto) {
		this.regdto = regdto;
	}
	public Exam(int exam_id, String position, Date date, RegDTO regdto) {
		super();
		this.exam_id = exam_id;
		this.position = position;
		this.date = date;
		this.regdto = regdto;
	}
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\n Exam [exam_id=" + exam_id + ", position=" + position + ", date=" + date + ", regdto=" + regdto + "]";
	}

	
}
