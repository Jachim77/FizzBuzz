public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            double a1 = (double) i / 3;    // i děleno 3mi a na double
            double a2 = (double) i / 5;    // i děleno 5ti a na double
            int b1 = (int) a1;             // převedeno na int
            int b2 = (int) a2;
            double c1 = b1;              // int na double
            double c2 = b2;


            if ((a1 == c1) && (a2 == c2)) {                            // porovnání, jestli pův. číslo bylo celé nebo ne
                System.out.println("FizzBuzz");
            } else if (a1 == c1) {
                System.out.println("Fizz");
            } else if (a2 == b2) {
                System.out.println("Buzz");
            } else System.out.println(i);

        }


    }
}
