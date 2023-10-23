public abstract class Triad {
    public int a;
    public int b;
    public int c;

    public Triad(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public abstract Triad increment();

}
