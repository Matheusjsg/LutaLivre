public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

//construtor
    public Lutador (String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates){

        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
  
    }
  
//Acessores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        
            this.setCategoria();
    }
           
    public String getCategoria(){
           return categoria;
    }
        
    public void setCategoria() {
       
        if (this.peso < 52.2){
            this.categoria = "Inválido";

        }else if  (this.peso <= 70.3) {
            this.categoria = "Peso Leve";
            
        }else if(this.peso <= 83.9) {
            this.categoria = "Peso Médio";
            
        } else if (this.peso <= 120.2) {
            this.categoria = "Peso Pesado";
            
        }else { System.out.println(" Categoria inválida");}
    } 
      
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

  // Metodos

    public void apresentar() {

        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura() +"m");
        System.out.println("Peso: " + this.getPeso() + "KG");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println(" Derrotas " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public void status(){

        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade() + " Anos");
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println(" Derrotas " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());

    }

    public void ganharLuta(){

        this.setVitorias(vitorias + 1);
    }

    public void perderLuta() {

        this.setDerrotas(getDerrotas() + 1);
    }

    public void empate () {

        this.setEmpates(getEmpates() + 1);
    }



}

