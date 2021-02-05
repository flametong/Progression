public class ArithProgression extends Progression {

    private long d = 0;

    ArithProgression() {
        first = 2;
    }

    ArithProgression(long firstVal, long d) {
        first = firstVal;
        this.d = d;
    }

    @Override
    protected long nextValue() {
        if (d == 0) return ++cur;
        cur += d;
        return cur;
    }
}