package UriJudge.E1020;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();

        int ano = idade / 365;
        idade %= 365;
        int mes = idade / 30;
        idade %= 30;
        int dia = idade;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
        scan.close();

    }
}
