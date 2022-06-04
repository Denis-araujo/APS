class JogadorGoleiro extends Jogador{
  private int reflexos;
  private float altura;

  public JogadorGoleiro(String pNom, int pIda, int pHab,int pRef, float pAlt){  
    super(pNom, pIda, pHab);
    this.reflexos = pRef;
    this.altura = pAlt;
  }

  public int getHabilidade() {
    habilidade = random.nextInt(100);
    int habilidadeAtc = 0;
    habilidadeAtc = ((habilidade*5) + (((int)(altura*100)) *2) + (reflexos*3)) /10;

    return habilidadeAtc;
    }
}