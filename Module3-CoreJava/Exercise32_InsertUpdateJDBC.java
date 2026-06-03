import java.sql.*;

public class Exercise32_InsertUpdateJDBC {

    public static void main(String[] args) {

        try {

            Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/studentdb",
                            "root",
                            "root"
                    );

            PreparedStatement insert =

                    con.prepareStatement(

                            "INSERT INTO students VALUES(?,?)"

                    );

            insert.setInt(1,101);

            insert.setString(2,"Vinayak");

            insert.executeUpdate();

            PreparedStatement update =

                    con.prepareStatement(

                            "UPDATE students SET name=? WHERE id=?"

                    );

            update.setString(1,"Vinayak Ojha");

            update.setInt(2,101);

            update.executeUpdate();

            con.close();

        }

        catch(Exception e) {

            System.out.println(e);

        }

    }

}
