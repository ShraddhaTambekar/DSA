//Optimized Factor code

import java.util.Scanner;
class Demo{

    static int factor(int num){
        int itr = 0;
        int count = 2;               //num will be divisible to itself and 1
        for(int i = 2;i<=num/2;i++){ //As we will not get factors of num after num/2 therefore we skip those iteration
            itr++;
            if(num%i==0){
               count++;
            }
        }
        System.out.println(itr);     //Optimization makes less iteration and lesser time to run
        return count;
    }
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int count = factor(num);
        System.out.println(count);
    }
}

/*
output-
100
100
9
 */