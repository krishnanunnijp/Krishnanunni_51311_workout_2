package Qn8.swapNumbers;

public class Main {
    public static void main(String[] args) {                                                 //This main method is only for testing purposes
        swapNumber swapnumber = new swapNumber(5,8);
        swapnumber.swapNumberByReference();
        System.out.println("num1="+swapnumber.getNum1() + "num2="+swapnumber.getNum2());
        swapnumber.swapNumberByValue();
        System.out.println("num1="+swapnumber.getNum1() + "num2="+swapnumber.getNum2());
    }
}