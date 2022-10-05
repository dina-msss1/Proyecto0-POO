package Modelo;

public class SuperUsuario extends Usuario{

    public SuperUsuario() {
        super("superusuario", "$uper2022", TipoUsuario.Administrador);
    }

    @Override
    public void setCorreo(String correo) {}

    @Override
    public void setContrasena(String contrasena) {}

    @Override
    public void setTipo(TipoUsuario tipo) {}
}
