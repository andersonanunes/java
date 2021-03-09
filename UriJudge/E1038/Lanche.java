package UriJudge.E1038;

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigo = scan.nextInt();
        int qtde = scan.nextInt();
        double valor = 0.00;

        switch(codigo){
            case 1:
                valor = qtde * 4.00;
                break;
            case 2:
                valor = qtde * 4.50;
                break;
            case 3:
                valor = qtde * 5.00;
                break;
            case 4:
                valor = qtde * 2.00;
                break;
            case 5:
                valor = qtde * 1.50;
                break;
        }
        System.out.println(String.format("Total: R$ %.2f", valor));
        scan.close();
    }
}
