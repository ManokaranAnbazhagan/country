package data;

import java.sql.*;
import java.util.HashMap;

public class CountryClient {
    private Connection connection;
    private HashMap<Integer, String> countrymap;

    public CountryClient() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CountryDB", "root", "Mano@2000");
        System.out.println("Successfully connected to DB");
        HashMap<Integer, String> countrymap = new HashMap<>();
        PreparedStatement statement = connection.prepareStatement("select * from country");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            countrymap.put(id, name);

        }
        this.countrymap = countrymap;
    }

    public Connection getConnection() {
        return connection;

    }

    public HashMap<Integer, String> getCountrymap() {
        return countrymap;
    }
}
