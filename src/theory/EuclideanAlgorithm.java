package theory;

/**
 * Author: Jiayi Zhao
 * Subject: Advanced Cryptography
 */

public class EuclideanAlgorithm {
    private int r0;
    private int r1;

    /**
     * Method: gcd
     * Great Common Divisor
     * This method uses Euclidean algorithm to calculate GCD of two numbers.
     * **/
    public static int gcd(int r0, int r1) {
        int rr0=Math.max(r0,r1), rr1=Math.min(r0,r1);
        r0=rr0; r1=rr1;
        int r = r0%r1;
        while (r!=0) {
            r0=r1;
            r1=r;
            r=r0%r1;
        }
        return r1;
    }

    /**
     * Method: ea_gcd
     * Euclidean Algorithm
     * This method prints out table of calculation procedure.
     * **/
    public static void ea_gcd(int r0, int r1) {
        int rr0=Math.max(r0,r1), rr1=Math.min(r0,r1);
        r0=rr0; r1=rr1;
        int r = r0%r1;
        System.out.println("--EA_BEGIN--");
        System.out.println("r0\tr1\tr2");
        while (r!=0) {
            System.out.println(r0+"\t"+r1+"\t"+r);
            r0=r1;
            r1=r;
            r=r0%r1;
        }
        System.out.println("gcd("+rr0+","+rr1+")="+r1);
        System.out.println("--END--");
    }

    /**
     * Method: eea_gcd
     * Extended Euclidean Algorithm
     * This method prints out table of calculation procedure.
     * **/
    public static void eea_gcd(int r0, int r1) {
        int rr0=Math.max(r0,r1), rr1=Math.min(r0,r1);
        r0=rr0; r1=rr1; // force put the bigger number ahead
        int i=2;
        final int I_MAX = 10; // change this limit if overflow
        int q[] = new int[I_MAX];
        int r[] = new int[I_MAX];
        int s[] = new int[I_MAX];
        int t[] = new int[I_MAX];
        r[0]=r0; s[0]=1; t[0]=0;
        r[1]=r1; s[1]=0; t[1]=1;
        System.out.println("--EEA_BEGIN--");
        System.out.println("i \tq \tr \ts \tt");
        System.out.println(0+"\t--\t"+r[0]+"\t"+s[0]+"\t"+t[0]);
        System.out.println(1+"\t--\t"+r[1]+"\t"+s[1]+"\t"+t[1]);
        while (r[i-1]!=0) {
            r[i] = r[i-2] % r[i-1];
            q[i-1] = (r[i-2] - r[i]) / r[i-1];
            s[i] = s[i-2] - q[i-1] * s[i-1];
            t[i] = t[i-2] - q[i-1] * t[i-1];
            System.out.println(i+"\t"+q[i-1]+"\t"+r[i]+"\t"+s[i]+"\t"+t[i]);
            i++;
        }
        System.out.println("gcd("+r0+","+r1+")="+r[i-2]);
        System.out.println("s="+s[i-2]+"; t="+t[i-2]);
        System.out.println("--END--");
    }

    /**
     * Main Method
     * Test the methods here.
     * **/
    public static void main(String[] args) {
//        ea_gcd(973,301);
//        ea_gcd(2010,1404);
        eea_gcd(935,231);
        eea_gcd(3570,2431);
    }
}
