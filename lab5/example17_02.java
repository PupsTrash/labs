import java.util.stream.IntStream;

public class example17_02 {

    public char firstChar;
    public char secondChar;

    public void f2sChar(){
        IntStream.iterate(firstChar, i -> i <= secondChar, i -> i+1)
                .mapToObj(Character::toString)
                .forEach(System.out::print);
    }
}
