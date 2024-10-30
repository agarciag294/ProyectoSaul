import Controladores.DepartamentoController;
import Controladores.EmpleadoController;
import vista.TextUI;

public class Main {
    public static void main(String[] args) {

        EmpleadoController empleadoController = new EmpleadoController();
        DepartamentoController departamentoController = new DepartamentoController();
        
        TextUI iu = new TextUI(departamentoController, empleadoController);
        iu.iniciar();
        
        empleadoController.list();
        
    }
}
