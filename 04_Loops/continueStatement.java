public class continueStatement {
    public static void main(String args[]) {
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                System.out.println("Continue Statement Executed");
                continue;
            }

            System.out.println(i);
        }
    }
}