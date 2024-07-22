//Factor code

import java.util.Scanner;
class Demo{

    static int factor(int num){
        int itr = 0;
        int count = 0;               //Constant Time(only once initialised)
        for(int i = 1;i<=num;i++){   //No fix Time (depend on num)
            itr++;
            if(num%i==0){
               count++;
            }
        }
        System.out.println(itr);
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
 1)If cpu speed is 1GHz then 1 iteration in for/while loop take 1/10^8 sec to execute
 2)Reduce no. of iteration, more the code will be optimized
 */

/*
 output-
100
100
9
 */