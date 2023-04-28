
package com.mycompany.ejemplo2;

/**
 *
 * @author SOFI GD
 */
class Coche extends Vehiculo {
private int numPuertas;

public Coche(String marca, String modelo, int numPuertas) {
super(marca, modelo);
this.numPuertas = numPuertas;

}

public void abrirPuertas() {
System.out.println("Abriendo las " + numPuertas + " puertas del coche");
}
}
