package trabajoa.p_punto4;

public class Arista {

    private Vertise v1;
    private Vertise v2;

    public Arista(Vertise v1, Vertise v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public Vertise getV1() {
        return v1;
    }

    public void setV1(Vertise v1) {
        this.v1 = v1;
    }

    public Vertise getV2() {
        return v2;
    }

    public void setV2(Vertise v2) {
        this.v2 = v2;
    }

}
