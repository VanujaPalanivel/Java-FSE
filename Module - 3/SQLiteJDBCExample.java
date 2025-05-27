import java.sql.*;
 class SQLiteJDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db"; 
        String query = "SELECT id, name, age FROM students";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("Connected to the database.");
            System.out.println("Student Records:");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + ": " + name + " (Age: " + age + ")");
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
