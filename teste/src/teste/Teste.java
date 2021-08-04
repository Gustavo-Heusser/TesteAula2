/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author gustavo.heusser
 */
public class Teste {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Temos os valores: 2, 4, 8 e 10.");
        System.out.println("Qual são os dois valores somados que resultam em 6?");
        int[] ListNum = {2, 4, 6, 8, 10};
        int resp = 6;
            System.out.printf("O primeiro número é %d. ",ListNum[0]);
            System.out.printf("O segundo número é %d. ",ListNum[1]);
            System.out.printf("A resposta é %d.  ",resp);
        if(ListNum[0] + ListNum[1] == resp){
            
            System.out.print("RESPOSTA CORRETA");
        }
        else{
            System.out.print("RESPOSTA INCORRETA");
    }

    }
    
}
    
  