package datos;

import java.time.LocalDate;

public class PermisoPeriodo extends Permiso{
	private int cantDias;
	private boolean vacaciones;
	private Rodado rodado;
	
	public PermisoPeriodo() {}

	public PermisoPeriodo(Persona pedido, LocalDate fecha, int cantDias, boolean vacaciones, Rodado rodado) {
		super(pedido, fecha);
		this.cantDias = cantDias;
		this.vacaciones = vacaciones;
		this.setRodado(rodado);
	}

	public int getCantDias() {
		return cantDias;
	}

	public void setCantDias(int cantDias) {
		this.cantDias = cantDias;
	}

	public boolean isVacaciones() {
		return vacaciones;
	}

	public void setVacaciones(boolean vacaciones) {
		this.vacaciones = vacaciones;
	}

	public Rodado getRodado() {
		return rodado;
	}

	public void setRodado(Rodado rodado) {
		this.rodado = rodado;
	}

	@Override
	public String toString() {
		return "\nPermisoPeriodo [" + super.toString() + "cantDias=" + cantDias + ", vacaciones=" + vacaciones + ", rodado=" + rodado + "]";
	}

	@Override
	public boolean activo(LocalDate dia) {
		boolean activo = false;
		LocalDate fechaVence = getFecha().plusDays(cantDias);
		if ((dia.isAfter(getFecha()) || dia.equals(getFecha())) && (dia.isBefore(fechaVence) || dia.equals(fechaVence))) {
			activo = true;
		}
		return activo;
	}
	
	

}
