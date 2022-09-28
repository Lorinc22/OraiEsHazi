public class kor {
    private double sugar;
    private int x;
    private int y;


    public kor(double sugar, int pont1, int pont2) {
        this.sugar = sugar;
        this.x = pont1;
        this.y = pont2;
    }


    public kor(double sugar) {
        this.sugar = sugar;
        x = 0;
        y = 0;
    }

    public double getKerulet() {
        return ((sugar * 2) * Math.PI);
    }

    public double getTerulet() {
        return ((sugar * sugar) * Math.PI);
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "(x: "+ x + ", y: " + y + ", r: " + (int)sugar + ")";
    }
}
