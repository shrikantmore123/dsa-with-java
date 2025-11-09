public class InvertedHalfPyramidNumbers {

    public static void inverted__half_pyramid_numbers(int n) {
        // Outer Loop
        for(int i = 1; i <= n; i++) {

            // Innner Loop - Numbers
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print(j+ " ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        inverted__half_pyramid_numbers(5);
    }
}