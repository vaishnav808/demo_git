enum LaptopBrand{
    DELL(200), HP(150), LENOVO(180), APPLE(300), ASUS(120);
    private int price;

    LaptopBrand(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

};


class Demo {
    public static void main(String[] args) {
        for (LaptopBrand brand : LaptopBrand.values()) {
            System.out.println(brand + " costs $" + brand.getPrice());
        }
    }
}