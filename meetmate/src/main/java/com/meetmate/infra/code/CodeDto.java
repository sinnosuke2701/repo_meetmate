package com.meetmate.infra.code;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class CodeDto {
	
	private String cdSeq;
	private String cdName;
	private Integer cdUseNY;
	private String cdDesc;
	private Date cdMoDate;
	private Date cdReDate;
	private Integer cdDelNY;
	private String codegroup_cgSeq;
	
	//get set
	public String getCdSeq() {
		return cdSeq;
	}
	public void setCdSeq(String cdSeq) {
		this.cdSeq = cdSeq;
	}
	public String getCdName() {
		return cdName;
	}
	public void setCdName(String cdName) {
		this.cdName = cdName;
	}
	public Integer getCdUseNY() {
		return cdUseNY;
	}
	public void setCdUseNY(Integer cdUseNY) {
		this.cdUseNY = cdUseNY;
	}
	public String getCdDesc() {
		return cdDesc;
	}
	public void setCdDesc(String cdDesc) {
		this.cdDesc = cdDesc;
	}
	public Date getCdMoDate() {
		return cdMoDate;
	}
	public void setCdMoDate(Date cdMoDate) {
		this.cdMoDate = cdMoDate;
	}
	public Date getCdReDate() {
		return cdReDate;
	}
	public void setCdReDate(Date cdReDate) {
		this.cdReDate = cdReDate;
	}
	public Integer getCdDelNY() {
		return cdDelNY;
	}
	public void setCdDelNY(Integer cdDelNY) {
		this.cdDelNY = cdDelNY;
	}
	public String getCodegroup_cgSeq() {
		return codegroup_cgSeq;
	}
	public void setCodegroup_cgSeq(String codegroup_cgSeq) {
		this.codegroup_cgSeq = codegroup_cgSeq;
	}
	
}
