package Modelo;

public class Usuario {
    protected String correo;
    protected String contrasena;
    protected TipoUsuario tipo;

    public Usuario(String correo, String contrasena, TipoUsuario tipo) {
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
}
