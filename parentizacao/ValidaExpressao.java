package parentizacao;

import java.util.Scanner;

public class ValidaExpressao {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma expressao matematica: ");
        String c = scan.nextLine();
        int tamanho = (int)c.length();
        
        // instancia o objeto
        PilhaString pilha = new PilhaString ();
        
        int i;
        for(i = 0; i < tamanho; i++){ 
            if (c.charAt(i) == '('){ 
                pilha.push(c);
                //System.out.println("empilhou"); 
            }
            if (c.charAt(i) == ')') {
                if(!pilha.pilhaVazia()){
                    pilha.pop();
                    //System.out.println("desempilhou");
                }
                else{
                   // System.out.println("Falta abertura.");
                    i = tamanho + 100;
                }
            }
        }
        
        if (pilha.tamanhoPilha() == 0){
            if(i >= 100){
                System.out.println("Falta abertura de parênteses.");
            } else {
                System.out.println("Expressao ok");
            }
        } else {
            System.out.println("Falta fechamento de parênteses.");    
        }
        scan.close();
    }
}
