package br.com.unicid.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConnectionFactory {

	public static Connection getConnection() throws Exception{
		// 1. Este programa não trata erros

		try {
			// 2. Função abaixo indica o banco de dados mysql e aponta para o driver
			Class.forName("com.mysql.cj.jdbc.Driver");


			// 3. Conecta com o banco de dados
			String login = "root";
			String senha = "";
			String url = "jdbc:mysql://localhost:3306/DBSistemaAluno";
			return DriverManager.getConnection(url, login, senha);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	// 4. Fecha a conexão de três formas: conn, stmt, rs

	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws Exception {
		close(conn, stmt, rs);
	}

	public static void closeConnection(Connection conn, Statement stmt) throws Exception {
		close(conn, stmt, null);
	}

	public static void closeConnection(Connection conn) throws Exception {
		close(conn, null, null);
	}

	private static void close(Connection conn, Statement stmt, ResultSet rs) throws Exception {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
