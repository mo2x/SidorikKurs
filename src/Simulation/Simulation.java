package Simulation;

import Main.Program;

import static Main.Program.dataManager;

public class Simulation {
    PhysicalObj obj = new PhysicalObj();
    final double G = 9.82;
    double time;
    double deltaTime;
    double maxY = 0;

    public Simulation(){
        time = 0;
        deltaTime = 0.01;
    }

    private void makeStep(){
        time+= deltaTime;
        Vector chPosByGravity = new Vector(0,-G*Math.pow(deltaTime,2)/2);
        Vector chPosByVelocity = Vector.multiply(obj.getVelocity(), deltaTime);
        Vector chPos = Vector.sum(chPosByGravity,chPosByVelocity);
        Vector newPos = Vector.sum(obj.getTransform(),chPos);
        obj.setTransform(newPos);
        Vector chVelByGravity =new Vector(0, -G*deltaTime);
        Vector newVel = Vector.sum(obj.getVelocity(),chVelByGravity);
        obj.setVelocity(newVel);
            dataManager.addFrame(
                    obj.getTransform().getX(),
                    obj.getTransform().getY(),
                    obj.getVelocity().getLineValue(),
                    obj.getVelocity().getX(),
                    obj.getVelocity().getY(),
                    time);
    }

    public void start(double weight, double angle, double height, double velocity){
        dataManager.clear();
        obj.setWeight(weight);
        obj.setTransform(new Vector(0,height));
        Vector objVel = new Vector(
                velocity*Math.cos(Math.toRadians(angle)),
                velocity*Math.sin(Math.toRadians(angle))
        );
        obj.setVelocity(objVel);
        while (obj.getTransform().getY()>0){
            maxY = Math.max(maxY,obj.getTransform().getY());
            makeStep();
        }
        dataManager.setMaxY(maxY);
    }

}
