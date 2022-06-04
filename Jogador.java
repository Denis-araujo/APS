import java.util.Random;

class Jogador {
  private String nome;
  protected int idade;
  private int gols;
  private int camisa;
  protected int habilidade;
  Random random = new Random();

  public Jogador(){
    
  }

  public Jogador(String pNom, int pIda, int pHa){
    this.nome = pNom;
    this.idade = pIda;
    this.habilidade = pHa;
  }

  String getNome(){
    return nome;
  }

  public void setNome(String name){
    this.nome = name;
  }

  int getHabilidade(){
    habilidade = random.nextInt(100);
    return habilidade;
  }

  int getGols(){
    return gols;
  }

  public int somaGol(){
    return (gols + 1);
  }
}