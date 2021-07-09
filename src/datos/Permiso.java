package datos;

import java.time.LocalDate;
import java.util.Set;

public abstract class Permiso {
	protected int idPermiso;
	protected Persona pedido;
	protected LocalDate fecha;
	protected Set<Lugar> desdeHasta;
	
	public Permiso() {}

	public Permiso(Persona pedido, LocalDate fecha) {
		super();
		this.setPedido(pedido);
		this.fecha = fecha;
	}

	public int getIdPermiso() {
		return idPermiso;
	}

	protected void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}

	public Persona getPedido() {
		return pedido;
	}

	public void setPedido(Persona pedido) {
		this.pedido = pedido;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Set<Lugar> getDesdeHasta() {
		return desdeHasta;
	}

	public void setDesdeHasta(Set<Lugar> desdeHasta) {
		this.desdeHasta = desdeHasta;
	}

	@Override
	public String toString() {
		return "\nPermiso [idPermiso=" + idPermiso + ", pedido=" + pedido + ", fecha=" + fecha + ", desdeHasta="
				+ desdeHasta + "]";
	}
	
	public abstract boolean activo (LocalDate dia);

}
