public class DeltaProgression extends  Progression {

    private long secondVal = 5;

    DeltaProgression() {
        first = 2;
    }

    DeltaProgression(long firstVal, long secondVal) {
        first = firstVal;
        this.secondVal = secondVal;
    }

    private long secondValue() {
        return secondVal;
    }

    private long thirdValue() {
        cur = Math.abs(first - secondVal);
        return cur;
    }

    @Override
    protected long nextValue() {
        long preVal = cur;
        cur = Math.abs(secondVal - cur);
        secondVal = preVal;
        return cur;
    }

    @Override
    public void printProgression(int n) {
        System.out.print(firstValue());
        System.out.print(" " + secondValue());
        System.out.print(" " + thirdValue());

        for (int i = 4; i <= n; i++)
            System.out.print(" " + nextValue());
        System.out.println();
    }
}