package week5.Exercise84;

public class Main {
    public static void main(String[] args) {
        Counter faraParametri = new Counter();
        Counter booleanCheck = new Counter(-1,true);
        Counter booleanCheck2 = new Counter(-1,false);
        Counter startingValue = new Counter(1);
        Counter startingValue2 = new Counter(-1);
        Counter valueCheck = new Counter(-1,true);

        faraParametri.decrease();
        System.out.println(faraParametri);
    }

}
