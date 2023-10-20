package RPG;

import java.util.Random;

public abstract class Hero {
    String nome;
    String descricao;

    public Hero(String nome, String descricao) {
        this.descricao = descricao;
        this.nome = nome;
    }

    public void atacar() {
    };

    public void defender() {
    };

    public void esquivar() {
    };
}

class Vilao extends Hero {
    Random random = new Random();

    public Vilao(String nome, String descricao) {
        super(nome, descricao);
    }

    @Override
    public void atacar() {
        int ataque = random.nextInt(10);
        if (ataque % 2 == 0) {
            System.out.println("O vilão acertou o ataque");
            System.out.println(ataque);
        } else {
            System.out.println("O vilão errou o ataque");
            System.out.println(ataque);
        }
    }

    @Override
    public void defender() {
        int defesa = random.nextInt(10);
        if (defesa % 2 == 0) {
            System.out.println("O vilão defendeu o ataque");
            System.out.println(defesa);
        } else {
            System.out.println("O vilão não defendeu o ataque o ataque");
            System.out.println(defesa);
        }

    }

    @Override
    public void esquivar() {
        System.out.println("O vilão não conseguiu se esquivar");
    }
}
