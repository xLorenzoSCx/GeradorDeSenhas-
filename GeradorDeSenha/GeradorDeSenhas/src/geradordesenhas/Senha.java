package geradordesenhas;

import java.util.Random;
import javax.swing.JOptionPane;

public class Senha {

    public String nome;

    public Senha() {
    }

    public Senha(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    Random random = new Random();

    public int gerarNumeroAleatorio() {

        int max = 5000;
        int min = 1000;
        int randomNumber = random.nextInt((max - min) + 1) + min;

        return randomNumber;
    }

    ;

  public String gerarSenha(String nome) {

        return gerarCaracterAleatorio() + trocarLetraPorCarctereEspecial(nome) + gerarNumeroAleatorio();

    }

    public char gerarCaracterAleatorio() {

        String carctereAleatorio = "!@#$%&";

        int indice = random.nextInt(carctereAleatorio.length());

        char carctereEspecial = carctereAleatorio.charAt(indice);

        return carctereEspecial;

    }

    public String trocarLetraPorCarctereEspecial(String nome) {

        StringBuilder resultado = new StringBuilder();
        boolean letraTrocada = false;
        for (int i = 0; i < nome.length(); i++) {
            char letra = nome.charAt(i);

            if (!letraTrocada) {
                if (letra == 'o' || letra == 'O') {
                    resultado.append('0');
                    letraTrocada = true;
                    continue;
                } else if (letra == 'e' || letra == 'E') {
                    resultado.append('&');
                    letraTrocada = true;
                    continue;
                } else if (letra == 'a' || letra == 'A') {
                    resultado.append('@');
                    letraTrocada = true;
                    continue;
                } else {
                    resultado.append(letra);
                    continue;
                }
            }
            resultado.append(letra);
        }

        resultado.setCharAt(0, Character.toUpperCase(resultado.charAt(0)));

        return resultado.toString();
    }
};
