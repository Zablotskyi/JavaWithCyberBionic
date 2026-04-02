import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//OOP. 3
//Назва
//Частота
//Об'єм оперативної пам'яті
//Наявність DVD ROM
//Вартість
//
//Визначити комп'ютери, які мають DVD ROM, і надрукувати всі відомості про них.
public class Main {
    public static void main(String[] args) {
        ArrayList<Computer> listComputers = new ArrayList<>();

        Computer firstComputer = new Computer("Brain", 3400, 16, false,  15000);
        Computer secondComputer = new Computer("Asus", 4300, 32, true,  25000);
        Computer thirdComputer = new Computer("HP", 2800, 16, false,  20000);

        listComputers.add(firstComputer);
        listComputers.add(secondComputer);
        listComputers.add(thirdComputer);

//        Arrays.sort(listComputers);   // ClassCastException
        for (Computer temp : listComputers) {
            System.out.println(temp);
        }

//        Arrays.sort(listComputers, new Comparator<Computer>() {
//            @Override
//            public int compare(Computer o1, Computer o2) {
//                return o1.price - o2.price;
//            }
//        });
//        for (Computer temp : c) {
//            System.out.println(temp);
//        }
//        System.out.println();
//
//        Arrays.sort(c, new Comparator<Computer>() {
//            public int compare(Computer o1, Computer o2) {
//                return o1.speed - o2.speed;
//            }
//        });
//        for (Computer temp : c) {
//            System.out.println(temp);
//        }
//        System.out.println();
//
//        Arrays.sort(c, new Comparator<Car>() {
//            public int compare(Car o1, Car o2) {
//                return o1.color.compareTo(o2.color);
//            }
//        });
//        for (Car temp : c) {
//            System.out.println(temp);
//        }
    }
}