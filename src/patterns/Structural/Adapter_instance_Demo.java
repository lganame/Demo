package patterns.Structural;

import java.util.ArrayList;
import java.util.List;

//Target
interface  iText{
    //Request()
    String getText();
}
//Adapter
class StringList_2{
    List<String> rows = new ArrayList<String>();
    //SpecificRequest()
    public String getString(){
        return String.join("\n",rows);
    }
    public void add(String value){
        rows.add(value);
    }
}
//Adapter
class TextAdapter_2 extends StringList_2 implements IText{
    //Request()
    public String getText(){
        return getString();
    }
}
public class Adapter_instance_Demo {
    TextAdapter_2 getTextAdapter(){
        TextAdapter_2 adapter = new TextAdapter_2();
        adapter.add("line 1");
        adapter.add("line 2");
        return adapter;
    }
    public static void main(String[] args) {
        //Client
        TextAdapter_2 adapter = new Adapter_instance_Demo().getTextAdapter();
        String text = adapter.getText();
    }
}
