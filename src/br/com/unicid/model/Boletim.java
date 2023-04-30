package br.com.unicid.model;

public class Boletim {

	// 1. Atributos relacionados ao boletim
	
	private int rgmAluno;
	private String disciplina;
	private int semestre;
	private double nota;
	private int falta;
	
	// 2. Construtores com sobrecarga e com parâmetros
	
	public Boletim() {
	}

	public Boletim(int rgmAluno, String disciplina, int semestre, double nota, int falta) {
		super();
		this.rgmAluno = rgmAluno;
		this.disciplina = disciplina;
		this.semestre = semestre;
		this.nota = nota;
		this.falta = falta;
	}

	// 3. Getters and Setters
	
	public int getRgmAluno() {
		return rgmAluno;
	}

	public void setRgmAluno(int rgmAluno) {
		this.rgmAluno = rgmAluno;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getFalta() {
		return falta;
	}

	public void setFalta(int falta) {
		this.falta = falta;
	}
}
