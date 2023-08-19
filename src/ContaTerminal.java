import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   private Long numero;
   private String agencia;
   private String primeiroNome;
   private String sobrenome;
   private Double saldo;

   private ContaTerminal(Long numero, String agencia, String primeiroNome, String sobrenome, Double saldo){
      this.numero = numero;
      this.agencia =agencia;
      this.primeiroNome = primeiroNome;
      this.sobrenome = sobrenome;
      this.saldo = saldo;
   }
   @Override
   public String toString(){
      return "sua agencia e "+ this.agencia +
              ", sua conta " + this.numero +
              " e seu saldo R$"+String.format("%.2f",this.saldo);
   }
   private void printMessage(){
      StringBuilder msg = new StringBuilder();
      msg.append("Ola ")
         .append(this.primeiroNome)
         .append(" ")
         .append(this.sobrenome)
         .append(", obrigado por criar uma conta em nosso banco, ")
         .append(this)
         .append(" ja esta disponivel para saque.");

      System.out.println(msg);
   }
   private static ContaTerminal getAccountData(){
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      System.out.println("Ola, vamos dar inicio");

      System.out.print("Digige o numero da conta: ");
      Long numero = scanner.nextLong();

      System.out.print("Digite a agencia: ");
      String agencia = scanner.next();

      System.out.print("Digite seu primeiro nome: ");
      String primeiroNome = scanner.next();

      System.out.print("Digite seu sobrenome: ");
      String sobrenome = scanner.next();

      System.out.print("Digite o saldo: R$  ");
      Double saldo = scanner.nextDouble();

      return new ContaTerminal(numero, agencia, primeiroNome, sobrenome, saldo);

   }
   public static void main(String[] args){
      ContaTerminal acc = ContaTerminal.getAccountData();
      acc.printMessage();
   }
}
