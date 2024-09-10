package test;

import entity.Consumo.Consumo;
import entity.Consumo.ConsumoEtanol;
import entity.Consumo.ConsumoGasolina;
import entity.Motor.Motor;
import entity.Motor.MotorDoisZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorDoisZeroTest {

    @Test
    void deveRetornarDez() {
        Motor motor = new MotorDoisZero();
        Consumo consumo = new ConsumoGasolina();

        motor.setTipoConsumo(consumo);

        assertEquals(10, motor.calculaKmLitro());
    }

    @Test
    void deveRetornarSete() {
        Motor motor = new MotorDoisZero();
        Consumo consumo = new ConsumoEtanol();

        motor.setTipoConsumo(consumo);

        assertEquals(7, motor.calculaKmLitro());
    }
}