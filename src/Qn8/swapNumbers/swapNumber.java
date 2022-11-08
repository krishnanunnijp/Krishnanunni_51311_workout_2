package Qn8.swapNumbers;

public class swapNumber {

    private int num1;
    private int num2;
    public swapNumber(int num1,int num2){
        this.num1 = num1;
        this.num2=num2;
    }
    public void swapNumberByReference(){
        int temp=this.num1;
        this.num1=this.num2;
        this.num2 = temp;
    }
    public void swapNumberByValue(){
        this.num1 = this.num1+this.num2;
        this.num2=this.num1-this.num2;
        this.num1 = this.num1-this.num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}
