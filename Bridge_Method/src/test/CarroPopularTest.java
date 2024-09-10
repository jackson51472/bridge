package test;

import entity.Carro.Carro;
import entity.Carro.CarroPopular;
import entity.Consumo.Consumo;
import entity.Consumo.ConsumoEtanol;
import entity.Consumo.ConsumoGasolina;
import entity.Motor.Motor;
import entity.Motor.MotorDoisZero;
import entity.Motor.MotorUmSeis;
import entity.Motor.MotorUmZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroPopularTest {

    @Test
    void deveRetornarCarroPopularUmZeroGasolina() {
        Carro carro = new CarroPopular();
        Motor motor = new MotorUmZero();
        Consumo consumo = new ConsumoGasolina();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 63.0 Consumo: 20.0", carro.retornaConfiguracoesCarro());

    }

    @Test
    void deveRetornarCarroPopularUmZeroEtanol() {
        Carro carro = new CarroPopular();
        Motor motor = new MotorUmZero();
        Consumo consumo = new ConsumoEtanol();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 63.0 Consumo: 14.0", carro.retornaConfiguracoesCarro());

    }

    @Test
    void deveRetornarCarroPopularUmSeisGasolina() {
        Carro carro = new CarroPopular();
        Motor motor = new MotorUmSeis();
        Consumo consumo = new ConsumoGasolina();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 99.0 Consumo: 15.0", carro.retornaConfiguracoesCarro());

    }

    @Test
    void deveRetornarCarroPopularUmSeisEtanol() {
        CarroPopular carro = new CarroPopular();
        Motor motor = new MotorUmSeis();
        Consumo consumo = new ConsumoEtanol();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 99.0 Consumo: 10.5", carro.retornaConfiguracoesCarro());

    }

    @Test
    void deveRetornarCarroPopularDoisZeroEtanol() {
        Carro carro = new CarroPopular();
        Motor motor = new MotorDoisZero();
        Consumo consumo = new ConsumoEtanol();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 126.0 Consumo: 7.0", carro.retornaConfiguracoesCarro());

    }

    @Test
    void deveRetornarCarroPopularDoisZeroGasolina() {
        Carro carro = new CarroPopular();
        Motor motor = new MotorDoisZero();
        Consumo consumo = new ConsumoGasolina();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 126.0 Consumo: 10.0", carro.retornaConfiguracoesCarro());

    }

}