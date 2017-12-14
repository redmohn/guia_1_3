package cl.polett.divisas.modelo;

import java.math.BigDecimal;

/**
 *
 * @author polett
 */
public class Divisa {
    
    private String nombre;
    private BigDecimal tasaCambio;

    public Divisa() {
    }

    public Divisa(String nombre, BigDecimal tasaCambio) {
        this.nombre = nombre;
        this.tasaCambio = tasaCambio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getTasaCambio() {
        return tasaCambio;
    }

    public void setTasaCambio(BigDecimal tasaCambio) {
        this.tasaCambio = tasaCambio;
    } 
}