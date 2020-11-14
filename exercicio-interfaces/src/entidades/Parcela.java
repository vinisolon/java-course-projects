package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {

    private Date dataVencimentoParcela;
    private Double valorParcela;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Parcela(){}

    public Parcela(Date dataVencimentoParcela, Double valorParcela) {
        this.dataVencimentoParcela = dataVencimentoParcela;
        this.valorParcela = valorParcela;
    }

    public Date getDataVencimentoParcela() {
        return dataVencimentoParcela;
    }

    public void setDataVencimentoParcela(Date dataVencimentoParcela) {
        this.dataVencimentoParcela = dataVencimentoParcela;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Override
    public String toString() {
        return sdf.format(dataVencimentoParcela) + " - " + String.format("%.2f", valorParcela);
    }
}
