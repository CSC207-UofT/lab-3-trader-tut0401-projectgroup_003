public class Lion implements Tradable {
    private int price = 1500;
    private int age;
    private int weight;

    public Lion(int price, int age, int weight) {
        this.price = price;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public int getPrice() {
        return this.price*1/3;
    }

}
