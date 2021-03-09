package UriJudge.E1067;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int cont = 0;

        while(cont <= X){
            if(cont % 2 == 1){
                System.out.println(cont);
            }
            cont++;
        } 
        scan.close();
    }
}