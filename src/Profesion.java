
public class Profesion {
    private String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String codigo;

    public Profesion() {
    }

    public Profesion(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String infoProfesion(){
        return String.format("profesion  : %s   codigo :%s ",nombre ,codigo);
    };
}