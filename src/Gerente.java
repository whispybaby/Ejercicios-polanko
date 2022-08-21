public class Gerente extends Persona {
    private String email;
    private String clave;
    private String telefono;
    private Profesion profesion;
    public Gerente(String nombre, String run, String direccion, String email, String clave, String telefono,
            Profesion profesion) {
        super(nombre, run, direccion);
        this.email = email;
        this.clave = clave;
        this.telefono = telefono;
        this.profesion = profesion;
    }
    public Gerente(String email, String clave, String telefono, Profesion profesion) {
        this.email = email;
        this.clave = clave;
        this.telefono = telefono;
        this.profesion = profesion;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Profesion getProfesion() {
        return profesion;
    }
    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }

    public String infoGerente(){
        return String.format("el nombre es : %s  el run es :%s y la profesion es :%s",nombre ,run , profesion.getNombre());
    };
}
