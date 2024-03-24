// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
    //1 informar o seu longin
    System.out.println("Infome seu Login");
    String login = in.nextLine();
    //2 informar sua senha
    System.out.println("Infome sua Senha");
    String senha = in.nextLine();
    //3 verifecar se o login e a senha estão corretos
    if(login.equals("kaua") && senha.equals("123456789-09")) {
      System.out.printf("Usuario %s correto.", login);
    }else{
      System.out.println("Usuario ou senha incorretos.");
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}