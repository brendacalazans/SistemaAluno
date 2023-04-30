package br.com.unicid.util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

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
}
