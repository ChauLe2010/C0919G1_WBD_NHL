import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList myList1 = new MyList(2,"red",true);
        MyList myList = new MyList(3,"blue",true);
        MyList myList2 = new MyList(1,"green",false);

        List<MyList> list = new ArrayList<MyList>();
        list.add(myList);
        list.add(myList1);
        list.add(myList2);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }


    }
}
