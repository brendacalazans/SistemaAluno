package br.com.unicid.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import br.com.unicid.model.Boletim;
import br.com.unicid.util.ConnectionFactory;

public class NotaFaltaDAO {
	//1. Setagem de formato brasileiro de data
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

	// 2. Inicialização de atributos
	private Boletim boletim;                // 2.1 Objeto boletim
	private Connection conn;                // 2.2 Conexão com o banco de dados
	private PreparedStatement ps;           //2.3 Permite executar querys SQL
	private ResultSet rs;                   // 2.4 Modo tabela

	// 3. Construtor com conexão sql
	public NotaFaltaDAO() throws Exception {
		try {
			conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("Erro: " + e.getMessage());
		}
	}

	// 4. Métodos
	// 4.1 Salva Boletim no BD
	public void salvar(Boletim boletim) throws Exception {
		try {
			String sql = "INSERT INTO tbBoletim (RGMAluno, Disciplina, Semestre, Nota, Falta) VALUES (?,?,?,?,?)";

			ps = conn.prepareStatement(sql);
			ps.setInt(1, boletim.getRgmAluno());
			ps.setString(2, boletim.getDisciplina());
			ps.setInt(3, boletim.getSemestre());
			ps.setDouble(4, boletim.getNota());
			ps.setInt(5, boletim.getFalta());
			ps.executeUpdate();

		} catch (Exception e) {
			throw new Exception("Erro ao salvar: " + e.getMessage());
		}
	}

	// 4.2 Altera Boletim no BD
	public void alterar(Boletim boletim) throws Exception {
		try {
			String sql = "UPDATE tbBoletim SET Disciplina=?, Semestre=?, Nota=?, Falta=? WHERE RGMAluno=?";

			ps = conn.prepareStatement(sql);
			ps.setString(1, boletim.getDisciplina());
			ps.setInt(2, boletim.getSemestre());
			ps.setDouble(3, boletim.getNota());
			ps.setInt(4, boletim.getFalta());
			ps.setInt(5, boletim.getRgmAluno());
			ps.executeUpdate();

		} catch (Exception e) {
			throw new Exception("Erro ao alterar: " + e.getMessage());
		}
	}

	// 4.3 Exclui Boletim no BD
	public void excluir(int rgmAluno) throws Exception {
		try {
			String sql = "DELETE FROM tbBoletim WHERE RGMAluno=?";

			ps = conn.prepareStatement(sql);
			ps.setInt(1, rgmAluno);
			ps.executeUpdate();

		} catch (Exception e) {
			throw new Exception("Erro ao excluir: " + e.getMessage());
		}
	}

	// 4.4 Consulta Boletim no BD
	public Boletim consultar(int rgmAluno) throws Exception {
		try {
			ps = conn.prepareStatement("SELECT * FROM tbBoletim WHERE RGMAluno=?");
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

		} catch (Exception e) {
			throw new Exception("Erro ao consultar: " + e.getMessage());
		}
	}
	
	public List<Boletim> listarNota() throws Exception {
		List<Boletim> lista = new ArrayList<Boletim>();
		try {
			ps = conn.prepareStatement("SELECT * FROM tbBoletim");
			rs = ps.executeQuery();
			while (rs.next()) {
				int rgmAluno = rs.getInt("RGMAluno");
				String disciplina = rs.getString("Disciplina");
				int semestre = rs.getInt("Semestre");
				Double nota = rs.getDouble("nota");
				int falta = rs.getInt("falta");
				Boletim notafalta = new Boletim(rgmAluno, disciplina, semestre, nota, falta);
				lista.add(notafalta);
			}
			return lista;
		} catch (Exception e5) {
			throw new Exception("Erro ao listar notas: " + e5.getMessage());
		}
	}
}
