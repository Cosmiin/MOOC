package week5.Exercise87;

public class Main {
    public static void main(String[] args) {
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        System.out.println( studioManhattan.larger(twoRoomsBrooklyn) );       // false
        System.out.println( fourAndKitchenBronx.larger(twoRoomsBrooklyn) );   // true


    }

}
