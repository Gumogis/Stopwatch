package Java.Xml.Connect.MillisList;

import java.util.ArrayList;
import java.util.List;

public class MillisList {
    private List<Long> list = new ArrayList<>();

    public MillisList(){
        list.add(1234165654L);
        list.add(567456987912L);
    }
    public List<Long> getList() { return list; }
    public void addValueToList(long l){list.add(l);}
}
