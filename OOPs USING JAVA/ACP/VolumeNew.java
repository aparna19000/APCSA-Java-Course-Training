package ACP;

class Volume {

    // private variables (Encapsulation)
    private double length;
    private double width;
    private double height;
    private double radius;

    // setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // methods to calculate volume
    public double volumeOfCube() {
        return length * length * length;
    }

    public double volumeOfCuboid() {
        return length * width * height;
    }

    public double volumeOfCylinder() {
        return 3.14 * radius * radius * height;
    }
}

public class VolumeNew {
    public static void main(String[] args) {

        Volume v = new Volume();

        // Cube
        v.setLength(3);
        System.out.println("Volume of Cube: " + v.volumeOfCube());

        // Cuboid
        v.setLength(4);
        v.setWidth(5);
        v.setHeight(6);
        System.out.println("Volume of Cuboid: " + v.volumeOfCuboid());

        // Cylinder
        v.setRadius(3);
        v.setHeight(7);
        System.out.println("Volume of Cylinder: " + v.volumeOfCylinder());
    }
}