public class LogicalOperators {
    public static void main(String args[]) {
        System.out.println("(3 > 2) && (5 > 0) : " + ((3 > 2) && (5 > 0)));
        System.out.println("(3 < 2) && (5 > 0) : " + ((3 < 2) && (5 > 0)));
        System.out.println("(3 > 2) && (5 < 0) : " + ((3 > 2) && (5 < 0)));
        System.out.println("(3 < 2) && (5 < 0) : " + ((3 < 2) && (5 < 0)));

        System.out.println();

        System.out.println("(3 > 2) || (5 > 0) : " + ((3 > 2) || (5 > 0)));
        System.out.println("(3 < 2) || (5 > 0) : " + ((3 < 2) || (5 > 0)));
        System.out.println("(3 > 2) || (5 < 0) : " + ((3 > 2) || (5 < 0)));
        System.out.println("(3 < 2) || (5 < 0) : " + ((3 < 2) || (5 < 0)));

        System.out.println();
        
        System.out.println("!(3 > 2) : " + !(3 > 2));
        System.out.println("!(3 < 2) : " + !(3 < 2));
    }
}