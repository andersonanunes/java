package UriJudge.E1040;

import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double N1 = scan.nextDouble();
        double N2 = scan.nextDouble();
        double N3 = scan.nextDouble();
        double N4 = scan.nextDouble();
        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        System.out.println(String.format("Media: %.1f", media));

        if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if(media < 5.0){
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double N5 = scan.nextDouble();
            System.out.println(String.format("Nota do exame: %.1f", N5));
            double recalculo = (media + N5) / 2;
            if(recalculo >= 5.0){
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println(String.format("Media final: %.1f", recalculo));
        }
        scan.close();
        
        
        /*  FORMA ACEITA PELO URIJUDGE
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		double N1 = scan.nextDouble();
		double N2 = scan.nextDouble();
		double N3 = scan.nextDouble();
		double N4 = scan.nextDouble();
        double media = ((N1*2) + (N2*3) + (N3*4) + (N4*1)) / 10;
		System.out.println("Media: " + df.format(media));
        if (media >= 7) {
        	System.out.println("Aluno aprovado.");
        } else if (media < 7 && media >= 5) {
        	System.out.println("Aluno em exame.");
        	double N5 = scan.nextDouble();
			System.out.println("Nota do exame: " + df.format(N5));
        	media = (media + N5) / 2;
        	if (media >= 5) {
            	System.out.println("Aluno aprovado.");
        	} else {
            	System.out.println("Aluno reprovado.");
        	}
			System.out.println("Media final: " + df.format(media));
        } else {
        	System.out.println("Aluno reprovado.");
        }
        scan.close();*/
    }
}
