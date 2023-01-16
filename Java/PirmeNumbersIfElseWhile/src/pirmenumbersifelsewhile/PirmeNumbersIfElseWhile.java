
package pirmenumbersifelsewhile;

public class PirmeNumbersIfElseWhile {

    public static void main(String[] args) {


        int x=0;
        boolean prime=true;
        while(x<10000){
            x+=1;
           int i = 2;
            while(i<x/2){
                i+=1;
                if ((x % i) == 0){
                    prime=true;
                    break;
                }
                else{
                    prime=false;

                }
            }
            if(prime==false){
                System.out.println(x);
            }
        }   

    }
}
