//Optimiized Square Root Function

import java.util.Scanner;
class Demo{

    static int sqrt(int num){
        int ans = 0;
        int start = 1;
        int end = num;
        int itr = 0;
        
        
        while(start<=end){

            itr++;

            int mid = (start+end)/2;
            int sqr = mid*mid;
            if(sqr==num){
                System.out.println("itr - "+itr);
               return mid;
            }else if(sqr>num){
               end = mid-1;
            }else{
                ans = mid;
                start = mid +1;
            }
            
        }   
        return ans;   
    }
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int ret = sqrt(num);
        System.out.println("SquareRoot - " + ret);
    }
}

/*
output-
100
itr - 6
SquareRoot - 10
 */
