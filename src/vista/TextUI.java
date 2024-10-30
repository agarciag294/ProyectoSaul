
package vista;

import Controladores.DepartamentoController;
import Controladores.EmpleadoController;

public class TextUI {

    private DepartamentoController departamentoController;
    private EmpleadoController empleadoController;

    public TextUI() {
    }

    public TextUI(DepartamentoController departamentoController, EmpleadoController empleadoController) {
        this.departamentoController = departamentoController;
        this.empleadoController = empleadoController;
    }

    public void iniciar() {
        cargarFicherosXML();
    }

    private void cargarFicherosXML() {
        empleadoController.cargarFicheroEmpleados();
//        departamentoController.cargarFicheroDepartamentos();
    }

}