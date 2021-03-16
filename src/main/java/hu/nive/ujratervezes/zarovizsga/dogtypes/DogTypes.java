  package hu.nive.ujratervezes.zarovizsga.dogtypes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class DogTypes {

    public DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<String> getDogsByCountry(String country) {
            try (
                    Connection conn = dataSource.getConnection();
                    PreparedStatement stmt = conn.prepareStatement("select * from activities where country = ?");
            ) {
                stmt.setString(1, country);
                List<String> result = selectActivityByPreparedStatement(stmt);
                if (result.size() == 1) {
                    return result;
                }
                throw new IllegalArgumentException("Not found!");

            } catch (SQLException se) {
                throw new IllegalStateException("Cannot select activitiy!", se);
            }
        }




    }
}






