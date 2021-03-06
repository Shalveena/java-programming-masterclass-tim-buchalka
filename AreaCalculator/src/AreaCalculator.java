public class AreaCalculator {

    // 1. Method to calculate area of circle

    public static double area (double radius) {

        if (radius < 0) return -1.0;
        return (radius * radius * Math.PI);
    }

    // 2. Method to calculate area of rectangle

    public static double area (double x, double y) {

        if (x < 0 || y < 0) return -1.0;
        return (x * y);
    }


}
