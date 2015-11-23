package net.missdjoko.recursion;

/**
 * Created by Miss_ on 29.10.2015.
 */
public class Factorial {
    int fact(int i, int num []){
        if (i > 0){
            System.out.println(fact(i-1,num));
        }
        return num[i];
    }
}
