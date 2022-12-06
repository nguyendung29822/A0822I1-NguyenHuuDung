package ss10_list.thuc_hanh.trien_khai_lop_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ListInteger = new MyList<Integer>();
        ListInteger.add(1);
        ListInteger.add(2);
        ListInteger.add(3);
        ListInteger.add(4);

        System.out.println("elements1:" + ListInteger.get(0));
        System.out.println("elements2:" + ListInteger.get(1));
        System.out.println("elements3:" + ListInteger.get(2));
        System.out.println("elements4:" + ListInteger.get(3));

        ListInteger.get(6);
        //ListInteger.get(-1);
        System.out.println("element 6" + ListInteger.get(6));
        //System.out.println("element -1"+ListInteger.get(-1));



    }
}
