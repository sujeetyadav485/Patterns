import java . util.*;


public class Invertedpyramidwithnumber {

    public static void main(String[] args) {
        
        int n =5 , i , j ;

        for(i =n ; i>=1 ; i--){

            for(j =1 ; j <= i ; j++){
                System.out.print(j+" ");
            }
           System.out.println();

        }

    }
    
}
