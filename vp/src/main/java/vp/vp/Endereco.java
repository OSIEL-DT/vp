package vp.vp;

import java.util.Objects;

public class Endereco {
	
	private String rua;
	private String bairo;
	private int cep;
	private String estado;	
	
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairo=" + bairo + ", cep=" + cep + ", estado=" + estado + "]";
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairo() {
		return bairo;
	}
	public void setBairo(String bairo) {
		this.bairo = bairo;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bairo, cep, estado, rua);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairo, other.bairo) && cep == other.cep && Objects.equals(estado, other.estado)
				&& Objects.equals(rua, other.rua);
	}
	
	

}
