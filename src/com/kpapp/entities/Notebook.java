package com.kpapp.entities;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="NOTEBOOK")
public class Notebook {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name ="QSID")
	private int qsId;
	
	@Column(name ="QUESTIN")
	private String questin;
	
	@Column(name ="ANSWER")
	private String answer;

	

	public Notebook() {
	
	}

	@Override
	public String toString() {
		return "Questin [qs_id=" + qsId + ", questin=" + questin + ", answer=" + answer + "]";
	}

	
	public int getQsId() {
		return qsId;
	}

	public void setQsId(int qsId) {
		this.qsId = qsId;
	}

	public String getQuestin() {
		return questin;
	}

	public void setQuestin(String questin) {
		this.questin = questin;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	} 

}
