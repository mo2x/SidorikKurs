package Simulation;

public class PhysicalObj {
    private double weight;
    private Vector velocity;
    private Vector transform;

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setVelocity(Vector velocity) {
        this.velocity = velocity;
    }
    public Vector getVelocity() {
        return velocity;
    }
    public Vector getTransform() {
        return transform;
    }
    public void setTransform(Vector transform) {
        this.transform = transform;
    }
}
