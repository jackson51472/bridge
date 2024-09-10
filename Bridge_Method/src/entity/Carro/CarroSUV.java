package entity.Carro;

public class CarroSUV extends Carro{
    public String retornaConfiguracoesCarro(){
        return "Potencia: " + (motor.getPotencia() * 2)+ " Consumo: " + motor.calculaKmLitro();
    }
}
