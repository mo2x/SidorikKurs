package Simulation;

public class Vector {
    private double x;
    private double y;
    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Vector(){
        this(1,0);
    }
    public Vector(Vector vector){
        this(vector.getX(), vector.getY());
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getLineValue(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    public static Vector sum(Vector vector1, Vector vector2){
        Vector rezV = new Vector();
        rezV.setY(vector1.getY() + vector2.getY());
        rezV.setX(vector1.getX() + vector2.getX());
        return  rezV;
    }
    public static Vector multiply(Vector vector1, double value){
        Vector rezV = new Vector();
        rezV.setY(vector1.getY() * value);
        rezV.setX(vector1.getX() * value);
        return  rezV;
    }
}
