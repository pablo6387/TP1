package com.mycompany.tp1;

public class TestJuego {
    public static void main(String[] args) {
        Robot r1 = new Robot();
        Hombre h1 = new Hombre("Pablo");
        h1.jugarConRobot(r1);
        Hombre h2 = new Hombre("Simon");
        h2.jugarConRobot(r1);
    }
}
