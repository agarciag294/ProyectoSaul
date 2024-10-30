/**
 * EmpleadosController
 */
package Controladores;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import modelo.Empleado;

public class EmpleadoController {

    private ArrayList<Empleado> listaEmpleados;
    private final static String PATH ="src/ficheros/empleados.xml";

    public EmpleadoController() {
        this.listaEmpleados = new ArrayList<>();
    }

    // Metodos del controlador de Empleados
    public void cargarFicheroEmpleados() {
    	
        File fichero = new File(PATH);

        if (!fichero.exists()) {
            System.err.println("El fichero empleados.xml no existe, la aplicación finalizará." );
            return;
        }

        try (FileInputStream inputStream = new FileInputStream(fichero)) {
            XStream xstream = new XStream(new DomDriver());
            xstream.addPermission(AnyTypePermission.ANY);
            xstream.processAnnotations(Empleado.class);
            
            xstream.alias("empleados", ArrayList.class);
            
            xstream.registerConverter(new DateConverter("yyyy-MM-dd", null));
            
            xstream.registerConverter(new NullIntegerConverter());
            
            xstream.registerConverter(new NullDoubleConverter());
            
            listaEmpleados = (ArrayList<Empleado>) xstream.fromXML(inputStream);
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    

    // Agregar
    public boolean add(Empleado empleado) {
    	return this.listaEmpleados.add(empleado);
    }
    // Modificar

    // Eliminar

    // listar -> (Muestra todos los empleados)
    public void list() {
    	
    	this.listaEmpleados.forEach(System.out::println);
    }

    // Mostrar -> (Muestra la informacion de un empleado)
    
    public void listUnique(Integer emp_no) {
    	this.listaEmpleados.stream().filter(empleado -> empleado.getEmp_no() == emp_no).forEach(System.out::println);
    }

    // Pedir datosEmpleado
    
}