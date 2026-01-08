public class Student {
    private String firstName;
    private String group;
    private int fizyka;
    private int informatyka;
    private int istoriya;
    private double average;

    public Student(String firstName, String group, int fizyka, int informatyka, int istoriya, double average) {
        this.firstName = firstName;
        this.group = group;
        this.fizyka = fizyka;
        this.informatyka = informatyka;
        this.istoriya = istoriya;
        this.average = average;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getFizyka() {
        return fizyka;
    }

    public void setFizyka(int fizyka) {
        this.fizyka = fizyka;
    }

    public int getInformatyka() {
        return informatyka;
    }

    public void setInformatyka(int informatyka) {
        this.informatyka = informatyka;
    }

    public int getIstoriya() {
        return istoriya;
    }

    public void setIstoriya(int istoriya) {
        this.istoriya = istoriya;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", group='" + group + '\'' +
                ", fizyka=" + fizyka +
                ", informatyka=" + informatyka +
                ", istoriya=" + istoriya +
                ", average=" + average +
                '}';
    }
}
