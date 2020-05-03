package week5.Exercise85;

public class Reformatory {
    int counter;

    public int weight(Person person) {
        counter++;
        return person.getWeight();
    }

    public void feed (Person person){
        person.setWeight(weight(person)+1);
    }

    public int totalWeightsMeasured(){
           return  counter;
    }


}
