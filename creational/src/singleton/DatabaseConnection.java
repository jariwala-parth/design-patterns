package singleton;

public class DatabaseConnection {

    private static DatabaseConnection INSTANCE = null;

    private DatabaseConnection() {
    }

    // Two-way locking mechanism
    public static DatabaseConnection getInstance() {
        if (INSTANCE == null) {
            synchronized (DatabaseConnection.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DatabaseConnection();
                }
            }
        }
        return INSTANCE;
    }
}


// IMPLEMENTATION:

//    private static DatabaseConnection INSTANCE = null;
//    private DatabaseConnection() {}
//
//    public static DatabaseConnection getInstance() {
//        if (INSTANCE == null) {
//            INSTANCE = new DatabaseConnection();
//        }
//        return INSTANCE;
//    }

//ISSUE:
// Thread 1, Thread 2 => both goes to
// if (INSTANCE == null) at same time -> two threads will be created.

// Solution 1:
// synchronize method -> public static synchronized DatabaseConnection getInstance()

// Solution 2:
//    public static DatabaseConnection getInstance() {
//      synchronized (INSTANCE) {
//        if (INSTANCE == null) {
//          INSTANCE = new DatabaseConnection();
//        }
//        return INSTANCE;
//        }
//    }

// ISSUE
//-> Serialization and Deserialization


//BEST WAY TO IMPLEMENT:
//
//SEE MAIN CODE in EnumDatabaseConnection





