package entity.Carro;

public class CarroPopular extends Carro{

    public String retornaConfiguracoesCarro(){
        return "Potencia: " + (motor.getPotencia() * 0.9)+ " Consumo: " + motor.calculaKmLitro();
    }

}
