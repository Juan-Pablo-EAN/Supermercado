
import javax.swing.JOptionPane;

public class Empleado {

    private String nombre;
    private int cedula;
    private String departamento;
    private String posicion;
    private int salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    //mostrar los datos de un trabajador
    @Override
   public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nCedula: ");
        sb.append(cedula);
        sb.append("\nDepartamento: ");
        sb.append(departamento);
        sb.append("\nPosición: ");
        sb.append(posicion);
        sb.append("\nSalario: ");
        sb.append(salario);
        return sb.toString();
    }
}//Fin de la Clase Empleado

