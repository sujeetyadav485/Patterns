import java . util.*;

public class Binarytringle {

    public static void main(String[] args) {
        
        int n =5 , i , j , sum = 1 ;

        for( i = 1 ; i <=n ; i++){

            for( j =1 ; j <= i ; j++){
            
                sum =  i + j ;

                if ( sum % 2 ==0){

                    System.out.print("1 ");
                
                }
                else{
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
    
}
