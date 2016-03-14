package jdbc.edu;

//STEP 1. Import required packages
import java.sql.*;

public class Main {


	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.getAll();
		System.out.println("Hi");
	}
}
