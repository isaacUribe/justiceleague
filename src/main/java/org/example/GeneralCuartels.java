package org.example;

import clases.Villain;
import org.example.paquetico.Pareja;

import java.sql.SQLOutput;

public class GeneralCuartels {
    public static void main(String[] args) {

        Hero heroe = new Hero();
        heroe.setNombre("Batman");
        heroe.setPower(90);

        System.out.println(heroe.getNombre());
        System.out.println(heroe.getPower());

        Villain villano = new Villain();


        Pareja pareja = new Pareja();
    }
}