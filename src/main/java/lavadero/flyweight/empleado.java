/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavadero.flyweight;

/**
 *
 * @author lmfg0
 */
public class empleado implements persona {
  private String nombre;
  private String cargo;
  private double salario;

  public empleado(String nombre, String cargo, double salario) {
    this.nombre = nombre;
    this.cargo = cargo;
    this.salario = salario;
  }

  public String informacion(String ubicacion, String proyecto) {
    return "Nombre: " + this.nombre + "\nCargo: " + this.cargo + "\nSalario: " + this.salario +
           "\nUbicacion: " + ubicacion + "\nProyecto: " + proyecto;
  }
}
