package net.missdjoko.recursion;

/**
 * Created by Miss_ on 29.10.2015.
 */
public class Recursion {

    public static final  int [] num= {0,1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int i;

        i=5;

        f.fact(i,num);
        System.out.println("raschet zakonchen");
              

      /* System.out.println("f ot 4 = " + f.fact(4));
        System.out.println("f ot 5 = " + f.fact(5));
        System.out.println("f ot 6 = " + f.fact(6));*/

    }
}
