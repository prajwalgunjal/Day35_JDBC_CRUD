package AddressBook;
import java.sql.*;
public class AddressBookMain {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/addressBook";
        String USER = "root";
        String PASS = "root";
        Connection con;
        try {
            System.out.println("Connecting to database: "+DB_URL);
            try {
                con = DriverManager.getConnection(DB_URL,USER,PASS);
//                Statement stmt = null;
//                stmt= con.createStatement();
//            int count = stmt.executeUpdate("insert into addressBook(first_name,last_name,address_book_name,type,address,city,state,zip,phone_number,email) values(\"vikas\",\"patil\",\"bcd\",\"Friend\",\"pune\",\"pune\",\"Maharashtra\",423134,234323,\"hajare11@gmail.com\")");
//                System.out.println(count);
//                stmt = con.prepareStatement("alter table addressBook where first_name =? set last_name=?");
//                stmt.setString(1,"jagu");
//                stmt.setString(2,"jagruti");
//                ************************************ uc 3 ***************************************
//                PreparedStatement stmt = con.prepareStatement("UPDATE addressBook SET last_name=? WHERE first_name=?");
//                ************************************** uc4 ****************************************
//                PreparedStatement stmt = con.prepareStatement("Delete from addressBook WHERE first_name=?");
//                stmt.setString(1,"jagruti");
//                **************************************** uc8 ***************************************
//                PreparedStatement stmt = con.prepareStatement("select * from addressBook where first_name =?");
//                PreparedStatement stmt = con.prepareStatement("select first_name,phone_number from addressBook where city =?"); // uc 9
//                stmt.setString(1,"pune");
////                int count = stmt.executeUpdate();
//                ResultSet rs = stmt.executeQuery();
//                Statement stmt2 = con.createStatement();
//                while (rs.next()){
//                    System.out.print(" first_name: " + rs.getString("first_name"));
//
//                    System.out.print(", phone_number: " + rs.getString("phone_number"));
//                    System.out.println();
//
//                }
                PreparedStatement stmt = con.prepareStatement("select * from addressBook where city =?");
                stmt.setString(1,"pune");
                int count = stmt.executeUpdate();
//                ResultSet rs = stmt.executeQuery();
                Statement stmt2 = con.createStatement();
                ResultSet rs = stmt2.executeQuery("select * from addressBook");
                System.out.println(count);
                    while (rs.next()) {
                        System.out.print(" first_name: " + rs.getString("first_name"));
                        System.out.print(", last_name: " + rs.getString("last_name"));
                        System.out.print(", address_book_name: " + rs.getString("address_book_name"));
                        System.out.print(", type: " + rs.getString("type"));
                        System.out.print(", address: " + rs.getString("address"));
                        System.out.print(", address: " + rs.getString("address"));
                        System.out.print(", city: " + rs.   getString("city"));
                        System.out.print(", state: " + rs.getString("state"));
                        System.out.print(", zip: " + rs.getInt("zip"));
                        System.out.print(", phone_number: " + rs.getString("phone_number"));
                        System.out.print(", email: " + rs.getString("email"));
                        System.out.println();
                    }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Connection is successful!!!! "+con);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
