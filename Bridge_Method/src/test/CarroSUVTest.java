package test;

import entity.Carro.Carro;
import entity.Carro.CarroSUV;
import entity.Consumo.Consumo;
import entity.Consumo.ConsumoEtanol;
import entity.Consumo.ConsumoGasolina;
import entity.Motor.Motor;
import entity.Motor.MotorDoisZero;
import entity.Motor.MotorUmSeis;
import entity.Motor.MotorUmZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroSUVTest {

    @Test
    void deveRetornarCarroSUVUmZeroEtanol() {
        Carro carro = new CarroSUV();
        Motor motor = new MotorUmZero();
        Consumo consumo = new ConsumoEtanol();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 140 Consumo: 14.0", carro.retornaConfiguracoesCarro());

    }

    @Test
    void deveRetornarCarroSUVUmZeroGasolina() {
        Carro carro = new CarroSUV();
        Motor motor = new MotorUmZero();
        Consumo consumo = new ConsumoGasolina();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 140 Consumo: 20.0", carro.retornaConfiguracoesCarro());

    }

    @Test
    void deveRetornarCarroSUVUmSeisGasolina() {
        Carro carro = new CarroSUV();
        Motor motor = new MotorUmSeis();
        Consumo consumo = new ConsumoGasolina();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 220 Consumo: 15.0", carro.retornaConfiguracoesCarro());

    }

    @Test
    void deveRetornarCarroSUVUmSeisEtanol() {
        Carro carro = new CarroSUV();
        Motor motor = new MotorUmSeis();
        Consumo consumo = new ConsumoEtanol();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 220 Consumo: 10.5", carro.retornaConfiguracoesCarro());

    }

    @Test
    void deveRetornarCarroSUVDoisZeroEtanol() {
        Carro carro = new CarroSUV();
        Motor motor = new MotorDoisZero();
        Consumo consumo = new ConsumoEtanol();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 280 Consumo: 7.0", carro.retornaConfiguracoesCarro());

    }

    @Test
    void deveRetornarCarroSUVDoisZerGasolina() {
        Carro carro = new CarroSUV();
        Motor motor = new MotorDoisZero();
        Consumo consumo = new ConsumoGasolina();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 280 Consumo: 10.0", carro.retornaConfiguracoesCarro());

    }

}