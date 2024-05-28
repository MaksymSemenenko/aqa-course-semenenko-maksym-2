import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerline = new Scanner(System.in);
        Scanner scannerint = new Scanner(System.in);

        User user = new User("maksym@gmail.com", "qwerty");
        user.setName("Maksym");
        user.printUser();

        Manager manager = new Manager("manager@gmail.com", "qwerty");
        manager.setJob(scannerline.nextLine());
        manager.printUser();
        manager.work();

        Manager manager1 = new Manager();
        manager1.setName(scannerline.nextLine());
        manager1.printUser();

        Manager manager2 = new Manager(scannerint.nextInt());
        manager2.printUser();

        manager1.deligate(user);
    }
}
