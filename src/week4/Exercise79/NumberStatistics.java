package week4.Exercise79;

public class NumberStatistics {
    private int amountOfNumbers;
    private int  sum;


public void addNumber (int number){
    amountOfNumbers++;
    sum=sum+number;
}
public int amountOfNumbers(){
    return amountOfNumbers;
}

public int sum(){
    if (amountOfNumbers==0){
        return 0;
    }else
    return sum;
}

public double average (){
    if (amountOfNumbers==0){
        return 0;
    }else
        return (double)sum/(double) amountOfNumbers();

}

}
