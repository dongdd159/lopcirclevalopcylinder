public class circle {
    private double radius;
    private String color;
    public double area ;
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return area;
    }
    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area = Math.PI * this.radius*this.radius;
    }
    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}

