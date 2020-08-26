package paquete;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ProyectoEmpleados {

    final static int cant = 20;
    static Empleado[] empleados = new Empleado[cant];
    static int indice = 0;
    static int n = 0;
    static String nombre = "";
    static int cedula = 0;
    static String departamento = "";
    static String posicion = "";
    static int salario = 0;
    static int cantidadC = 0;
    static int cantidadD = 0;
    static int cantidadDo = 0;
    static int cantidadO = 0;
    static int cantidadA = 0;
    static int cantidadJ = 0;
    static int cantidadCa = 0;
    static int cantidadDom = 0;

    public static void main(String[] args) {
        int i = 0;
        int eleccion = 0;
        int eleccion2 = 0;
        int eleccion3 = 0;

        do {
            eleccion = Integer.parseInt((String) JOptionPane.showInputDialog(null,
                    "Menu de Opciones\n\n"
                    + "1. Ingresar un nuevo empleado\n"
                    + "2. Mostrar los datos de los empleado\n"
                    + "3. Salarios por departamento\n"
                    + "4. Cantidad de empleados por posición\n"
                    + "5. Cambiar los datos de un empleado\n"
                    + "6. Salir\n", "Supermercado Fontibón", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/paquete/apple.png"), null, null));
            if (eleccion == 1) {
                do {
                    n = Integer.parseInt((String) JOptionPane.showInputDialog("Número de empleados"));

                } while (n < 0 || n > cant);

                for (i = 1; i <= n; i++) {

                    nombre = (String) JOptionPane.showInputDialog(null, "Nombre del empleado " + i, "Supermercado Fontibón", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/paquete/apple.png"), null, null);
                    cedula = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Cedula del empleado " + nombre, "Supermercado Fontibón", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/paquete/apple.png"), null, null));
                    eleccion2 = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Departamento del empleado " + nombre + "\n"
                            + "(Escribe el número que corresponda)\n"
                            + "1. Caja\n"
                            + "2. Distribución\n"
                            + "3. Domicilios\n"
                            + "4. Oficina\n", "Supermercado Fontibón", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/paquete/apple.png"), null, null));
                    if (eleccion2 == 1) {
                        departamento = "Caja";
                    } else if (eleccion2 == 2) {
                        departamento = "Distribución";
                    } else if (eleccion2 == 3) {
                        departamento = "Domicilios";
                    } else if (eleccion2 == 4) {
                        departamento = "Oficina";
                    } else {
                        JOptionPane.showMessageDialog(null, "La elección que escogiste es incorrecta", "Supermercado Fontibón", JOptionPane.YES_NO_OPTION);
                    }
                    eleccion3 = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Posición del empleado " + nombre
                            + "(Escribe el número que corresponda)\n"
                            + "1. Jefe\n"
                            + "2. Ayudante\n"
                            + "3. Cajero\n"
                            + "4. Domiciliario\n", "Supermercado Fontibón", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/paquete/apple.png"), null, null));
                    if (eleccion3 == 1) {
                        posicion = "Jefe";
                    } else if (eleccion3 == 2) {
                        posicion = "Ayudante";
                    } else if (eleccion3 == 3) {
                        posicion = "Cajero";
                    } else if (eleccion3 == 4) {
                        posicion = "Domiciliario";
                    } else {
                        JOptionPane.showMessageDialog(null, "La elección que escogiste es incorrecta", "Supermercado Fontibón", JOptionPane.YES_NO_OPTION);
                    }
                    salario = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Salario del empleado " + nombre, "Supermercado Fontibón", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/paquete/apple.png"), null, null));
                    arreglo();
                    contador();
                    cuantos();

                }
            } else if (eleccion == 2) {
                mostrar();
            } else if (eleccion == 3) {
                totales();
            } else if (eleccion == 4) {
                posiciones();
            } else if (eleccion == 5) {
                cambiar();
            } else if (eleccion == 6) {
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "La elección que escogiste es incorrecta", "Supermercado Fontibón", JOptionPane.YES_NO_OPTION);
            }
        } while (eleccion != 6);
    }

    public static void arreglo() {
        Empleado e;
        e = new Empleado();

        e.setNombre(nombre);
        e.setCedula(cedula);
        e.setDepartamento(departamento);
        e.setPosicion(posicion);
        e.setSalario(salario);
        empleados[indice] = e;
        indice++;
    }

    public static void cambiar() {
        String name = JOptionPane.showInputDialog("Escribe el nombre del empleado");
        int j = 0;
        while (j <= empleados.length) {
            String name2 = empleados[j].getNombre();
            if (name.equals(name2)) {
                int eleccion3 = Integer.parseInt((String) JOptionPane.showInputDialog(null, "¿Que dato deseas cambiar?\n"
                        + "(Escribe el número que corresponda)\n"
                        + "1. Nombre\n"
                        + "2. Cedula\n"
                        + "3. Departamento\n"
                        + "4. Posición\n"
                        + "5. Salario\n", "Supermercado Fontibón", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/paquete/apple.png"), null, null));
                switch (eleccion3) {
                    case 1:
                        String nombre2 = JOptionPane.showInputDialog("Escirbe el nuevo nombre de " + name);
                        empleados[j].setNombre(nombre2);
                        JOptionPane.showMessageDialog(null, "¡Nombre cambiado exitosamente!");
                        break;
                    case 2:
                        int cedula2 = Integer.parseInt(JOptionPane.showInputDialog("Escirbe la nueva cedula de " + name));
                        empleados[j].setCedula(cedula2);
                        JOptionPane.showMessageDialog(null, "¡Cedula cambiada exitosamente!");
                        break;
                    case 3:
                        String dept2 = JOptionPane.showInputDialog("Escirbe el nuevo departamento de " + name);
                        empleados[j].setDepartamento(dept2);
                        JOptionPane.showMessageDialog(null, "¡Departamento cambiado exitosamente!");
                        break;
                    case 4:
                        String pos2 = JOptionPane.showInputDialog("Escirbe la nueva posición de " + name);
                        empleados[j].setPosicion(pos2);
                        JOptionPane.showMessageDialog(null, "¡Posición cambiada exitosamente!");
                        break;
                    case 5:
                        int salario2 = Integer.parseInt(JOptionPane.showInputDialog("Escirbe el nuevo salario de " + name));
                        empleados[j].setSalario(salario2);
                        JOptionPane.showMessageDialog(null, "¡Salario cambiado exitosamente!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "El valor que escribiste es incorrecto, revisa tu ortografía", "", JOptionPane.YES_NO_OPTION);
                }
                return;
            } else {
                JOptionPane.showMessageDialog(null, "El valor que escribiste es incorrecto, revisa tu ortografía", "", JOptionPane.YES_NO_OPTION);
            }
            j++;
        }
    }

    //método para mostrar todos los empleados
    public static void mostrar() {
        for (int i = 0; i < indice; i++) {
            JOptionPane.showMessageDialog(null, empleados[i]);
        }
    }

    public static void cuantos() {
        if ("Jefe".equals(posicion)) {
            cantidadJ++;
        } else if ("Ayudante".equals(posicion)) {
            cantidadA++;
        } else if ("Cajero".equals(posicion)) {
            cantidadCa++;
        } else if ("Domiciliario".equals(posicion)) {
            cantidadDom++;
        }
    }

    public static void posiciones() {
        JOptionPane.showMessageDialog(null, "Empleados jefes: " + cantidadJ + "\n"
                + "Empleados ayudantes: " + cantidadA + "\n"
                + "Empleados cajeros: " + cantidadCa + "\n"
                + "Empleados domiciliarios: " + cantidadDom + "\n");
    }

    public static void contador() {
        if ("Caja".equals(departamento)) {
            cantidadC += salario;
        } else if ("Distribución".equals(departamento)) {
            cantidadD += salario;
        } else if ("Domicilios".equals(departamento)) {
            cantidadDo += salario;
        } else if ("Oficina".equals(departamento)) {
            cantidadO += salario;
        }
    }

    public static void totales() {
        JOptionPane.showMessageDialog(null, "Salario total en Caja es: $" + cantidadC + "\n"
                + "Salario total en Distribución es: $" + cantidadD + "\n"
                + "Salario total en Domicilios es: $" + cantidadDo + "\n"
                + "Salario total en Oficina es: $" + cantidadO + "\n");
    }

}

