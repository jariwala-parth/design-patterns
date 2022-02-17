package singleton;

public enum EnumDatabaseConnection {
    INSTANCE;

    private final String dbURL = "https://thisisURL.com";

    public String getDatabaseUrl() {
        return dbURL;
    }
}

// Advantage of ENUM
// Serializable and Thread Safe

// Disadvantage:
// It will create one object even if not needed.
// In static function approach, the single object will be created on first call, here it will be created on start of application.