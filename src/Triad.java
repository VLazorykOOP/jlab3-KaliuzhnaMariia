public abstract class Triad {
    public int a;
    public int b;
    public int c;

    public Triad(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    abstract Triad increment();

    public abstract boolean equals(Object obj);

    @Override
    public abstract String toString();
}
