package patterns.Creational;
//AbstractBuilder
interface ITextBuilder{
    void addText(String text);
    void addNewLine(String text);
}
//ConcreteBuilder 1
class TextBuilder implements ITextBuilder{
    String text = " ";
    public void addText(String value){
        text += value;
    }
    public void addNewLine(String value){
        text += "\n" +value;
    }
    public String getText(){
        return text;
    }
}

//cConcreteBuilder 2
class HtmlBuilder implements ITextBuilder{
    String html = " ";
    public void addText(String value){
        html += "<span>"+ value +"</span>";
    }
    public void addNewLine(String value){
        html += "<br/>\n";
        addText(value);;
    }
    public String getHtml(){
        return html;
    }
}

//Director
class TextMaker{
    public void makeText(ITextBuilder textBuilder){
        textBuilder.addText("line 1");
        textBuilder.addNewLine("line 2");
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        //Client
        TextMaker textMaker = new TextMaker();
        TextBuilder textBuilder = new TextBuilder();
        textMaker.makeText(textBuilder);
        String text = textBuilder.getText();

        HtmlBuilder htmlBuilder = new HtmlBuilder();
        textMaker.makeText(htmlBuilder);
        String html = htmlBuilder.getHtml();
        System.out.println(html);
    }
}
