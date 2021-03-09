/**
 * URIJUDGE 1002 
 * AUTOR: ANDERSON NUNES
 * DATA: 12/02/21
 * FATEC CARAPICUIBA    
 */
package UriJudge.E1002;
import java.io.IOException;
import java.util.Scanner;

public class AreaCirculo {
 
    public static void main(String[] args) throws IOException {
        
        double area;
        double raio;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        raio = scan.nextDouble();
        area = (raio * raio) * 3.14159;

        System.out.println("A=" + String.format("%.4f", area));
        
        scan.close();
 
    }

}

