package Contabanco;

public class Main {
    

       public static void main(String[] args) {
        ContaTerminal contabanco = new ContaTerminal() ;
        System.out.println( "Digite nome completo");

        contabanco.setNomeCliente() ;

        System.out.println( "Digite numero da agencia ");

        contabanco.setNumeroAgencia();

        System.out.println( "Digite numero da conta ");

        contabanco.setNumeroConta();

       System.out.println( contabanco.getMessage() );

       


        
    }
}