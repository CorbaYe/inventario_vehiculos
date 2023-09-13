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

    private static void fnt_menu(boolean m){
        do{
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "<<< MENU PRINCIPAL >>>\n1. Registrar\n2. Consultar\n3. Actaualizar\n4. Salir"));

            switch(menu){
                case 4: m = false;
            }
        }while(m);
    }

}
