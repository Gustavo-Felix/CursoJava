package section18.funcional.function;

public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static String staticUpperName(Product product) {
        return product.getName().toUpperCase();
    }

    public String nonstaticUpperName() {
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

}
