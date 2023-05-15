package vp.vp;

import java.util.Objects;
import javax.persistence.*;

@Entity

public class Aluguel_produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cod;

	@Column(nullable = false)
	private int data_retirada;
	
	@Column(nullable = false)
	private int data_entrega;
	
	@Column(nullable = false)
	private int valor;

	@Override
	public String toString() {
		return "Aluguel_produtos [cod=" + cod + ", data_retirada=" + data_retirada + ", data_entrega=" + data_entrega
				+ ", valor=" + valor + "]";
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getData_retirada() {
		return data_retirada;
	}

	public void setData_retirada(int data_retirada) {
		this.data_retirada = data_retirada;
	}

	public int getData_entrega() {
		return data_entrega;
	}

	public void setData_entrega(int data_entrega) {
		this.data_entrega = data_entrega;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod, data_entrega, data_retirada, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluguel_produtos other = (Aluguel_produtos) obj;
		return cod == other.cod && data_entrega == other.data_entrega && data_retirada == other.data_retirada
				&& valor == other.valor;
	}

}
