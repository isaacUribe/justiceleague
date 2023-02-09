package org.example;

public class Hero {

    private String nombre;
    private int power;

    public Hero() {

    }

    public Hero(String nombre, int power) {
        this.nombre = nombre;
        this.power = power;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if(power>=0 && power<=100){
            this.power=power;
        }else{
            System.out.println("poder incorrecto");
        }
    }

    public String saludar(String nombre){
        return("Te Vencere" + nombre);
    }
}
