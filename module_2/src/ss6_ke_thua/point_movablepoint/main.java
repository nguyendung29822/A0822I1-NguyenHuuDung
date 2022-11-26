package ss6_ke_thua.point_movablepoint;

public class main {
    public static void main(String[] args) {
        Point p = new Point(2,5 );
        MovablePoint mp = new MovablePoint(5,6);

        System.out.println(p.getXY());
        System.out.println(mp.getSpeed());

        System.out.println(p.toString());
        System.out.println(mp.toString());

        System.out.println(mp.move());
    }
}
