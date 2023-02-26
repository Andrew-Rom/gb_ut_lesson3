package seminars.third.tdd;


public class User {

    public String name;
    public String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean isAuthenticate(String login, String pass) {
        return (login.equals(this.name) && pass.equals(this.password));
    }
}
