import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Subject 1: ");
        String m1 = sc.nextLine();

        System.out.print("Enter marks in Subject 2: ");
        String m2 = sc.nextLine();

        System.out.print("Enter marks in Subject 3: ");
        String m3 = sc.nextLine();

        Integer mark1 = Integer.valueOf(m1);
        Integer mark2 = Integer.valueOf(m2);
        Integer mark3 = Integer.valueOf(m3);

        int total = mark1 + mark2 + mark3;

        System.out.println("Total Marks = " + total);

        sc.close();
    }
}