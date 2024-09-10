package entity.Motor;

import entity.Consumo.Consumo;

import java.util.Collections;


public class MotorUmZero extends Motor{
    private int potencia= 70;
    private Float kilometragem = 20f;
    private Consumo tipoConsumo;

    public Float calculaKmLitro(){
        return this.kilometragem * this.tipoConsumo.percentualConsumo();
    }

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
