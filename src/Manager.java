public class Manager extends User{
    private String job;

    public Manager(String email, String password){
        super(email, password);
    }
    public Manager(){
        super("email@amdf.com","qwerty321");
    }

    public Manager(int age){
        super("email@amdf.com","qwerty321");
        this.age = age;
    }
    public void work(){
        System.out.println("Manager is working: " + job);
    }

    @Override
    public void printUser() {
        System.out.println(super.toString() + this.toString());
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void deligate(User user) {
        System.out.println(user.toString() + " Deligated by: " + this.getName());
    }

    public void deligate(User user, User user2) {
        System.out.println(user.toString() + " and " + user2.toString() + " Deligated by: " + this.getName());
    }

    public void deligate(User user, String username) {
        System.out.println(user.toString() + " and " + username + " Deligated by: " + this.getName());
    }

    @Override
    public String toString() {
        return "Manager{" +
                "job='" + job + '\'' +
                '}';
    }
}
