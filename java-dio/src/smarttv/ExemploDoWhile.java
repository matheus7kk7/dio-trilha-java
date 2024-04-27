package smarttv;

import java.util.Scanner ;
import java.util.Random ;

public class ExemploDoWhile {
    public static void main(String[] args) {
         

        // Escreva um programa que exibe um menu de opções para o usuário e solicita que ele escolha uma opção.
        // O programa deve continuar exibindo o menu e solicitando uma opção até que o usuário escolha uma opção de saída.
   
         /*  Scanner scan = new Scanner(System.in);

          
          int op = 0 ;
          int contador = 0 ;

          do {
            System.out.println(" [1] - continua \n [2] - continua \n [3] -sair");
            op = scan.nextInt () ;
            contador++ ;

          System.out.println("Continuando");
           } while (op != 3) ;
           System.out.println("Saindo contador" + contador);
           */
        //Adivinhar o número: Escreva um programa que gera um número aleatório entre 1 e 100 e solicita ao usuário que adivinhe qual é o número. 
        //O programa deve continuar solicitando ao usuário que adivinhe até que ele acerte o número.
        // Dica: use a classe java.util.Random para gerar números aleatórios.
      /*
        int numeroInput = 0;
        int numeroRandom = 0;
        int contador = 5 ;
        Scanner scanner = new Scanner (System.in) ;
        Random random = new Random() ;

        numeroRandom = random.nextInt(10) ;

        do {
        
            System.out.println("Informe um numero de um a 10 " ) ;
            numeroInput = scanner.nextInt() ;
            if (numeroInput == numeroRandom) {
                System.out.println("Parabens você acertou");
                break ;
            }
            else {
                --contador;
                 System.out.println("Que pena você tem mais " + contador + " tentativas ");
            }
            

        } while (contador >0);
        System.out.println("O numero aletorio era " + numeroRandom);
     */
      //Validação de entrada: Escreva um programa que solicita ao usuário para inserir um número entre 1 e 100. 
      //Use um laço do-while para validar a entrada do usuário, garantindo que o número inserido esteja dentro do intervalo desejado.
        Scanner scanner = new Scanner(System.in) ;
        int contador = 0  ;
        int numeroInput = 0 ;
        do {
        System.out.println("Digite um numero de 1 a 100");
        numeroInput = scanner.nextInt() ;
        contador++;
        }while (numeroInput >= 1 && numeroInput <= 100) ;

        System.out.println("Saiu");
        
    }
}



       