public class Cylinder {
    public static double getBaseArea(double radius){
        return Math.PI * radius * radius;
    }

    public static double getPerimeter(double radius){
        return 2 * Math.PI * radius;
    }

    public static double getVolume(int radius, int height){
        return getPerimeter(radius) * height + 2 * getBaseArea(radius);
    }
}
