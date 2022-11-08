package Qn2.flatPrice;

class DriverClass {
    static double totalAmount = 0;
    public static void main(String[] args) {
        TwoBHK twoBHK1=new TwoBHK(114.5,116.2,252.8,1200000);
        TwoBHK twoBHK2 = new TwoBHK(116.5,106.4,208.9,1500000);
        TwoBHK twoBHK3 = new TwoBHK(151.5,160.8,270,25000000);
        twoBHK1.Show();
        twoBHK2.Show();
        twoBHK3.Show();
        System.out.println(String.format("total amount: %.2f",totalAmount));

    }
}