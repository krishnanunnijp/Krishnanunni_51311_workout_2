package Qn5.tileEstimation;

class Tile {
private double edgeLength;
Tile(double edgeLength){
    this.edgeLength=edgeLength;
}

    public double getEdgeLength() {
        return this.edgeLength;
    }
    public double onePieceArea(){
        return this.edgeLength*this.edgeLength;
    }
}
