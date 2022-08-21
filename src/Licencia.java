public class Licencia {
    private String tipo;
    private int codigo;
    public Licencia() {
    }
    public Licencia(String tipo, int codigo) {
        this.tipo = tipo;
        this.codigo = codigo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String infoLicencia(){
        return String.format("tipo licencia  : %s   codigo :%d",tipo ,codigo);
    };
}
