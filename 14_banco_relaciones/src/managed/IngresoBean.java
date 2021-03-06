/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import modelo.service.GestionCajero;

@ManagedBean
@RequestScoped
public class IngresoBean {
    
    @ManagedProperty("#{validacionBean}")
    private ValidacionBean validacionBean;
    private double cantidad;
    
	@ManagedProperty("#{gcajero}")
    GestionCajero gcajero;

    public GestionCajero getGcajero() {
		return gcajero;
	}

	public void setGcajero(GestionCajero gcajero) {
		this.gcajero = gcajero;
	}
    
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public ValidacionBean getValidacionBean() {
        return validacionBean;
    }

    public void setValidacionBean(ValidacionBean validacionBean) {
        this.validacionBean = validacionBean;
    }
    
    public String ingresar(){        
    	gcajero.ingresar(validacionBean.getCodigoCuenta(), cantidad);
        return "operaciones";
    }
    
    
}
