package entity.Carro;

public class CarroSedan extends Carro{

    public String retornaConfiguracoesCarro(){
        return "Potencia: " + motor.getPotencia()  + " Consumo: " + motor.calculaKmLitro();

    }

}
