
package com.mycompany.ejemplo2;

/**
 *
 * @author SOFI GD
 */

    class Vehiculo {
protected String marca;
protected String modelo;

public Vehiculo(String marca, String modelo) {
this.marca = marca;
this.modelo = modelo;
}

public void arrancar() {
System.out.println("Arrancando el vehículo");
System.out.println("Marca: "+marca);
System.out.println("Modelo: "+modelo);
}
}
    

