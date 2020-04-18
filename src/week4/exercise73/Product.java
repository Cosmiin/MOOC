package week4.exercise73;


class Product {
    String name;
    int price;
    int ammount;

    public Product(String name, int price, int ammount) {
        this.name = name;
        this.price = price;
        this.ammount = ammount;
    }

    public void printProduct (){

        System.out.println(
                "name: "+name+" price: "+price+" amount: "+ammount
        );
    }
}
