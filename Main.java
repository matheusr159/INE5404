package exeroperacoes;

 //@author Matheus Ribeiro
 
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Operacao operacao = new Operacao();
        Scanner input = new Scanner(System.in);
        
        operacao.soma();
        operacao.subtracao();
        operacao.divisao();
        operacao.multiplicacao();
        
        //Média Ponderada
        double n1,n2,p1,p2;
        System.out.println("MEDIA PONDERADA");
        System.out.println("Digite o primeiro numero:");
        n1 = input.nextInt();  
        System.out.println("Digite o primeiro peso:");
        p1 = input.nextInt();  
        System.out.println("Digite o segundo numero inteiro:");
        n2 = input.nextInt(); 
        System.out.println("Digite o segundo peso:");
        p2 = input.nextInt(); 
        operacao.mediaPonderada(n1, n2, p1, p2);
        
        //Factorial
        int n;
        System.out.println("FACTORIAL");
        System.out.println("Digite um numero inteiro:");
        n = input.nextInt();
        operacao.factorial(n);
    }	 	  	  		  	    	     	   	     	        	 	
    
}