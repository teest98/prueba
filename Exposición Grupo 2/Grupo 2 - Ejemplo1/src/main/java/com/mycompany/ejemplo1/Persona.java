
package com.mycompany.ejemplo1;

public class Persona {
    
    private String nombre;

    private String apellidos;

    private int edad;

    private int dni;
	
    //Constructor

    public Persona (String nombre, String apellidos, int edad) {

        this.nombre = nombre;

        this.apellidos = apellidos;

        this.edad = edad;                   }

    //Métodos

    public String getNombre () { return nombre;  }

    public String getApellidos () { return apellidos;  }

    public int getEdad () { return edad;   }

} //Cierre de la clase
    
