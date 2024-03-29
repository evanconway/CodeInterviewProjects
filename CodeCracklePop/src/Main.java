public class Main {
    public static void main(String[] args) {
        cracklePop();
    }

    /*
    Print out the numbers 1 to 100 (inclusive). If the number is divisible
    by 3, print Crackle instead of the number. If it's divisible by 5, print
    Pop. If it's divisible by both 3 and 5, print CracklePop.
     */
    private static void cracklePop() {
        for (int i = 1; i <= 100; i++) {
            boolean printNum = true;
            if (i%3 == 0) {
                printNum = false;
                System.out.print("Crackle");
            }
            if (i%5 == 0) {
                printNum = false;
                System.out.print("Pop");
            }
            if (printNum) System.out.print(i);
            System.out.println();
        }
    }
}
