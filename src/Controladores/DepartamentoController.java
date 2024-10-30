/**
 * DepartamentoController
 */
package Controladores;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.security.AnyTypePermission;

import modelo.Departamento;
import modelo.Empleado;

public class DepartamentoController {

    private ArrayList<Departamento> listaDepartamentos;
    private final static String PATH ="src/ficheros/departamentos.xml";

    public DepartamentoController() {
        this.listaDepartamentos = new ArrayList<>();
    }

    // Metodos del controlador de Departamento
    public void cargarFicheroDepartamentos() {
        
        File fichero = new File(PATH);

        if (!fichero.exists()) {
            System.err.println("El fichero departamentos.xml no existe, la aplicación finalizará." );
            return;
        }

        // Leer datos del fichero XML de departamentos
        try (FileInputStream inputStream = new FileInputStream(fichero)) {
            XStream xstream = new XStream();
            xstream.addPermission(AnyTypePermission.ANY);
            xstream.processAnnotations(Departamento.class);
            xstream.registerConverter(new DateConverter("yyyy-MM-dd", null));
            xstream.registerConverter(new NullIntegerConverter());
            xstream.registerConverter(new NullDoubleConverter());
            listaDepartamentos = (ArrayList<Departamento>) xstream.fromXML(new FileInputStream(fichero));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Agregar

    // Modificar

    // Eliminar

    // listar -> (Muestra todos los empleados)

    // Mostrar -> (Muestra la informacion de un empleado)

    // Pedir datosEmpleado
}