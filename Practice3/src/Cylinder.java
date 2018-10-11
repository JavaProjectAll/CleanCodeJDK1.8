public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = getArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = getVolume(baseArea, perimeter, height);
        return volume;
    }

    public static double getArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    public static double getVolume(double perimeter, double baseArea, int height) {
        return perimeter * height + 2 * baseArea;
    }
}
