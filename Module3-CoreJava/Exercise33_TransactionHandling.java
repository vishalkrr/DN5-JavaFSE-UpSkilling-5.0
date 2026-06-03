import java.sql.*;

public class Exercise33_TransactionHandling {

    public static void main(String[] args) {

        try {

            Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/bankdb",
                            "root",
                            "root"
                    );

            con.setAutoCommit(false);

            Statement stmt =
                    con.createStatement();

            stmt.executeUpdate(

                    "UPDATE accounts SET balance=balance-500 WHERE id=1"

            );

            stmt.executeUpdate(

                    "UPDATE accounts SET balance=balance+500 WHERE id=2"

            );

            con.commit();

            System.out.println(
                    "Transfer Successful"
            );

            con.close();

        }

        catch(Exception e) {

            System.out.println(
                    "Rollback Executed"
            );

        }

    }

}
