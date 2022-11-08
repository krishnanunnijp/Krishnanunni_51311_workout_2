package Qn2.flatPrice;

class OneBHK {
    private double roomArea;
    private double hallArea;
    private long price;

    public OneBHK() {
    }

    public OneBHK(double roomArea, double hallArea, long price) {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
        DriverClass.totalAmount= DriverClass.totalAmount+this.getPrice();
    }

    public void Show() {
        System.out.println("OneBHK{" +
                "roomArea=" + roomArea +
                ", hallArea=" + hallArea +
                ", price=" + price +
                '}');
    }

    public double getHallArea() {
        return hallArea;
    }

    public double getPrice() {
        return price;
    }

    public double getRoomArea() {
        return roomArea;
    }
}


