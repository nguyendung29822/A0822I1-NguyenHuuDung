package ss6_ke_thua.point2d_point3d;

public class main {
    public static void main(String[] args) {
        Point_2d point_2d = new Point_2d(2,3);
        Point_3d point_3d = new Point_3d(4,5,2);

        point_2d.setXY(3,2);
        point_2d.getXY();

        point_3d.setXYZ(5,8,9);
        point_3d.getXYZ();

        System.out.println(point_2d.toString());
        System.out.println(point_3d.toString());
    }
}
