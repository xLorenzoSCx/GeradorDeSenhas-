
package geradordesenhas;

import java.util.Scanner;

public class GeradorDeSenhas {

    public static void main(String[] args) {
        
            Senha senha = new Senha();
            
            Scanner teclado = new Scanner(System.in);
         
           
          int teste = senha.gerarNumeroAleatorio();
    
          System.out.println("Insira um nome");
          String nome = teclado.nextLine();
          
          String senhaGerada = senha.gerarSenha(nome);
           
           System.out.println("Sua senha é " + senhaGerada);
    }
    
}
