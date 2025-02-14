public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            // This may throw an ArithmeticException
            int z = x / y; 
            System.out.println(z); 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
    }
}