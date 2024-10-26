/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavadero.flyweight;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author lmfg0
 */
public class FlyweightFactory {
  private Map<String, persona> empleadoMap = new HashMap<>();

  public persona getEmpleado(String nombre, String cargo, double salario) {
    // Usamos una clave única para identificar cada combinación de atributos
    String key = nombre + cargo + salario;
    if (!empleadoMap.containsKey(key)) {
      empleadoMap.put(key, new empleado(nombre, cargo, salario));
    }
    return empleadoMap.get(key);
  }

  public void listarEmpleados(String[] nombre, String[] cargo, double[] salario,
                              String[] ubicacion, String[] proyecto) {
    for (int i = 0; i < nombre.length; i++) {
      persona empleado = getEmpleado(nombre[i], cargo[i], salario[i]);
      System.out.println("Informacion del empleado:\n" + empleado.informacion(ubicacion[i], proyecto[i]) + "\n");
    }
  }
  
  public int obtenerNumeroDeInstancias() {
    return empleadoMap.size();
  }
}
