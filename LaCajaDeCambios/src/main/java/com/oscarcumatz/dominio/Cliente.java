package com.oscarcumatz.dominio;
 
 
public class Cliente {
    private int codigoCliente;  
    private String nombreCliente;  
    private String telefonoCliente;   
    private String correoCliente;   
    private String direccion;   
    private String contrasena;

    public Cliente(){
    }
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
 
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getTelefonoCliente() {
        return telefonoCliente;
    }
    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    public String getCorreoCliente() {
        return correoCliente;
    }
    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
 
    @Override
    public String toString() {
        return "Cliente{" + "codigoCliente=" + codigoCliente + 
                ", nombreCliente=" + nombreCliente + 
                ", telefonoCliente=" + telefonoCliente + 
                ", correoCliente=" + correoCliente + 
                ", direccion=" + direccion + 
                ", contrasena=" + contrasena + '}';

    }
 
    

}
 