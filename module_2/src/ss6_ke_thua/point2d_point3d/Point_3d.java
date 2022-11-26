package ss6_ke_thua.point2d_point3d;

public class Point_3d extends Point_2d {
    private float z = 0.0f;

    public Point_3d() {
    }

    public Point_3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{this.getX(), this.getY(), z};
    }

    public String toString() {
        return "(" + this.getX() + "," + this.getY() + "," + z + ")";
    }
}
