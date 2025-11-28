//Використовуючи IntelliJ IDEA, створіть клас DeMorganComparison. Використовуючи теорему де Моргана, перетворіть
// вихідний вираз A | B на еквівалентний вираз.
public class DeMorganComparison {
    public static void main(String[] args) {
        boolean A = false;
        boolean B = false;

        boolean original = A | B;
        boolean DeMorganComparison = !(!A && ! B);

        System.out.println("Оригінальний вираз A | B = " + original);
        System.out.println("За теоремою де Моргана !(!A *&& !B) = " + DeMorganComparison);
    }
}
