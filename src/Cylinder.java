public class Cylinder extends circle {
    private double height;
    public Cylinder(double radius, String color,double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    private double volume(){
        return Math.PI * this.area *this.height;
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", area=" + area +
                ",volume="+volume()+
                '}';
    }
}
