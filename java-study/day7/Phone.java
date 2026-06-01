public class Phone {
    String brand;
    String model;
    int price;

    public Phone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("브랜드 : " + brand);
        System.out.println("모델명 : " + model);
        System.out.println("가격 : " + price);
    }
}
