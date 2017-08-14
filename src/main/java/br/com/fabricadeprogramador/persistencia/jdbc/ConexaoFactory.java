package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
						
		try {
			//return DriverManager.getConnection("jdbc:sqlserver://localhost:1433/fabricaweb", "Corazza","spfc1935");
			return DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433/fabricaweb", "Corazza" ,"spfc1935");
		} catch (SQLException e) {
			//relançando a exception
			throw new RuntimeException(e);
		}
	}

	
	
}
