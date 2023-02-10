public abstract class Mascota{
    private String nombre; 
    private String raza;
    private int edad; 

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isPeligroso() {
        return this.peligroso;
    }

    public boolean getPeligroso() {
        return this.peligroso;
    }

    public void setPeligroso(boolean peligroso) {
        this.peligroso = peligroso;
    }

    public boolean isPerdido() {
        return this.perdido;
    }

    public boolean getPerdido() {
        return this.perdido;
    }

    public void setPerdido(boolean perdido) {
        this.perdido = perdido;
    }
    private boolean peligroso; 
    private boolean perdido; 




}