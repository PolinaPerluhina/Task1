import java.util.Scanner;

/**
 * Created by Palina_Piarlukhina on 9/6/2017.
 */
public class Main {

  public static void main (String[]args){

    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();

    while(calc.allOk){
      if(!calc.withResult){
        calc.setOperand1(sc);
      }
      calc.setOperand2(sc);
      calc.calculate(sc);
    }
  }
}
