package Lesson23;



class Shoe {
    private String brand;
    private int size;
    private String color;
    private double price;

    public Shoe(String brand, int size, String color, double price) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return brand + " - Str: " + size + ", Farve: " + color + ", Pris: " + price + " kr";
    }
}





