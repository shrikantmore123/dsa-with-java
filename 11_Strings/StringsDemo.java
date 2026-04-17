import java.util.*;

public class StringsDemo {

    public static void printLetters(String str) {
        System.out.println("Character at index:");
        for(int i = 0; i < str.length(); i++) {
        System.out.println("\t" + i + ": " + str.charAt(i));
        }
    }

    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        
        String name;

        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.println("Name: " + name);
        
        // System.out.print("Enter Name: ");
        // name = sc.nextLine();
        // System.out.println("Name:" + name);

        System.out.println("Length: " + name.length());

        // Concatenation
        String id = "123";
        System.out.println("UserId: " + name + " " + id);

        // charAt(index)
        // System.out.println("Character at index 0: " + name.charAt(0));
        printLetters(name);

    }
}