public class Usuario {
    private String nombre;
    private String email;

    //CONSTRUCTOR VACÍO:
    public Usuario(){
    };
    //CONSTRUCTO PARAMETRIZADO:
    public Usuario (String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }
    // GETTERS Y SETTERS:
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}