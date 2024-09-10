package entity.Motor;

import entity.Consumo.Consumo;

public abstract class Motor {

    protected int potencia;
    protected Float kilometragem;
    protected Consumo tipoConsumo;

    public abstract Float calculaKmLitro();

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Float getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(Float kilometragem) {
        this.kilometragem = kilometragem;
    }

    public Consumo getTipoConsumo() {
        return tipoConsumo;
    }

    public void setTipoConsumo(Consumo tipoConsumo) {
        this.tipoConsumo = tipoConsumo;
    }

}
