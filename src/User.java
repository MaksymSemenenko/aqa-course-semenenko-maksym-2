public class User {
    private String id;
    private String email;
    private String name;
    public int age;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void printUser() {
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
