package br.com.unicid.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
	
	// 1. Atributos dos futuros objetos aluno
	private int rgmAluno;
	private String nomeAluno;
	private Date dataAluno;
	private String cpfAluno;
	private String emailAluno;
	private String enderecoAluno;
	private String municipioAluno;
	private String ufAluno;
	private String celularAluno;
	private String cursoAluno;
	private String campusAluno;
	private String periodoAluno;
	
	// 2. Construtores com sobrecarga e com parâmetros
	public Aluno() {
	}

	public Aluno(int rgmAluno, String nomeAluno, Date dataAluno, String cpfAluno, String emailAluno, String enderecoAluno,
			String municipioAluno, String ufAluno, String celularAluno, String cursoAluno, String campusAluno, String periodoAluno) {
		this.rgmAluno = rgmAluno;
		this.nomeAluno = nomeAluno;
		this.dataAluno = dataAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
		this.enderecoAluno = enderecoAluno;
		this.municipioAluno = municipioAluno;
		this.ufAluno = ufAluno;
		this.celularAluno = celularAluno;
		this.cursoAluno = cursoAluno;
		this.campusAluno = campusAluno;
		this.periodoAluno = periodoAluno;
	}
	
	// 3. Getters & Setters

	public int getRgmAluno() {
		return rgmAluno;
	}

	public void setRgmAluno(int rgmAluno) {
		this.rgmAluno = rgmAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public Date getDataAluno() {
		java.sql.Date sqlDate = new java.sql.Date(dataAluno.getTime());
		return sqlDate;
	}

	public void setDataAluno(String dataAluno) throws ParseException {
		this.dataAluno =  new SimpleDateFormat("dd/MM/yyyy").parse(dataAluno);
	}

	public String getCpfAluno() {
		return cpfAluno;
	}

	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}

	public String getEnderecoAluno() {
		return enderecoAluno;
	}

	public void setEnderecoAluno(String enderecoAluno) {
		this.enderecoAluno = enderecoAluno;
	}

	public String getMunicipioAluno() {
		return municipioAluno;
	}

	public void setMunicipioAluno(String municipioAluno) {
		this.municipioAluno = municipioAluno;
	}
	
	public String getUfAluno() {
		return ufAluno;
	}

	public void setUfAluno(String ufAluno) {
		this.ufAluno = ufAluno;
	}

	public String getCelularAluno() {
		return celularAluno;
	}

	public void setCelularAluno(String celularAluno) {
		this.celularAluno = celularAluno;
	}

	public String getCursoAluno() {
		return cursoAluno;
	}

	public void setCursoAluno(String cursoAluno) {
		this.cursoAluno = cursoAluno;
	}

	public String getCampusAluno() {
		return campusAluno;
	}

	public void setCampusAluno(String campusAluno) {
		this.campusAluno = campusAluno;
	}

	public String getPeriodoAluno() {
		return periodoAluno;
	}

	public void setPeriodoAluno(String periodoAluno) {
		this.periodoAluno = periodoAluno;
	}	
}
