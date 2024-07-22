//More Optimized Factor code

import java.util.Scanner;
class Demo{

    static int factor(int num){
        int itr = 0;
        int count = 0;               
        for(int i = 1;i<=Math.sqrt(num);i++){ 
            itr++;
            if(num%i==0){
                if(i==num/i){             //For square root number of num no pair is their therefore count++ only
                    count = count + 1;
                }else{
                    count = count + 2;
                }
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
output-
100
10
9
 */