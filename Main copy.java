  import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("marks in subject1");
        int subject1 = sc.nextInt();
        System.out.println("marks in subject2");
        int subject2 = sc.nextInt();
        System.out.println("marks in subject3");
        int subject3 = sc.nextInt();
        System.out.println("marks in subject4");
        int subject4 = sc.nextInt();
        System.out.println("mark in subject5");
        int subject5 = sc.nextInt();
        System.out.println("the percentage of the student is");
        double percentage = (subject1+subject2+subject3+subject4+subject5)/5;
        System.out.println(percentage);

    }
}