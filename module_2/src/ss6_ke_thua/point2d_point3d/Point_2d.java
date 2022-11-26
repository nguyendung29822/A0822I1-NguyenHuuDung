package ss6_ke_thua.point2d_point3d;

public class Point_2d {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point_2d() {
    }

    public Point_2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
