/**
 * Класс для представления числовых последовательностей
 */
public class Progression {

    /** Первое значение последовательности  */
    protected long first;

    /** Текущее значение последовательности  */
    protected long cur;

    /** Конструктор по умолчанию  */
    Progression() {
        cur = first = 0;
    }

    /** Вновь устанавливает последовательность на первый элемент
     *
     * @return первый элемент
     */
    protected long firstValue() {
        cur = first;
        return cur;
    }

    /** Переводит последовательность к следующему значению
     *
     * @return следующее значение последовательности
     */
    protected long nextValue() {
        return ++cur;
    }

    /** Выводит на экран первые n элементов последовательности
     *
     * @param n число элементов, которое нужно вывести на экран
     */
    public void printProgression(int n) {
        System.out.print(firstValue());
        for (int i = 2; i <= n; i++)
            System.out.print(" " + nextValue());
        System.out.println();
    }
}