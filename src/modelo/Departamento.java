package modelo;
import java.util.Objects;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Departamento
 */
@XStreamAlias("departamento")
public class Departamento {

// Atributos

    private Integer dept_no;
    private String dnombre;
    private String loc;
    
//Constructor vacio

public Departamento() {
}

//Constructor

    public Departamento(Integer dept_no, String dnombre, String loc) {
        this.dept_no = dept_no;
        this.dnombre = dnombre;
        this.loc = loc;
    }


// Getters y setters

    public Integer getDept_no() {
        return this.dept_no;
    }

    public void setDept_no(Integer dept_no) {
        this.dept_no = dept_no;
    }

    public String getDnombre() {
        return this.dnombre;
    }

    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    public String getLoc() {
        return this.loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    

    @Override
    public String toString() {
        return "{" +
            " dept_no='" + getDept_no() + "'" +
            ", dnombre='" + getDnombre() + "'" +
            ", loc='" + getLoc() + "'" +
            "}";
    }

}