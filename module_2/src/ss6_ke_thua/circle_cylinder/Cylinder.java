package ss6_ke_thua.circle_cylinder;

public class Cylinder extends Circle  {

        private static double height;
        public Cylinder(double radius,String color,double height){
                super(radius, color);
                this.height = height;
        }

        public static double getHeight() {
                return height;
        }

        public static void setHeight(double height) {
                Cylinder.height = height;
        }
        public double volume(){
                return super.area()*this.height;
        }
        public String toString(){
                return "hình trụ có chiều cao là :"+getHeight() + " có thể tích là :"+volume();
        }
}
