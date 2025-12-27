//Завдання 6
//
//Опишіть метод powerA234(a), який обчислює другий, третій та четвертий степінь числа A та виводить ці степені в консоль
// (усі параметри є дійсними). За допомогою цієї процедури знайдіть другий, третій та четвертий степені п'яти зазначених
// чисел.
public class Solution006 {
    public static void main(String[] args) {
        A234(2);
        A234(3);
        A234(5);
        A234(10);
        A234(100);
    }

    public static void A234(double a) {
        double resultPowerTwo = a * a;
        double resultPowerThree = a * a * a;
        double resultPowerFour = a * a * a * a;

        System.out.println("Число " + a + " в степені 2 дорівнює: " + resultPowerTwo);
        System.out.println("Число " + a + " в степені 3 дорівнює: " + resultPowerThree);
        System.out.println("Число " + a + " в степені 4 дорівнює: " + resultPowerFour);
    }
}
