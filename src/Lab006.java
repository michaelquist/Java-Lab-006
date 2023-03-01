/**
 * @author Mike Quist
 * @date 02/28/2023
 *
 */

import java.util.Scanner;

public class Lab006 {

    int n;
    int m;
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
        /**
         * @param takes two integers, n and m.
         */
    }

    /**
     * @return true if n/m has no remainder, false if n/m has a remainder.
     */
    public boolean isDivisible() {
        return n % m == 0;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter an integer.");
            int n = (scanner.nextInt());
            System.out.println("Please enter another integer.");
            int m = (scanner.nextInt());
            Lab006 myObj = new Lab006(n, m);
             //This creates a new object instance of class Lab006 and (re)assigns its parameters.

            boolean result = myObj.isDivisible();
            //this defines a variable 'result' of type boolean, with the result of passing myObj to isDivisible.

            System.out.println(n + " is evenly divisible by " + m + "? " + result);
        }
}



