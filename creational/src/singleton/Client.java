package singleton;

public class Client {
    public static void main(String[] args) {
//        when constructor is public
//        DatabaseConnection db1 = new DatabaseConnection();
//        DatabaseConnection db2 = new DatabaseConnection();

        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        EnumDatabaseConnection e1 = EnumDatabaseConnection.INSTANCE;
        EnumDatabaseConnection e2 = EnumDatabaseConnection.INSTANCE;
    }
}
