public class Calculator {
    public static void main(String[] args){
        Calculator calculate=new Calculator();
        int a=10;
        int b=5;
        System.out.println("add="+calculate.add(a, b));
        System.out.println("subtract="+calculate.subtract(a, b));
        System.out.println("multiply="+calculate.multiply(a, b));
        System.out.println("divide="+calculate.divide(a, b));
    }
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
}
