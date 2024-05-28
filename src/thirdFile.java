import java.util.Scanner;

public class thirdFile {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your age:");
//        int age = scanner.nextInt();

//        if (age > 0 & age < 18) {
//            System.out.println("age is " + age + " = Teen");
//        } else if (age >= 18 & age <= 100) {
//            System.out.println("age is " + age + " = Adult");
//        } else {
//            System.out.println("age is " + age + " = Milf");
//        }
//        System.out.println("Type smth: ");
//        String firststring = scanner.nextLine();
//
//        String[] firstArray = firststring.split(" ");
//
//        for (int i = 0; i < firstArray.length; i++) {
//            String firstLetter = firstArray[i].substring(0, 1).toUpperCase();
//            String word = firstArray[i].substring(1);
//            System.out.println(firstLetter.concat(word));
//        }
        //i typed smth in the console
//        System.out.println("Task 1");
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter value: ");
//        String str = scanner.nextLine();
//        String resultStr = str.toUpperCase();
//        char[] result = resultStr.toCharArray();
//        for (int i = 0; i < str.length(); i++) {
//            if (result[i] == ' ') {
//                continue;
//            }
//            System.out.println(result[i]);
//        }
        //task 2
        System.out.println("Task 2");
        System.out.print("Enter another line: ");
        String str2 = scanner.nextLine();
        char[] result2 = str2.toCharArray();
        int spacebuffer = 0;
        if (str2.contains("java")) {
            for (int i = str2.length() - 1; i < str2.length(); i--) {
                if (i < 0) {
                    break;
                }
                System.out.println(result2[i]);
            }
        } else {
            for (int i = 0; i < str2.length(); i++) {
                if (spacebuffer % 2 != 0) {
                    char ch1 = Character.toUpperCase(result2[i]);
                    System.out.print(ch1);
                } else {
                    System.out.print(result2[i]);
                }
                if (result2[i] == ' ') {
                    spacebuffer += 1;
                }
            }
        }
        //task 3
//        System.out.println("Task 3");
//        System.out.print("Enter another line: ");
//        String str3 = scanner.nextLine();
//        char[] result3 = str3.toCharArray();
//        int counter = 0;
//        for (int i = 0; i < str3.length(); i++) {
//            if (result3[i] == ' ') {
//                continue;
//            } else {
//                counter += 1;
//            }
//        }
//        System.out.println("Count of letters: " + counter);
//        //task 4
//        System.out.println("Task 4");
//        String str4 = new String("TestStringPascalCase");
//        char[] result4 = str4.toCharArray();
//        char ch2, ch3 = ' ';
//        for (int i = 0; i < str4.length();i++){
//            ch2 = result4[i];
//            if(ch2 == Character.toUpperCase(ch2) && i!=0) {
//                System.out.print(ch3);
//                System.out.print(result4[i]);
//            } else {
//                System.out.print(result4[i]);
//            }
//        }
    }
}
