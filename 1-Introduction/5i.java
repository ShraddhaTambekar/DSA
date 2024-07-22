//Square Root Function

import java.util.Scanner;
class Demo{

    static int sqrt(int num){
        int val = 0;   
        int itr = 0; 
        for(int i = 1;i<=num;i++){   
            if(i*i<=num){
                val = i;
            }else{
                break;
            }
            itr++;
        }
        System.out.println("itr- "+itr);
        return val;        
    }
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sqr = sqrt(num);
        System.out.println("SquareRoot - " + sqr);
    }
}

/*
output-
85
itr- 9
SquareRoot - 9
 */
