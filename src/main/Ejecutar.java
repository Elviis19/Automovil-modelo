package main;

import automovil.Automovil;

public class Ejecutar {
    public static void main(String[] args) {
        
        Automovil auto =new Automovil("MAZDA",2023,2.5, 
                Automovil.TipoCombustible.Gasolina,
                Automovil.TipoAutomovil.Ciudad,5,5,300,
                Automovil.Color.Negro, 100
                );
        
        auto.mostrardatos();
        
        auto.setVelActual(100);
        System.out.println("Velocidad actual despues de su arranque = "
                + auto.getVelActual()+"Km/h" );
        
        auto.acelerar(20);
        auto.desacelerar(50);
        auto.frenar();
        
    }
}
