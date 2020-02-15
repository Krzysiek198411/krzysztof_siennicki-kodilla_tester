public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {

        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 700 && this.weight < 1750) {
            System.out.println("This weight is not so heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("This price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkYear() {
        if (this.year < 2013) {
            System.out.println("This notebook is very old.");
        } else if (this.year > 2013 && this.year < 2017) {
            System.out.println("This notebook is old.");
        } else {
            System.out.println("This notebook is quite new.");
        }
    }

    public void chooseYear() {
        if (this.year < 2013) {
            System.out.println("Do not buy that notebook!");
        } else if (this.year > 2013 && this.year < 2016) {
            System.out.println("That notebook is not worth buying.");
        } else {
            System.out.println("That notebook is a good choice");
        }
    }

    public void findYear() {
        if (this.year > 2018) {
            System.out.println("This notebook is for advanced users.");
        } else {
            System.out.println("This notebook is for begginers.");
        }
    }
}