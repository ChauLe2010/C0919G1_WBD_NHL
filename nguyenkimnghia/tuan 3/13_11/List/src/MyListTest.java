public class MyListTest extends MyList{
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<Integer>();
        integerMyList.add(1);
        integerMyList.add(2);
        integerMyList.add(3);
        integerMyList.add(3);
        integerMyList.add(4);

        System.out.println("element 4 : " + integerMyList.get(4));
        System.out.println("element 1 : " + integerMyList.get(1));
        System.out.println("element 2 : " + integerMyList.get(2));

        integerMyList.add(6);
        System.out.println("element 6 : " + integerMyList.get(5));

        integerMyList.get(-1);
        System.out.println("element -1 : " + integerMyList.get(-1));
    }
}
