// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  boolean infoValida = false;
    String nome, sexo, estadoCivil;
    int idade;
    double salario;

    do{
      System.out.println("Entre com o nome:");
      nome = scan.next();
      if (nome.length() >= 3) {
        infoValida = true;
      }else{
        System.out.println("Nome inválido, precisa de no mínimos 3 caracteres");
      } 
    } while (!infoValida);
  
    infovalida = false;
    
    do{
      System.out.println("Entre com o idade:");
      idade = scan.nextInt();
      if (idade >= 0 && idade <= 150) {
        infoValida = true;
      }else{
        System.out.println("Idade inválida, precisa de no mínimos 0 e no máximo 150");
      } 
    }while(!infoValida);

    infovalida = false;
    
    do{
      System.out.println("Entre com o salario:");
      salario = scan.nextDouble();
      if (salario > 0 ) {
        infoValida = true;
      }else{
        System.out.println("Salário inválido, precisa ser maior que 0");
      } 
    }while(!infoValida);

    infovalida = false;

    do{
      System.out.println("Qual seu gênero:");
      sexo = scan.next();
      if
      (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")) {
        infoValida = true;
      }else{
        System.out.println("Gênero incorreto, precisa ser 'm' ou 'f'");
      } 
    }while(!infoValida);



    infovalida = false;

    do{
      System.out.println("Qual seu estado civil:");
      sexo = scan.next();
        if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
        infoValida = true;
        }else{
          System.out.println("Estado civil incorreto, precisa ser 's', 'c', 'v' ou 'd'");
      } 
    }while(!infoValida);


    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Salário: " + salario);
    System.out.println("Gênero: " + sexo);
    System.out.println("Estado civil: " + estadoCivil);
    
    


  
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}