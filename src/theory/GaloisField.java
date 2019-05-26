package theory;

/**
 * Author: Jiayi Zhao
 * Subject: Advanced Cryptography
 */

public class GaloisField {
    private int n;
    private int[] field;

    public GaloisField() {
        this.n = 2;
        this.field = new int[n];
    }

    /**
     * Class: GaloisField
     * This constructor method builds a GF of degree n.
     * **/
    public GaloisField(int n) {
        this.n = n;
        this.field = new int[n];
    }

    /**
     * Method: additionTable
     * This method shows an addition table for current GF.
     * **/
    public void additionTable() {
        System.out.println("Addition Table for GF("+this.n+")");
        System.out.print("+\t");
        for (int a=0; a<this.n; a++) {
            System.out.print(a+"\t");
        }
        System.out.print("\n");
        for (int a=0; a<this.n; a++) {
            System.out.print(a+"\t");
            for (int b=0; b<this.n; b++) {
                System.out.print(((a+b)%this.n)+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("--END--");
    }

    /**
     * Method: multiplicationTable
     * This method shows a multiplication table for current GF.
     * **/
    public void multiplicationTable() {
        System.out.println("Multiplication Table for GF("+this.n+")");
        System.out.print("*\t");
        for (int a=0; a<this.n; a++) {
            System.out.print(a+"\t");
        }
        System.out.print("\n");
        for (int a=0; a<this.n; a++) {
            System.out.print(a+"\t");
            for (int b=0; b<this.n; b++) {
                System.out.print(((a*b)%this.n)+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("--END--");
    }

    /**
     * Main Method
     * Test the methods here.
     * **/
    public static void main(String[] args) {
        GaloisField galoisField = new GaloisField(9);
        galoisField.additionTable();
        System.out.println();
        galoisField.multiplicationTable();
        System.out.println();
    }
}
