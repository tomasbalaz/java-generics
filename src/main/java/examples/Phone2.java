package examples;

public class Phone2 {

    private final String brand;

    public Phone2(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Phone2{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
