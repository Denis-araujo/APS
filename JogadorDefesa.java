class JogadorDefesa extends Jogador{
  private int cobertura;
  private int desarme;

  public JogadorDefesa(String pNom, int pIda, int pHab,int pCob, int pDes){  
    super(pNom, pIda, pHab);
    this.cobertura = pCob;
    this.desarme = pDes;
  }

  public int getHabilidade() {
    habilidade = random.nextInt(100);
    int habilidadeAtc = 0;
    habilidadeAtc = ((habilidade*5) + (cobertura*3) + (desarme*2)) / 10;

    return habilidadeAtc;
    }
}