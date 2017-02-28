package aula3446.banco.dados.sem.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class GravarSemSpring {

	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/spring";
	private String user = "root";
	private String password = "fatec";
	private Connection connection;
	private Statement statement;

	public static void main(String[] args) {
		new GravarSemSpring();
	}

	public GravarSemSpring() {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String sql = "INSERT INTO pessoa (nome, fone, cidade, cpf) VALUES ('Daniel', '326254626', 'São José dos Campos', '12312321')";
			statement.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "GRAVOU!");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
