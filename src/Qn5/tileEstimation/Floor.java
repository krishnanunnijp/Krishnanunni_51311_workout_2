package Qn5.tileEstimation;

public class Floor {
    private double length;
    private double breadth;
    Floor(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    private double floorArea(){
        return length*breadth;
    }
    public int totalTiles(Tile tile){
            double totalTile=this.floorArea()/tile.onePieceArea();
            return (int) Math.round(totalTile);
    }
}
