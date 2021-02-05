public class TesterProgression {
    public static void main(String[] args) {
        ArithProgression arithProgression = new ArithProgression(2, 3);
        arithProgression.printProgression(6);

        ArithProgression arithProgression1 = new ArithProgression();
        arithProgression1.printProgression(4);

        DeltaProgression deltaProgression = new DeltaProgression();
        deltaProgression.printProgression(10);

        DeltaProgression deltaProgression1 = new DeltaProgression(31, 52);
        deltaProgression1.printProgression(10);
    }
}
