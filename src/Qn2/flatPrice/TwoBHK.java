package Qn2.flatPrice;

public class TwoBHK extends OneBHK {
    private double room2Area;
    public TwoBHK() {

    }
    public TwoBHK(double roomArea,double room2Area,double hallArea,long price){
        super(roomArea, hallArea,price);
        this.room2Area=room2Area;
    }

    @Override
    public void Show() {
        System.out.println( "TwoBHK{" +
                "roomArea=" + super.getRoomArea() +
                "room2Area=" + room2Area +
                ", hallArea=" + super.getHallArea() +
                ", price=" + super.getPrice() +
                '}');
    }

    public double getRoom2Area() {
        return room2Area;
    }
}
