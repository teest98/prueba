
package com.mycompany.ejemplo2;


public class Ejemplo2 {
public static void main(String[] args) {
// Crear un objeto de la clase Coche
Coche miCoche = new Coche("Toyota", "Corolla", 4);

// Llamar al método arrancar() de la clase Vehiculo
miCoche.arrancar();

// Llamar al método abrirPuertas() de la clase Coche
miCoche.abrirPuertas();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
// Polimorfismo – Usar la clase Padre como referencia a la clase Hija
Vehiculo vehiculoPolimorfico = new Coche("Mazda", "CX-5", 4);
vehiculoPolimorfico.arrancar();
miCoche.abrirPuertas();
// vehiculoPolimorfico.abrirPuertas() // Esto no compila porque la clase Vehiculo no tiene un método «abrirPuertas()»
}
}
