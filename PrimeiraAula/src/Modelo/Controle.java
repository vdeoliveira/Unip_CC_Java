/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author reverdan.sparinger
 */
public class Controle
{

    public String calcular(String num1,String num2,String operacao)
    {
        Double n1 = 0.0, n2 = 0.0, resultado = 0.0;
        String resposta ="";
        try
        {
            n1 = Double.parseDouble(num1);
            n2 = Double.parseDouble(num2); 
            if (operacao.equals("+"))
                resultado = n1 + n2;
            if (operacao.equals("-"))
                resultado = n1 - n2;
            if (operacao.equals("*"))
                resultado = n1 * n2;
                resposta = resultado.toString();
            if (operacao.equals("/"))   
                {
                    if (n2 == 0)
                        resposta = "Divisão por 0";
                    else
                    {
                        resultado = n1 / n2;
                        resposta = resultado.toString();
                    }
                }    
                        
        }
        catch(NumberFormatException e)
        {
            
            resposta = "erro de conversão";
            
        }
        return resposta.toString();
    }
}
