package com.coffeepoweredcrew.prototype;

/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        position = Point3D.ZERO;
    }

    public GameUnit(float x, float y, float z) {
        position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return position;
    }

    // Template method
    protected void initialise() {
        this.position = Point3D.ZERO;
        reset();
    }

    protected abstract void reset(); // children must implement

    /* keep throws clause to support subclasses that do not support cloning */
    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        // shallow copy or deep copy?
        GameUnit clonedUnit = (GameUnit) super.clone();
        clonedUnit.initialise();
        return clonedUnit;
    }
}
