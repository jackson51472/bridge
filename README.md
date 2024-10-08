# Padrão de Projeto: Bridge

O padrão Bridge é um padrão de design estrutural que tem como objetivo desacoplar a abstração da sua implementação,
permitindo que ambos possam evoluir de forma independente. Ele é especialmente útil quando existem múltiplas variantes
de abstração e implementação, evitando que o número de subclasses cresça de forma descontrolada.

## Estrutura:

- **Abstração**: Define a interface principal e mantém uma referência para o objeto de implementação.
- **Implementação**: Define a interface para as classes que fornecerão a implementação real.
- **Refined Abstraction**: Estende a abstração, adicionando mais funcionalidades específicas.
- **Concrete Implementor**: Fornece a implementação concreta da interface de implementação.

## Benefícios:

- Desacoplamento: A abstração e a implementação podem ser desenvolvidas de forma separada.
- Flexibilidade: Novas abstrações ou implementações podem ser introduzidas sem alterar o código existente.
- Extensibilidade: Facilita a adição de novas funcionalidades sem criar um grande número de subclasses.

## Exemplo:

Imagine que você tem diferentes tipos de carros (como Sedã, SUV) e diferentes tipos de motores (Motor a Gasolina, Motor a Etanol).
Com o padrão Bridge, você pode criar uma classe `Carro` que usa uma interface `Motor` para representar diferentes tipos de motores,
permitindo que qualquer carro possa ser combinado com qualquer motor, sem a necessidade de criar várias subclasses.

- A classe `Carro` define a lógica comum de todos os carros (como calcular o consumo de combustível), enquanto os motores (`MotorGasolina`, `MotorEtanol`) implementam os detalhes específicos do combustível que usam.
- Assim, um `Sedã` pode usar tanto um motor a gasolina quanto um motor a etanol, e o mesmo vale para um `SUV`, sem precisar criar subclasses como `SedãGasolina`, `SedãEtanol`, `SUVGasolina` ou `SUVEtanol`.

---

Agora você pode simplesmente copiar esse código e colar no arquivo `README.md` do seu projeto.
