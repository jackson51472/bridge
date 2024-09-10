package entity.Carro;

import entity.Motor.Motor;

public abstract class Carro {

    protected Motor motor;

    public String retornaConfiguracoesCarro(){
        return "Potencia: " + motor.getPotencia()+ "Consumo: " + motor.calculaKmLitro();
    }


    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
