package patterns.Structural;

import java.util.ArrayList;
import java.util.List;

//Abstraction
abstract class AText{
    protected TextImp textImp;
    //Operations
    abstract String getText();
    abstract void addLine(String value);
}
//RefinedAbstraction
class TextMaker extends AText{
    public TextMaker(TextImp textImp){
        this.textImp = textImp;
    }
    public String getText(){
        return textImp.getString();
    }
    public void addLine(String value){
        textImp.appendLine(value);
    }
}
//Implementator
abstract class TextImp{
    List<String> rows = new ArrayList<>();
    public String getString(){
        return String.join("\n",rows);
    }
    abstract void appendLine(String value);
}

//ConcreteImplementator
class TextBuilder extends TextImp{
    public void appendLine(String value){
        rows.add(value);
    }
}

//ConcreteImplementator
class HtmlBuilder extends TextImp{
    public void appendLine(String value){
        rows.add("<span>"+value+"</span><br/>");
    }
}


public class BridgeDemo {
    TextMaker fillTextBuilder(TextImp textImp){
        TextMaker textMaker = new TextMaker(textImp);
        textMaker.addLine("line 1");
        textMaker.addLine("line 2");
        return textMaker;
    }
    public static void main(String[] args) {
        TextMaker textMaker = new BridgeDemo().fillTextBuilder(new TextBuilder());
        String text = textMaker.getText();

        TextMaker htmlMaker = new BridgeDemo().fillTextBuilder(new HtmlBuilder());
        String html = htmlMaker.getText();
    }
}
