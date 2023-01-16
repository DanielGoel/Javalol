package sumuntilzero;
import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        int sum=0;
        Scanner  myInput= new Scanner( System.in );
        while (true){
            System.out.println("please insert number");
            int n = myInput.nextInt();
            if(n==0){
                break;
            }
            else
                sum+=n;
        }
        System.out.println("the sum is: "+sum);
    }   
}
