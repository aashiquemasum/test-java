package app;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Hello");
        //  System.out.println("Velue:");
        int value = add(100, 200);
        System.out.println("The value:" + value);
        // deduct();
    }

    public static int add(int a, int b) {
        // int a = 4;
        //int b = 5;
        int result = a + b;
        String calculatorName = "casio fx573";
        System.out.println("This is the point");
        System.out.println("Total of result is:" + result);
        return result;
    }

    public static int deduct() {
        int a = 4;
        int b = 5;
        int deductedResult = a - b;
        System.out.println("Deducted result is:" + deductedResult);
        System.out.println("This is the deduction point ");
        return deductedResult;
    }
}


