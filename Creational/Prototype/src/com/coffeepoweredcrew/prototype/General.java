package com.coffeepoweredcrew.prototype;

//Doesn't support cloning
public class General extends GameUnit {

    private String state = "idle";

    public void boostMorale() {
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return "General " + state + " @ " + getPosition();
    }

    // Cloning and reset not supported for General, even through it extends
    // GameUnit.
    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("General cannot be cloned");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported for generals");
    }
}
