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
    double Numero1;
    double Numero2;
    double Resultado;

    public double getNumero1() {
        return Numero1;
    }

    public void setNumero1(double Numero1) {
        this.Numero1 = Numero1;
    }

    public double getNumero2() {
        return Numero2;
    }

    public void setNumero2(double Numero2) {
        this.Numero2 = Numero2;
    }

    public double getResultado() {
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }
    
    
    public double suma()
    {
    
    this.Resultado=this.Numero1+this.Numero2;
    return this.Resultado;
    }
    public double resta()
    {
    
    this.Resultado=this.Numero1-this.Numero2;
    return this.Resultado;
    }
    public double multiplicacion()
    {
    
    this.Resultado=this.Numero1*this.Numero2;
    return this.Resultado;
    }
    public double division()
    {
    
    this.Resultado=this.Numero1/this.Numero2;
    return this.Resultado;
    }
    public double Fseno()
    {
        double a;
        a=Math.toRadians(Numero1);
        this.Resultado=Math.sin(a);
        return this.Resultado;
    }
    public double Fcoseno()
    {
        double a;
        a=Math.toRadians(Numero1);
        this.Resultado=Math.cos(a);
        return this.Resultado;
    }
    public double Ftangente()
    {
        if (this.Numero1>=90)
        {
            
            if (this.Numero1%90!=0)
            {
            double a;
            a=Math.toRadians(Numero1);
            this.Resultado=Math.tan(a);
            return this.Resultado;   
            }
            else
            {
                if (this.Numero1>=180 && this.Numero1%180==0)
                {
                    double a;
                    a=Math.toRadians(Numero1);
                    this.Resultado=Math.tan(a);
                    return this.Resultado;   
                }
                else
                {
                  return 100;  
                }
            }
        }
        else
        {
            double a;
            a=Math.toRadians(Numero1);
            this.Resultado=Math.tan(a);
            return this.Resultado; 
        }
    }
    public double Farcseno()
    {
        this.Resultado=Math.toDegrees(Math.asin(this.Numero1));
        return this.Resultado;
    }
    public double Farcocos()
    {
        this.Resultado=Math.toDegrees(Math.acos(this.Numero1));
        return this.Resultado;
    }
   
}
