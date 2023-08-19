package com.mycompany.tp1;

public class Hombre {
    private String nombre;

    public Hombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        
    public void jugarConRobot(Robot robot){
        robot.avanzar(500);
        robot.retroceder(20);
        System.out.println("Energia actual del robot: " + robot.energiaActual());
        robot.dormir();
    }
}
