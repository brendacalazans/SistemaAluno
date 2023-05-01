package br.com.unicid.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import br.com.unicid.model.Aluno;
import br.com.unicid.model.Boletim;
import br.com.unicid.util.ConnectionFactory;

public class BoletimDAO {

	//1. Setagem de formato brasileiro de data
	SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

	// 2. Inicialização de atributos
	private Aluno aluno;                    // 2.1 Objeto aluno
	private Boletim boletim;                // 2.2 Objeto boletim
	private Connection conn;                // 2.3 Conexão com o banco de dados
	private PreparedStatement ps;           //2.4 Permite executar querys SQL
	private ResultSet rs;                   // 2.5 Modo tabela
	
	// 3. Construtor com conexão sql
	public BoletimDAO() throws Exception {
		try {
			conn = ConnectionFactory.getConnection();
		} catch (Exception e1) {
			throw new Exception("Erro " + e1.getMessage());
		}
	}

	// 4. Métodos
	// 4.1 Consulta aluno no BD
	public Aluno consultarAluno(int rgmAluno) throws Exception{
		try {
			ps = conn.prepareStatement("SELECT * FROM tbAluno WHERE RGMAluno=?");
			ps.setInt(1, rgmAluno);
			rs = ps.executeQuery();
			if(rs.next()) { 
				String nomeAluno = rs.getString("NomeAluno");
				String dataAluno = rs.getString("DataAluno");
				String cpfAluno = rs.getString("CPFAluno");
				String emailAluno = rs.getString("EmailAluno");
				String enderecoAluno = rs.getString("EnderecoAluno");
				String municipioAluno = rs.getString("MunicipioAluno");
				String ufAluno = rs.getString("UFAluno");
				String celularAluno = rs.getString("CelularAluno");
				String cursoAluno = rs.getString("CursoAluno");
				String campusAluno = rs.getString("CampusAluno");
				String periodoAluno = rs.getString("PeriodoAluno");

				aluno = new Aluno(rgmAluno, nomeAluno, fmt.parse(dataAluno), cpfAluno, emailAluno, enderecoAluno, municipioAluno, 
						ufAluno, celularAluno, cursoAluno, campusAluno, periodoAluno);
			}
			return aluno;

		} catch(Exception e) {
			throw new Exception("Erro ao listar " + e.getMessage());
		}
	}

	// 4.2 Consulta boletim no BD
	public Boletim consultarNota(int rgmAluno) throws Exception {
		try {
			ps = conn.prepareStatement("SELECT * FROM tbnotafalta WHERE RGMAluno=?");
			ps.setInt(1, rgmAluno);
			rs = ps.executeQuery();
			if (rs.next()) {
				String disciplina = rs.getString("disciplina");
				int semestre = rs.getInt("semestre");
				double nota = rs.getDouble("nota");
				int falta = rs.getInt("falta");
				boletim = new Boletim(rgmAluno, disciplina, semestre, nota, falta);
			}
			return boletim;

		} catch (Exception e3) {
			throw new Exception("Erro ao consultar " + e3.getMessage());
		}
	}

	// 4.3 Listar boletim do BD
	public List<Boletim> listarBoletim(int rgmAluno) throws Exception {
		List<Boletim> lista = new ArrayList<Boletim>();

		try {
			ps = conn.prepareStatement("SELECT * FROM tbnotafalta WHERE RGMAluno=?");
			ps.setInt(1, rgmAluno);
			rs = ps.executeQuery();

			while (rs.next()) {
				String disciplina = rs.getString("disciplina");
				int semestre = rs.getInt("semestre");
				double nota = rs.getDouble("nota");
				int falta = rs.getInt("falta");
				boletim = new Boletim(rgmAluno, disciplina, semestre, nota, falta);
				lista.add(boletim);
			}
			return lista;
		} catch (Exception e4) {
			throw new Exception("Erro ao listar " + e4.getMessage());
		}
	}
}
