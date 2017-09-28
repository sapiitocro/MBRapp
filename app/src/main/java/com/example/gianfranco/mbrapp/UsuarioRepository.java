package com.example.gianfranco.mbrapp;

public class UsuarioRepository {

    private String validar;

    private String usuarioPersona;

    private String clavePersona;

    public void setValidar(String validar) {
        this.validar = validar;
    }

    public String getValidar() {
        return validar;
    }

    private static UsuarioRepository persona = null;

    public static UsuarioRepository crearPersona() {

        if (persona == null) { persona = new UsuarioRepository(); }
        return persona;
    }

    public String puente(Usuario usuario){

        String[] usernamesCliente = {"cliente"};
        String[] passwordsCliente = {"cliente"};
        String[] usernamesSupervisor = {"supervisor"};
        String[] passwordsSupervisor = {"supervisor"};
        String[] usernamesTecnico = {"tecnico"};
        String[] passwordsTecnico = {"tecnico"};

        usuarioPersona = usuario.getUsurname();
        clavePersona = usuario.getClave();

        for(int i=0;i<=0;i++){

            if(usernamesCliente[i].equalsIgnoreCase(usuarioPersona) && passwordsCliente[i].equals(clavePersona)){
                setValidar("siCliente");
                break;
            }else if (usernamesSupervisor[i].equalsIgnoreCase(usuarioPersona) && passwordsSupervisor[i].equals(clavePersona)){
                setValidar("siSupervisor");
                break;
            }else if (usernamesTecnico[i].equalsIgnoreCase(usuarioPersona) && passwordsTecnico[i].equals(clavePersona)){
                setValidar("siTecnico");
                break;
            }
            else{
                setValidar("no");
            }
        }
        return getValidar();
    }
}
