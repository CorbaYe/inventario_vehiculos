public class cls_inventario{
    private String str_propietario;
    private String str_placa;
    private String str_fecha;
    private int int_modelo;
    private String str_color;
    private String str_fichaTecnica;

    public cls_inventario(String p, String pla,String fec, int mo, String col, String fic){
        this.str_propietario = p;
        this.str_placa = pla;
        this.str_fecha = fec;
        this.int_modelo = mo;
        this.str_color = col;
        this.str_fichaTecnica = fic;
    }

    // Metodos getters
    public String getPropietario() {
        return this.str_propietario;
    }

    public String getPlaca() {
        return this.str_placa;
    }

    public String getFecha() {
        return this.str_fecha;
    }

    public int getModelo() {
        return this.int_modelo;
    }

    public String getColor() {
        return this.str_color;
    }

    public String getFichaTecnica() {
        return this.str_fichaTecnica;
    }

    
}