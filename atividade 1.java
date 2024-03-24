// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double nota;
    boolean notaValida = false;
    do{
      System.out.println("Digite sua nota:");
      nota = input.nextDouble();
      //validação
      if(nota > 0 && nota <= 10){
        notaValida = true;
        System.out.println("O valor digiado é:" + nota);
      }else{
        //notaValida = false;
        System.out.println("Nota" +nota+ "inválida, digite novamente:");
      }
    }while(!notaValida);
      
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}