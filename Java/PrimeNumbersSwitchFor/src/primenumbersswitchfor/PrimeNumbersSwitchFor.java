
package primenumbersswitchfor;

public class PrimeNumbersSwitchFor {

    public static void main(String[] args) {
        int prime=1;
        for(int x=0;x<10000;x++){
            for(int i=2;i<x/2;i++){
                if ((x % i) == 0){
                    prime=1;
                    break;
                }
                else{
                    prime=2;

                }
            }
            switch(prime){
                case 2 -> System.out.println(x);
                case 1 -> {
                }
            }
        }   

    }
}
    
   
