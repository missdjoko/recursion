package net.missdjoko.recursion;

/**
 * Created by Miss_ on 29.10.2015.
 */
public class Factorial {
    int fact(int j,int i, int num []){
        int k;


        if (j==i){
          int n=num[i];
          System.out.println(n);
          return n;
        }

        k=fact(j,i-1,num);
        System.out.println(num[i]);
        return k;

    }
}
