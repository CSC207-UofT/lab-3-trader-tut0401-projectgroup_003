public class House implements Tradable{
    private int price;
    private String owner;

    public House(int p, String o){
        this.price = p;
        this.owner = o;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public void valueAdd(int v){ this.price += v;}

    public void trade(String s){ this.owner = s;}

    public String toString(){return this.owner + "own this house";}
}
