package dominio;

import java.util.Date;

public class Docencia {
	private Date dataInicio;
	private Date dataFim;
	
	public Docencia(Date dataInicio, Date dataFim) {
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

}
