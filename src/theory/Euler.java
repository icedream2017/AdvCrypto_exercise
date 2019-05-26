package theory;

/**
 * Author: Jiayi Zhao
 * Subject: Advanced Cryptography
 */

public class Euler {

    /**
     * Method: listAllGCDs
     * This method lists all GCDs of (n,m) where 1<=n<m by using Euclidean algorithm.
     * **/
    public static void listAllGCDs(int m) {
        System.out.println("n \tgcd");
        for (int n=1; n<m; n++) {
            System.out.print(n+" \t");
            System.out.println(EuclideanAlgorithm.gcd(n,m));
        }
    }

    /**
     * Method: phi
     * Calculate Euler's phi function.
     * **/
    public static int phi(int n) {
        int result = 1;
        for (int i=2; i<n; i++) {
            if (EuclideanAlgorithm.gcd(i,n)==1) {
                result++;
            }
        }
        return result;
    }

    /**
     * Main Method
     * Test functions here.
     * **/
    public static void main(String[] args) {
        listAllGCDs(28);
        System.out.println("phi of 28 = "+phi(28));
    }
}
