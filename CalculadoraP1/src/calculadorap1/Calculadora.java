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
