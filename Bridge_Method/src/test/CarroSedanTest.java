package test;

import entity.Carro.Carro;
import entity.Carro.CarroPopular;
import entity.Carro.CarroSedan;
import entity.Consumo.Consumo;
import entity.Consumo.ConsumoEtanol;
import entity.Consumo.ConsumoGasolina;
import entity.Motor.Motor;
import entity.Motor.MotorDoisZero;
import entity.Motor.MotorUmSeis;
import entity.Motor.MotorUmZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroSedanTest {

    @Test
    void deveRetornarCarroSedanUmZeroEtanol() {
        Carro carro = new CarroSedan();
        Motor motor = new MotorUmZero();
        Consumo consumo = new ConsumoEtanol();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 70 Consumo: 14.0", carro.retornaConfiguracoesCarro());

    }

    @Test
    void deveRetornarCarroSedanUmZeroGasolina() {
        Carro carro = new CarroSedan();
        Motor motor = new MotorUmZero();
        Consumo consumo = new ConsumoGasolina();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 70 Consumo: 20.0", carro.retornaConfiguracoesCarro());

    }

    @Test
    void deveRetornarCarroSedanUmSeisGasolina() {
        Carro carro = new CarroSedan();
        Motor motor = new MotorUmSeis();
        Consumo consumo = new ConsumoGasolina();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 110 Consumo: 15.0", carro.retornaConfiguracoesCarro());
    }

    @Test
    void deveRetornarCarroSedanUmSeisEtanol() {
        Carro carro = new CarroSedan();
        Motor motor = new MotorUmSeis();
        Consumo consumo = new ConsumoEtanol();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 110 Consumo: 10.5", carro.retornaConfiguracoesCarro());
    }

    @Test
    void deveRetornarCarroSedanDoisZeroEtanol() {
        Carro carro = new CarroSedan();
        Motor motor = new MotorDoisZero();
        Consumo consumo = new ConsumoEtanol();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 140 Consumo: 7.0", carro.retornaConfiguracoesCarro());
    }

    @Test
    void deveRetornarCarroSedanDoisZeroGasolina() {
        Carro carro = new CarroSedan();
        Motor motor = new MotorDoisZero();
        Consumo consumo = new ConsumoGasolina();

        motor.setTipoConsumo(consumo);
        carro.setMotor(motor);

        assertEquals("Potencia: 140 Consumo: 10.0", carro.retornaConfiguracoesCarro());
    }
}