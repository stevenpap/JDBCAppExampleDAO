package gr.haec.db;

import java.sql.Connection;
import java.sql.SQLException;

import gr.haec.db.dao.Dao;

// Base class Dao implementation - offer the close method
public abstract class BaseDAO<T> implements Dao<T> {

	// Attribute
	protected Connection dbConnection;

	// Constructor
	public BaseDAO(Connection conn) throws SQLException {
		dbConnection = conn;
	}

	public void close() {
		try {
			dbConnection.close();
		} catch (SQLException e) {
			System.out.println("Caught exception while trying to close the dbConnection");
			e.printStackTrace();
		}
	}

}
