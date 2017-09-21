import java.util.Scanner;

/**
 * Created by Palina_Piarlukhina on 9/6/2017.
 */
public class Calculator {

  public static double operand1;
  public static double operand2;
  public static double result;
  public boolean allOk = true;
  public boolean withResult=false;

  public Calculator(){
    operand1 = 0;
    operand2=0;
    result=0;
  }

  public void setOperand1(Scanner sc){
    System.out.println("Enter first operand");
    try{
      operand1 = sc.nextDouble();
    } catch (Exception e){
      System.out.println(sc.next() + "is not a number");
      allOk = false;
    }
  }

  public void setOperand2(Scanner sc){
    System.out.println("Enter next operand");
    try{
      operand2 = sc.nextDouble();
    } catch (Exception e){
      System.out.println(sc.next() + "is not a number");
      allOk = false;
    }

  }

  public void calculate(Scanner sc){
    if(allOk){
      System.out.println("Enter one of operations: + , - , *, / ");
      String operation = sc.next();
      switch (operation){
        case "+":
          result = operand1+operand2;
          break;
        case "-":
          result = operand1-operand2;
          break;
        case "*":
          result = operand1*operand2;
          break;
        case "/":
          if (operand2!=0){
            result = operand1/operand2;
          }else {
            System.out.println("Sorry, can not divide by 0.");
            result = 0;
          }
          break;
        default:
          System.out.println("Operation not defined");
          allOk = false;
      }
      System.out.println("Result: "+result);
      if (allOk){
        System.out.println("Continue with result?");
        switch (sc.next().toLowerCase()){
          case "yes":
            withResult = true;
            operand1=result;
            result=0;
            break;
          case "no":
            withResult = false;
            break;
          default:
            withResult = false;
            System.out.println("Can not recognize answer, understood as no");
        }
      }
    }
  }
}
