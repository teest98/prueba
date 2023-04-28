
package com.mycompany.ejemplo3;

public class Punto {
 private double x;
 private double y;
 
 public Punto(){
     
 }
 
 public void setPunto(double x, double y){
     this.x=x;
     this.y=y;

 }
 
 public double getX(){
     return x;
 }
 
 public double getY(){
     return y;
 }
 
 @Override
 public String toString(){
     return "Punto("+x+","+y+")";
 }
}
