/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Calculadora implements CalculadoraI {
    public String calcular(String esp){
        String respuesta = "";
        StackVector<String> pila = new StackVector<String>();
        
        for(int i=0; i<=esp.length(); i++){
            String agregar = esp.substring(0, esp.length());
            
            
            String numero1 = "";
            String numero2 = "";
            
            /* este if solo va a dejar que puedan agregarse a la pila los
            numeros del 0 al 9 y los signos de suma, resta, multiplicacion y 
            division
            */

            if(agregar.equals("0")||agregar.equals("1")||agregar.equals("2")||
               agregar.equals("3")||agregar.equals("4")||agregar.equals("5")
               ||agregar.equals("6")||agregar.equals("7")||agregar.equals("8")
               ||agregar.equals("9")){
                
                pila.push(agregar);
                numero2 = numero1;
                numero1 = agregar;
                
            }
            
            /*
            else{
                System.out.println("Revisar documento, hay un dato que no es numero o un signo para operar");
            }

            */
            
            if(agregar.equals("+")){
                double suma = Double.parseDouble(numero1) + Double.parseDouble(numero2);
                String resultado = String.valueOf(suma);
                numero1 = String.valueOf(suma);
                return respuesta = resultado;
            }
            
            if(agregar.equals("-")){
                double resta = Double.parseDouble(numero2) - Double.parseDouble(numero1);
                String resultado = String.valueOf(resta);
                numero1 = String.valueOf(resta);
                return respuesta = resultado;
            }
            
            if(agregar.equals("*")){
                double multiplicacion = Double.parseDouble(numero1) * Double.parseDouble(numero2);
                String resultado = String.valueOf(multiplicacion);
                numero1 = String.valueOf(multiplicacion);
                return respuesta = resultado;
            }
            
            if(agregar.equals("/")){
                double division = Double.parseDouble(numero2) / Double.parseDouble(numero1);
                String resultado = String.valueOf(division);
                numero1 = String.valueOf(division);
                return respuesta = resultado;
            }
            
        }
        return respuesta;
    }
}