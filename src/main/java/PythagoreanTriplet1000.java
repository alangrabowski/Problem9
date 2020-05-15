public class PythagoreanTriplet1000 {

    /*
    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.
    */

    public static void main(String[] args) {
        int a, b = 1, c = 1;
        for (a = 1; a <= 998; a++) {
            if (a + b + c != 1000) {
                for (b = 1; b <= 998; b++) {
                    if (a + b + c != 1000) {
                        for (c = 1; c <= 998; c++) {
                            if (a + b + c == 1000) {
                                if (a * a + b * b == c * c) {
                                    System.out.println("Found it! a = " + a + ", b = " + b + ", c = " + c + ". Product of abc is " + a * b * c);
                                    System.exit(0);
                                    //there is only one solution, so the program will stop when it's found
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}