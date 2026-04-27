package org.example;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode


public class calculadoraIMC {
    private double peso;
    private double estatura;
    private double imc;

    public void calcularIMC(){
        this.imc = this.peso / (this.estatura * this.estatura);

    }


}
