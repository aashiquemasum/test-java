import org.testng.Assert;
import org.testng.annotations.Test;
import app.Calculator;


public class TestCalculator {

    @Test
    public void addTest(){
        Calculator testing =new Calculator();
        int a=2;
        int b=2;
        int expectedValue = 4;
        int actualResult = Calculator.add(2,2);

      //  if(expectedValue == actualResult){
        //    System.out.println("Test pass");
       // } else if (expectedValue != actualResult) {
         //   System.out.println("Test not pass");

       // }
        Assert.assertEquals(expectedValue,actualResult);
        System.out.println("Calculator apps is working");

    }
    @Test
    public void deductTest(){
        int a=5;
        int b=2;
        int expectedValue = -1;
       int actualResult= Calculator.deduct();

      //  if(expectedValue == actualResult){
        //    System.out.println("test pass");
     //   }
       // else if(expectedValue != actualResult){
         //   System.out.println("Sorry not passed");
        //}
        Assert.assertEquals(expectedValue,actualResult);

    }
}
