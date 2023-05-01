package br.com.unicid.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import br.com.unicid.model.Aluno;
import br.com.unicid.util.ConnectionFactory;

public class AlunoDAO {
	
	//1. Setagem de formato brasileiro de data
	SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
	
	// 2. Inicialização de atributos
		private Aluno aluno;                    // 2.1 Objeto aluno
		private Connection conn;                // 2.2 Conexão com o banco de dados
		private PreparedStatement ps;           //2.3 Permite executar querys SQL
		private ResultSet rs;                   // 2.4 Modo tabela
	
	// 3. Construtor com conexão sql
	public AlunoDAO() throws Exception{
		try {
			conn = ConnectionFactory.getConnection();
		} catch(Exception e) {
			throw new Exception("Erro " + e.getMessage());
		}
	}

	// 4. Metódos
	// 4.1 Salva no BD
	public void salvar(Aluno aluno) throws Exception {
		try {
			String sql="INSERT INTO tbAluno(RGMAluno, NomeAluno, DataAluno, CPFAluno, EmailAluno, EnderecoAluno, "
					+ "MunicipioAluno, UFAluno, CelularAluno, CursoAluno, CampusAluno, PeriodoAluno) +"
					+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			ps = conn.prepareStatement(sql);
			ps.setInt(1, aluno.getRgmAluno());
			ps.setString(2, aluno.getNomeAluno());
			ps.setDate(3, (Date) aluno.getDataAluno());
			ps.setString(4, aluno.getCpfAluno());
			ps.setString(5, aluno.getEmailAluno());
			ps.setString(6, aluno.getEnderecoAluno());
			ps.setString(7, aluno.getMunicipioAluno());
			ps.setString(8, aluno.getUfAluno());
			ps.setString(9, aluno.getCampusAluno());
			ps.setString(10, aluno.getCursoAluno());
			ps.setString(11, aluno.getCampusAluno());
			ps.setString(12, aluno.getPeriodoAluno());
			ps.executeUpdate();
			
		} catch(Exception e) {
			throw new Exception("Erro ao salvar " + e.getMessage());
		}
	}
	
	// 4.2 Altera no BD
	
	public void alterar(Aluno aluno) throws Exception {
		try {
			String sql="UPDATE tbAluno SET NomeAluno=?, DataAluno=?, CPFAluno=?, EmailAluno=?, EnderecoAluno=?, "
					+ "MunicipioAluno=?, UFAluno=?, CelularAluno=?, CursoAluno=?, CampusAluno=?, PeriodoAluno=? WHERE RGMAluno=?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, aluno.getNomeAluno());
			ps.setDate(2, (Date) aluno.getDataAluno());
			ps.setString(3, aluno.getCpfAluno());
			ps.setString(4, aluno.getEmailAluno());
			ps.setString(5, aluno.getEnderecoAluno());
			ps.setString(6, aluno.getMunicipioAluno());
			ps.setString(7, aluno.getUfAluno());
			ps.setString(8, aluno.getCampusAluno());
			ps.setString(9, aluno.getCursoAluno());
			ps.setString(10, aluno.getCampusAluno());
			ps.setString(11, aluno.getPeriodoAluno());
			ps.setInt(12, aluno.getRgmAluno());
			ps.executeUpdate();
			
		} catch(Exception e) {
			throw new Exception("Erro ao salvar " + e.getMessage());
		}
	}
	
	// 4.3 Exclui no BD
	public void excluir(int rgmAluno) throws Exception {
		try {
			String sql="DELETE FROM tbAluno WHERE RGMAluno=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, rgmAluno);
			ps.executeUpdate();
		} catch(Exception e) {
			throw new Exception("Erro ao excluir " + e.getMessage());
		}
	}
	
	// 4.4 Consulta no BD
	public Aluno consultar(int rgmAluno) throws Exception{
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
}

