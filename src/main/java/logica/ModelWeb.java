package logica;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModelWeb {
    private String estado;
    private String contador;
    private Integer nivel;
    private List<String> notificaciones;

    public ModelWeb() {
        this.estado = "Apagado";
        this.contador = "0";
        this.nivel = 75;
        this.notificaciones = new ArrayList<>();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getContador() {
        return contador;
    }

    public void setContador(String contador) {
        this.contador = contador;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public List<String> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<String> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public void insertNoti(String n){
        notificaciones.add(fecha()+"---"+n);
    }

    public void eliminarNoti(){
        if (notificaciones.size()>1){
            notificaciones.remove(0);}
    }
    public String fecha(){
        Date fecha1 = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        return hourdateFormat.format(fecha1);
    }


}
