 package smarttv;
 import java.util.Scanner ;
import java.util.random.RandomGenerator;
import java.util.Random ;


 public class ExemploWhile {

        public static void main(String[] args) {
         // 1 - Contagem regressiva: Escreva um programa que imprima uma contagem regressiva de 10 a 1 utilizando um laço while.
          /* Contagem regressiva

         int contador = 10 ; 

         while (contador <= 10) {
            System.out.println("Contagem : " +contador);

           contador--;

           if (contador ==0 ) {

            break;
           }
         }*/
         // 2 - Soma dos números pares: Escreva um programa que solicite ao usuário um número inteiro positivo e, em seguida,
         // calcule e imprima a soma de todos os números pares até esse número.
        
         /* Scanner scanner = new Scanner(System.in)  ;


         int numeroInteiro= 0; 
         int contador = 0 ;
         int somaPares = 0; 

        System.out.println("Digite um numero inteiro");
        numeroInteiro = scanner.nextInt();
        if (numeroInteiro < 0 ) {
            System.out.println("insira um valor positivo ");
        } 
        else {
                    
               while (contador < numeroInteiro) {
                contador ++ ;
                if (contador %2==0)  {
                    somaPares +=contador ;
                }                

              }
        }
        System.out.println("soma de todos os pares de 0 a " + numeroInteiro + ": " + somaPares);
         */ 
        // 3 - Adivinhar o número: Escreva um programa que gera um número aleatório entre 1 e 100 e solicita ao usuário que adivinhe qual é o número.
         // O programa deve continuar solicitando ao usuário que adivinhe até que ele acerte o número. 
         //Dica: use a classe java.util.Random para gerar números aleatórios.
         /*  int numeroRandom = 0 ;
          int numeroUsuario = 0 ;
          int contador = 0 ;

        while (contador <12 ) { //Numero de tentativas
                 contador++;
                 numeroRandom= gerador.nextInt(10);
                        System.out.println("Qual numero foi gerado aleatoriamente de 0 a 10 ?  ");
                            numeroUsuario = scanner.nextInt();

                if ( numeroUsuario > 10 || numeroRandom < 0) {
                      System.out.println("Digite um valor de 0 a 10");
           }
                    else if (numeroUsuario == numeroRandom) {
                                System.out.println("Parabens você acertou !!");
                                System.out.println("O numero gerado aleatoriamente foi :"+numeroRandom);
                       break;
                 }
         else {
                System.out.println("que pena , tente outra vez  ,o numero gerado foi " +numeroRandom) ; 
               }

          }
        */ 
       //4 - Tabuada: Escreva um programa que solicite ao usuário um número inteiro e imprima a tabuada desse número.
      /* 
       Scanner scanner = new Scanner(System.in) ;
         int contador = 1 ;
         int numero = 0 ;
          System.out.println( "Digite um valor inteiro");
           numero=scanner.nextInt ();
          while (contador <= 10) {
           System.out.println("Multiplicao de " + " " +  numero + " por " + " " + contador  + " = "  + numero * contador );
           contador++ ;

        
          } 

      
        */ 
    // 5 - Escreva um programa que solicite ao usuário um número inteiro positivo e calcule o fatorial desse número utilizando um laço while.

      Scanner scanner = new Scanner( System.in) ;
      long  contador = 1;
      long  numeroPositivo = 0 ;
      long  fatorial = 1  ;
      long  resultado = 0 ; 


      System.out.println("Informe um numero positivo");
      numeroPositivo = scanner.nextInt();

        while (contador <=numeroPositivo) {
           
         fatorial *=contador; ;
         contador ++;
 }
     System.out.println("Fatorial de " + numeroPositivo + " : " + fatorial );



      
    }
}