package hu.nive.ujratervezes.zarovizsga.dogtypes;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DogTypes {

    public DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<String> getDogsByCountry(String country) {
        List<String> result = new ArrayList<>();
        country.toUpperCase();

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("select name from dog_types where country = ?");
        ) {
            stmt.setString(1, country);
            try (
                    ResultSet rs = stmt.executeQuery();
            ) {
                while (rs.next()) {
                    String name = rs.getString("name").toLowerCase();
                    result.add(name);
                }
                return result;
            }
            } catch (SQLException sqle) {
                throw new IllegalArgumentException("Error by insert", sqle);
            }
        }
    }







