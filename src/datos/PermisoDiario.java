package datos;

import java.time.LocalDate;

public class PermisoDiario extends Permiso{
	private String motivo;
	
	public PermisoDiario() {}

	public PermisoDiario(Persona pedido, LocalDate fecha, String motivo) {
		super(pedido, fecha);
		this.motivo = motivo;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	@Override
	public String toString() {
		return "\nPermisoDiario [" + super.toString() + "motivo=" + motivo + "]";
	}

	@Override
	public boolean activo(LocalDate dia) {
		return dia.equals(this.fecha);
	}
	
	

}
