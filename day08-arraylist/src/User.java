public class User {
    private String id;
    private String username;
    private String password;

    public User(String id, String username, String user) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String user) {
        this.password = password;
    }
}
