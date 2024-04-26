import java.util.Scanner ;

public class ContaTerminal {

    private String nomeDoCliente ;
    private int numeroConta ;
    private String agencia ;
    private double saldoConta = 245.5 ;
    Scanner scanner= new Scanner( System.in) ;

    public void setNomeCliente  ( ) {
        this.nomeDoCliente = scanner.nextLine() ;
    }
    public void setNumeroAgencia  ( ) {
            this.agencia = scanner.nextLine() ;
        } 
    public void setNumeroConta ( ) {
            this.numeroConta= scanner.nextInt() ;
        }

        public String getMessage () {

      String message = "Olá ,".concat(nomeDoCliente) + "obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia)+ ", conta" + numeroConta + " e seu saldo" + saldoConta +" já está disponível para saque ";
         return message ;

        }
    
}
