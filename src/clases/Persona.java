package clases;
import java.awt.*;
import javax.swing.*;
import java.util.*;
/**
 * 
 * @author MARIO LUZARDO
 *
 */
public class Persona {
	/**
	 * @atrib
	 */
	private String nombre;
	private String apellido;
	private int edad;
	private String direccion;
	private boolean estado;
	/**
	 * 
	 * @Constructor @default
	 */
	public Persona(String nombre,String apellido,int edad, String direccion, boolean estado){
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		this.edad=edad;
		this.estado=estado;
	}
     
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * 
	 * @return
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * 
	 * @return
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * 
	 * @return
	 */
	public boolean getEstado() {
		return estado;
	}
	/**
	 * 
	 * @param estado
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", direccion=" + direccion
				+ ", estado=" + estado + "]";
	}
	
}
