package ca.georgiancollege.assignment01;
import javafx.scene.chart.XYChart;

import java.sql.*;
import java.util.ArrayList;

/* Singleton */
public class DBManager {
    /********************* SINGLETON SECTION *****************************/
    // Step 1. private static instance member variable
    private static DBManager m_instance = null;

    // Step 2. make the default constructor private
    private DBManager() {
    }

    // Step 3. create a public static entry point / instance method
    public static DBManager Instance() {
        // Step 4. Check if the private instance member variable is null
        if (m_instance == null) {
            // Step 5. Instantiate a new DBManager instance
            m_instance = new DBManager();
        }
        return m_instance;
    }

    /*********************************************************************/

    // private instance member variables
    private String m_user = "root";
    private String m_password = "123456";
    private String m_connectURL = "jdbc:mysql://localhost:3306/worldpopulation";


    public ArrayList<ModelTable> readVectorTable()
    {
        // Instantiates an ArrayList collection of type Vector2D (empty container)
        ArrayList<ModelTable> data = new ArrayList<ModelTable>();

        String sql = "SELECT * FROM worldpopulation.city";

        try
                (
                        Connection connection = DriverManager.getConnection(m_connectURL, m_user, m_password);
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql);
                )
        {
            // while there is another record...loop
            while(resultSet.next())
            {
                // deserialize (decode) the data from database table

                String id = resultSet.getString("ID");
                String name = resultSet.getString("name");
                String code = resultSet.getString("code");
                String region = resultSet.getString("region");
                String population = resultSet.getString("population");

                // create an anonymous Vector2D object with the data from the database
                // then add the new Vector2D object to the vectors ArrayList
                data.add( new ModelTable(id,name,code,region,population));
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }

        return data;
    }

}