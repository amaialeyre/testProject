package lesson6task7;

public class SquareRootPrinter {

    public double printSquareRootOfTheGivenNumber(double givenNumber){
        if (givenNumber<=0) throw new IllegalArgumentException("Error: the given value cannot be negative");
        return Math.sqrt(givenNumber);
    }
}