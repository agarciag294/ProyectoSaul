
/** /
 * Empleado
 */
package modelo;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("empleado")
public class Empleado {

    //Atributos
    private Integer emp_no;
    private String apellido;
    private Integer dir;
    private Double salario;
    private String oficio;
    private Date fecha_alt;
    private Double comision;
    private Integer dept_no;


    //Constructor vacio
    public Empleado() {
    }
    
    //Constructor 
    public Empleado(Integer emp_no, String apellido, Integer dir, double salario, String oficio, Date fecha_alt, Double comision, Integer dept_no) {
        this.emp_no = emp_no;
        this.apellido = apellido;
        this.dir = dir;
        this.salario = salario;
        this.oficio = oficio;
        this.fecha_alt = fecha_alt;
        this.comision = comision;
        this.dept_no = dept_no;
    }
    

    //Getters And Setters
    public Integer getEmp_no() {
        return this.emp_no;
    }

    public void setEmp_no(Integer emp_no) {
        this.emp_no = emp_no;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDir() {
        return this.dir;
    }

    public void setDir(Integer dir) {
        this.dir = dir;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getOficio() {
        return this.oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public Date getFecha_alt() {
        return this.fecha_alt;
    }

    public void setFecha_alt(Date fecha_alt) {
        this.fecha_alt = fecha_alt;
    }

    public Double getComision() {
        return this.comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    public Integer getDept_no() {
        return this.dept_no;
    }

    public void setDept_no(Integer dept_no) {
        this.dept_no = dept_no;
    }
    //toString()

    @Override
    public String toString() {
        return "{" +
            " emp_no='" + getEmp_no() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", dir='" + getDir() + "'" +
            ", salario='" + getSalario() + "'" +
            ", oficio='" + getOficio() + "'" +
            ", fecha_alt='" + getFecha_alt() + "'" +
            ", comision='" + getComision() + "'" +
            ", dept_no='" + getDept_no() + "'" +
            "}";
    }
    
 
}