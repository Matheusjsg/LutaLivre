import java.util.Random;

public class Luta {
    
private Lutador desafiado;
private Lutador desafiante;
private int rounds;
private boolean aprovado;


public Luta(Lutador l1, Lutador l2){

    if (l1.getCategoria().equals(l2.getCategoria()) 
            && l1 != l2){

        this.aprovado= true;
        this.desafiado = l1;
        this.desafiante = l2;

        System.out.println("Luta marcada entre " + l1.getNome() + " X " + l2.getNome() );

    }else{ aprovado = false;
    
    System.out.println("A luta não pode ser marcada.");
    this.desafiado = null;
    this.desafiante = null;
    }

}

public void lutar(){

    if (this.aprovado == true){
        System.out.println("--------DESAFIADO------");
        this.desafiado.apresentar();

        System.out.println("---------DESAFIANTE-------");
        this.desafiante.apresentar();

        Random aleatorio = new Random();

        int vencedor = aleatorio.nextInt(3);
    
        switch (vencedor) {
            case 0: System.out.println("Empatou!");
                this.desafiado.empate();
                this.desafiante.empate();
                break;

            case 1: System.out.println("O vencedor foi " + this.desafiado.getNome());
            this.desafiado.ganharLuta();
                
                break;
        
            case 2: System.out.println("O vencedor foi " + this.desafiante.getNome());
            this.desafiante.ganharLuta();
                    
                    break;
        }

    }else { 
        System.out.println("A luta não foi aprovada, impossivel marcar a luta.");

    }


}






public Lutador getdesafiado(){
    return desafiado;

}

public void setdesafiado(Lutador desafiado){
    this.desafiado = desafiado;

}

public Lutador getdesafiante(){
    return desafiante;

}

public void setdesafiante(Lutador desafiante){
    this.desafiante = desafiante;
}

public boolean getaprovado(){
    return aprovado;

}

public void setaprovado(boolean aprovado ){
    this.aprovado = aprovado;

}


public int getrounds(){
    return rounds;
}

public void setrounds(int rounds){
    this.rounds = rounds;
}




}