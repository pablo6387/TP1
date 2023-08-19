package com.mycompany.tp1;

public class Robot {
    private boolean estado;
    private Bateria bateria;

    public Robot() {
        estado = true;
        bateria = new Bateria();
    }
    
    public void despertar(){
        estado=true;
    }
    
    public void dormir(){
        estado=false;
    }
    
    public void avanzar(int pasos){
        if (estado){
            if (!bateriaVacia()){
                bateria.setCarga(bateria.getCarga()-(pasos/10));
            }else{
                System.out.println("No tiene suficiente carga para realizar esta tarea");
            }
        }else{
            System.out.println("El robot esta dormido");
        }
        
    }
    
    public void retroceder(int pasos){
        if (estado){
            if (!bateriaVacia()){
                bateria.setCarga(bateria.getCarga()-(pasos/10));
            }else{
                System.out.println("No tiene suficiente carga para realizar esta tarea");
            }
        }else{
            System.out.println("El robot esta dormido");
        }
        
    }
    
    public boolean bateriaLlena(){
        return (bateria.getCarga()==1000);
    }
    
    public boolean bateriaVacia(){
        return (bateria.getCarga()<0);
    }
    
    public int energiaActual(){
        return bateria.getCarga();
    }
}
