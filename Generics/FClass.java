package Generics;

import java.util.Scanner;

// write your code here for ComplexNum;
class ComplexNum<T extends Number>{
    T r;
    T i;
    ComplexNum( T r,T i){
        this.r=r;
        this.i=i;
    }
    public ComplexNum<Double> add(ComplexNum< ? extends Number> c){
        double real = this.r.doubleValue()+ c.r.doubleValue();
        double imag=this.i.doubleValue() + c.i.doubleValue();
        return new ComplexNum(real, imag);
    }
    public String toString(){
        return ( this.r.doubleValue() +" + " + this.i.doubleValue() + "i");
    }
}

public class FClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        double d1, d2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        d1 = sc.nextDouble();


        d2 = sc.nextDouble();
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);
        ComplexNum<Double> c3 = c1.add(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
    }

}


// Public test case 1:
// Input:
// 6 10
// 10.3 15.6

// Output:
// 6.0 + 10.0i + 10.3 + 15.6i = 16.3 + 25.6i

// Public test case 2:
// Input:
// 10 15
// 5.4 1.6

// Output:
// 10.0 + 15.0i + 5.4 + 1.6i = 15.4 + 16.6i
