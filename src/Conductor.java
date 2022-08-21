public class Conductor extends Persona {
    private int codigo;
    private Licencia licencia;
    public Conductor(String nombre, String run, String direccion, int codigo, Licencia licencia) {
        super(nombre, run, direccion);
        this.codigo = codigo;
        this.licencia = licencia;
    }
    public Conductor(int codigo, Licencia licencia) {
        this.codigo = codigo;
        this.licencia = licencia;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Licencia getLicencia() {
        return licencia;
    }
    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public String infoConductor(){
        return String.format("el nombre del conductor es : %s    y el codigo de la licencia es  :%d",nombre , licencia.getCodigo());
    };
}
