package patterns.Structural;

import java.util.HashMap;
import java.util.Map;

//FlyWeight
interface ISpan {
    void printSpan(String style);
}
//ConcreteFlyWeight
class Char implements ISpan{
    protected char c;
    public Char(char c){
        this.c =c;
    }
    //Operation(extrinsicState)
    public void printSpan(String style){
        System.out.println("<span style=\""+style+"\">"+c+"</span>");
    }
}

//FlyweightFactory
class CharFactory{
    Map<Character,Char> chars = new HashMap<Character, Char>();
    //GetFlyWeight(key)
    public ISpan getChar(char c){
        Char character = chars.get(c);
        if(character == null){
            character = new Char(c);
            chars.put(c,character);
        }
        return character;
    }
}
public class Flyweight {
    public static void main(String[] args) {
        CharFactory factory  = new CharFactory();
        ISpan charA = factory.getChar('A');
        charA.printSpan("font-size: 12");
        ISpan charB = factory.getChar('B');
        charB.printSpan("font-size: 12");
        ISpan charA1 = factory.getChar('A');
        charA1.printSpan("font-size: 12");
        boolean equal = charA == charA1;
    }
}
