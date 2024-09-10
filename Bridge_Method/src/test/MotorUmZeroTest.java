package test;

import entity.Consumo.Consumo;
import entity.Consumo.ConsumoEtanol;
import entity.Consumo.ConsumoGasolina;
import entity.Motor.Motor;
import entity.Motor.MotorUmSeis;
import entity.Motor.MotorUmZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorUmZeroTest {

    @Test
    void deveRetornarQuinze() {
        Motor motor = new MotorUmZero();
        Consumo consumo = new ConsumoGasolina();

        motor.setTipoConsumo(consumo);

        assertEquals(20, motor.calculaKmLitro());
    }

    @Test
    void deveRetornarSete() {
        Motor motor = new MotorUmZero();
        Consumo consumo = new ConsumoEtanol();

        motor.setTipoConsumo(consumo);

        assertEquals(Double.parseDouble(String.valueOf(14.0)), motor.calculaKmLitro(), 0.01);
    }
}