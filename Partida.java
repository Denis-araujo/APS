import java.util.Date;

class Partida {
  private Date data;
  private Time timeCasa;
  private Time timeVisitante;
  private int placarCasa;
  private int placarVisitante;

  public Partida(Date pDat,Time pCas, Time pVis ){
    this.data = pDat;
    this.timeCasa = pCas;
    this.timeVisitante = pVis;
  }

  public void golCasa() {
    this.placarCasa = placarCasa++;
  }

  public void golVisitante() {
    this.placarVisitante = placarVisitante++;
  }

  public String getPlacar(){
    return timeCasa + " " + placarCasa + "x" + placarVisitante + " " + timeVisitante;
  }
  
}