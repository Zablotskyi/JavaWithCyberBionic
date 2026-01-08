//Поля
//Прізвище
//Група
//Фізика
//Інформ
//Історія
//Визначити середній бал оцінок з всіх предметів, і вивести відомості про ня про студентів, середній бал яких більший за
// 4 яких більше 4.
public class Solution002 {

    public static void main(String[] args) {
        Student student1 = new Student("st1", "g1", 4, 4, 4, 0);
        Student student2 = new Student("st2", "g2", 3, 4, 5, 0);
        Student student3 = new Student("st3", "g3", 2, 2, 2, 0);
        Student student4 = new Student("st4", "g4", 1, 4, 1, 0);
        Student student5 = new Student("st5", "g5", 5, 5, 5, 0);

        Student[] student = {student1, student2, student3, student4, student5};

        average(student);
    }

    private static void average(Student[] students) {
        for (Student student : students) {
            student.setAverage((student.getFizyka() + student.getInformatyka() + student.getIstoriya()) / 3);

            if (student.getAverage() >= 4) {
                System.out.println("Середній бал студента: " + student);
            }
        }
    }
}
