package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

    private String codigoContrato;
    private Date dataContrato;
    private Double valorTotalContrato;

    private List<Parcela> parcelas = new ArrayList<>();

    public Contrato(){}

    public Contrato(String codigoContrato, Double valorTotalContrato) {
        this.codigoContrato = codigoContrato;
        this.dataContrato = new Date();
        this.valorTotalContrato = valorTotalContrato;
    }

    public String getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(String codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorTotalContrato() {
        return valorTotalContrato;
    }

    public void setValorTotalContrato(Double valorTotalContrato) {
        this.valorTotalContrato = valorTotalContrato;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }
}
