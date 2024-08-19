import java.util.Scanner;

public class contaBanco {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
          System.out.print("escreva seu nome:");
            String nome = scanner.nextLine();
              System.out.print("nome da agencia:");
                String agencia = scanner.nextLine();
                  System.out.print("escreva o numero da sua conta:");
                    int numeroDaConta = scanner.nextInt();
                     System.out.print("seu saldo é:");
                      Double saldo = scanner.nextDouble();
                       System.out.print("hola: " + nome + " obrigado por criar uma conta em nosso banco: " + " ,sua agencia é: " + agencia + " conta numero: " + numeroDaConta + " e seu saldo: " + saldo );




    }







}
