import javax.swing.JOptionPane;

public class app_inventario {
    static cls_inventario [] inventario = new cls_inventario[50];
    static int int_posicion = 0;
    public static void main(String[] args) {
        fnt_menu(true);
    }

    private static void fnt_agregar(String propietario, String placa,String fecha, int modelo, String color, String fichaTecnica){
        if(propietario.equals("") || placa.equals("") || fecha.equals("") || color.equals("") || fichaTecnica.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos requeridos", "Registro", JOptionPane.ERROR_MESSAGE);
        }else{
            inventario[int_posicion] = new cls_inventario(propietario, placa, fecha, modelo, color, fichaTecnica);
            int_posicion++;
            JOptionPane.showMessageDialog(null, "Datos almacenados con éxito", "Registro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void fnt_selector(int opcion){
        switch(opcion){
            case 1: String propietario = JOptionPane.showInputDialog(null, "Propietario");
                    String placa = JOptionPane.showInputDialog(null, "Placa");
                    String fecha = JOptionPane.showInputDialog(null, "Fecha");
                    int modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Modelo"));
                    String color = JOptionPane.showInputDialog(null, "Color");
                    String fichaTecnica = JOptionPane.showInputDialog(null, "Ficha Tecnica");
                    fnt_agregar(propietario, placa, fecha, modelo, color, fichaTecnica);
                    break;
            case 4: fnt_menu(false);
                    break;
        }
    }

    private static void fnt_menu(boolean m){
        do{
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "<<< MENU PRINCIPAL >>>\n1. Registrar\n2. Consultar\n3. Actaualizar\n4. Salir"));
        }while(m);
    }

}
