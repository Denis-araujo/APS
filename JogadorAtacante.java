class JogadorAtacante extends Jogador{
  private int velocidade;
  private int tecnica;

  public JogadorAtacante(String pNom, int pIda, int pHab,int pVel, int pTec){  
    super(pNom, pIda, pHab);
    this.velocidade = pVel;
    this.tecnica = pTec;
  }

  public int getHabilidade() {
    habilidade = random.nextInt(100);
    int habilidadeAtc = 0;
    habilidadeAtc = ((habilidade * 5) + (velocidade * 2) + (tecnica * 3)) / 10;

    return habilidadeAtc;
    }
}