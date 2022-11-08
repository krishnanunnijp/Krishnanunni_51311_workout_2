package Qn5.tileEstimation;

class Main {
    public static void main(String[] args) {
        Tile tile=new Tile(4.6);
        Floor floor = new Floor(5.6,49.9);
        System.out.println(floor.totalTiles(tile));
    }
}