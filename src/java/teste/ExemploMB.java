/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class ExemploMB {

    /**
     * Creates a new instance of ExemploMB
     */
    public ExemploMB() {
    }
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
