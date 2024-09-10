package test;

import entity.Consumo.Consumo;
import entity.Consumo.ConsumoEtanol;
import entity.Consumo.ConsumoGasolina;
import entity.Motor.Motor;
import entity.Motor.MotorDoisZero;
import entity.Motor.MotorUmSeis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorUmSeisTest {

    @Test
    void deveRetornarQuinze() {
        Motor motor = new MotorUmSeis();
        Consumo consumo = new ConsumoGasolina();

        motor.setTipoConsumo(consumo);

        assertEquals(15, motor.calculaKmLitro());
    }

    @Test
    void deveRetornarSete() {
        Motor motor = new MotorUmSeis();
        Consumo consumo = new ConsumoEtanol();

        motor.setTipoConsumo(consumo);

        assertEquals(Double.parseDouble(String.valueOf(10.5)), motor.calculaKmLitro(), 0.01);
    }
}