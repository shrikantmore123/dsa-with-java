import java.util.*;

public class arrayDemo {
    public static void main(String args[]) {
        
        int marks[] = new int[50];

        // int numbers[] = {1, 2, 3};

        // System.out.print("Length of Array: " + marks.length); // 50

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics Marks: ");
        marks[0] = sc.nextInt();

        System.out.print("Enter Chemistry Marks: ");
        marks[1] = sc.nextInt();
        
        System.out.print("Enter Maths Marks: ");
        marks[2] = sc.nextInt();

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        // marks[2] = 96;
        marks[2] = marks[2] + 1;
        System.out.println("Updated Marks Maths: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentge: " + percentage + "%");
    }
}