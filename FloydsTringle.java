import java. util.*;

public class FloydsTringle {

    public static void main(String[] args) {
        
    

    int n =5 , i , j, number = 1 ;

    for( i = 1; i <= n ; i++){

        for( j =1 ; j<= i ; j++){
            
            System.out.print(number+" ");

            number++;
        }
        System.out.println();
    }
}

}
