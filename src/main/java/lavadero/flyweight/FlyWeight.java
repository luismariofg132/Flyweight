/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lavadero.flyweight;

/**
 *
 * @author lmfg0
 */
public class FlyWeight {

    public static void main(String[] args) {
        FlyweightFactory fw = new FlyweightFactory();
    
        // Datos de prueba intrisecos (Nombre, Cargo y Salario)
        String[] nombres = {"Juan Gonzales", "Luisa Marin", "Esteban Lopez", "Juan Gonzales"};
        String[] cargos = {"Operario", "Directora General", "Administrador", "Operario"};
        double[] salarios = {700000, 1500000, 2100000, 800000};
        
        // Datos extrínsecos (ubicación y proyecto) que varían según el contexto
        String[] ubicaciones = {"Planta 1", "Oficina Central", "Oficina Regional", "Planta 3"};
        String[] proyectos = {"Proyecto A", "Proyecto B", "Proyecto C", "Proyecto C"};

        // Llamada al método para listar empleados
        fw.listarEmpleados(nombres, cargos, salarios, ubicaciones, proyectos);
        
        // Mostrar el número de instancias únicas de Empleado
        System.out.println("Numero de instancias unicas de Empleado: " + fw.obtenerNumeroDeInstancias());
    }
}
