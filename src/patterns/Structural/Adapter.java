package patterns.Structural;

import java.util.ArrayList;
import java.util.List;

//Target
interface IText{
    //Request()
    String getText();
}

//Adapter
class StringList{
    List<String> rows = new ArrayList<>();
    //SpecificRequest()
    public String getString(){
        return String.join("\n",rows);
    }
    public void add(String value){
        rows.add(value);
    }
}

//Adapter
class TextAdapter implements IText{
    public StringList rowList;
    //Request()
    public String getText(){

        if (rowList == null) {
            return "";
        } else {
            return rowList.getString();
        }
    }

}
public class Adapter {
    TextAdapter getTextAdapter(){
        TextAdapter adapter = new TextAdapter();
        StringList rowList = new StringList();
        rowList.add("line 1");
        rowList.add("line 2");
        adapter.rowList = rowList;
        return adapter;
    }
    //Client
    public static void main(String[] args) {
        TextAdapter adapter = new Adapter().getTextAdapter();
        String text = adapter.getText();
    }
}
