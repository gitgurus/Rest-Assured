package JavaPrograms.collections;

public class comparableVsComparator {

    private String laptop;
    private int price;
    private int ram;

    public comparableVsComparator(String laptop, int price, int ram) {
        this.laptop = laptop;
        this.price = price;
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getLaptop() {
        return laptop;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }


}
