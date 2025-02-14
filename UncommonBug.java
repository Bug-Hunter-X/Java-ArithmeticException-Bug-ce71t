public class UncommonBug {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        
        // This will throw an ArithmeticException
        int z = x / y; 
        System.out.println(z); 
    }
}