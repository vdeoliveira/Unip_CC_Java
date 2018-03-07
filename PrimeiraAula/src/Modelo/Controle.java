/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
//App para calcular
public class Controle
{
    //definido variaveis/
    private String num1;
    private String num2;
    private String operacao;
    private String Resposta;
    private String Mensagem;
    //construtor inserir codigo/
    public Controle(String num1, String num2, String operacao)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
        calcular();
    }
    
    
    //logica do App/
    public void calcular()
    {
        //uso de double/
        this.Mensagem ="";
        Double n1 = 0.0, n2 = 0.0, resultado = 0.0;
        
        
        try
        {
            //uso de this/
            n1 = Double.parseDouble(this.num1);
            n2 = Double.parseDouble(this.num2); 
            if (operacao.equals("+"))
                resultado = n1 + n2;
            if (operacao.equals("-"))
                resultado = n1 - n2;
            if (operacao.equals("*"))
                resultado = n1 * n2;
            Mensagem = resultado.toString();
            //se, se nao/
            if (this.operacao.equals("/"))   
                {
                    if (n2 == 0)
                        Mensagem = "Divisão por 0";
                    else
                    {
                        resultado = n1 / n2;
                        Mensagem = resultado.toString();
                    }
                }    
                        
        }
        //mensagem de erro/
        catch(NumberFormatException e)
        {
            
            Mensagem = "erro de conversão";
            
        }
       
    }
        
        //get resposta/

        public String getResposta()
        {
            return Resposta;
        }    
        public String getMensagem()
        {
            return Mensagem;
        }
        

    
}

