public class Computer {
    private String name;
    private double core;
    private int ram;
    private boolean dvdRom;
    private int price;

    public Computer(String name, double core, int ram, boolean dvdRom, int price) {
        this.name = name;
        this.core = core;
        this.ram = ram;
        this.dvdRom = dvdRom;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCore() {
        return core;
    }

    public void setCore(double core) {
        this.core = core;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isDvdRom() {
        return dvdRom;
    }

    public void setDvdRom(boolean dvdRom) {
        this.dvdRom = dvdRom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", core=" + core +
                ", ram='" + ram + '\'' +
                ", dvdRom=" + dvdRom +
                ", price=" + price +
                '}';
    }
}
