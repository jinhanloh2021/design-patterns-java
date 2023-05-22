package com.coffeepoweredcrew.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10, 10, 5), 20);
        s1.attack();

        System.out.println("S1: " + s1);
        Swordsman s2 = (Swordsman) s1.clone(); // call clone method
        System.out.println("S2: " + s2);
    }

}
