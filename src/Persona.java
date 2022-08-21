abstract class Persona {

    protected String nombre;
    protected String run;
    protected String direccion;
    public Persona(String nombre, String run, String direccion) {
        this.nombre = nombre;
        this.run = run;
        this.direccion = direccion;
    }
    public Persona() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRun() {
        return run;
    }
    public void setRun(String run) {
        this.run = run;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    



}
