import javax.swing.JOptionPane;

public class app_inventario {
    public static void main(String[] args) {
        fnt_menu(true);
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
