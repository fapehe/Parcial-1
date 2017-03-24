/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorap1;

/**
 *
 * @author estudiantes
 */
public class Calculadora {
    float Numero1;

    public float getNumero1() {
        return Numero1;
    }

    public void setNumero1(float Numero1) {
        this.Numero1 = Numero1;
    }

    public float getNumero2() {
        return Numero2;
    }

    public void setNumero2(float Numero2) {
        this.Numero2 = Numero2;
    }

    public float getResultado() {
        return Resultado;
    }

    public void setResultado(float Resultado) {
        this.Resultado = Resultado;
    }
    float Numero2;
    float Resultado;
    
    public float suma()
    {
    
    this.Resultado=this.Numero1+this.Numero2;
    return this.Resultado;
    }
    public float resta()
    {
    
    this.Resultado=this.Numero1-this.Numero2;
    return this.Resultado;
    }
    public float multiplicacion()
    {
    
    this.Resultado=this.Numero1*this.Numero2;
    return this.Resultado;
    }
    public float division()
    {
    
    this.Resultado=this.Numero1/this.Numero2;
    return this.Resultado;
    }
}
