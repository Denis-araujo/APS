import java.util.Date;

class Main {
  public static void main(String[] args) {


    JogadorAtacante jogadorAtacanteCasa = new JogadorAtacante("Messi", 30, 90, 86, 95);
    JogadorAtacante jogadorAtacanteCasa2 = new JogadorAtacante("Neymar", 30, 90, 86, 95);
    JogadorDefesa jogadorDefesorCasa = new JogadorDefesa("Sergio Ramos", 30, 90, 86, 95);
    JogadorDefesa jogadorDefesorCasa2 = new JogadorDefesa("Marquinhos", 30, 90, 86, 95);
    JogadorGoleiro jogadorGoleiroCasa = new JogadorGoleiro("Donnarumma", 30, 90, 86, 95);

    JogadorAtacante jogadorAtacanteVisitante = new JogadorAtacante("Benzema", 30, 90, 86, 95);
    JogadorAtacante jogadorAtacanteVisitante2 = new JogadorAtacante("Vinicius Junior", 30, 90, 86, 95);
    JogadorDefesa jogadorDefesorVisitante = new JogadorDefesa("Militao", 30, 90, 86, 95);
    JogadorDefesa jogadorDefesorVisitante2 = new JogadorDefesa("Fernadez", 30, 90, 86, 95);
    JogadorGoleiro jogadorGoleiroVisitante = new JogadorGoleiro("Courtois", 30, 90, 86, 95);

    Time timeCasa = new Time("PSG");
    timeCasa.insJogador(jogadorAtacanteCasa);
    timeCasa.insJogador(jogadorAtacanteCasa2);
    timeCasa.insJogador(jogadorDefesorCasa);
    timeCasa.insJogador(jogadorDefesorCasa2);
    timeCasa.insJogador(jogadorGoleiroCasa);

    Time timeVisitante = new Time("Real Madri");
    timeVisitante.insJogador(jogadorAtacanteVisitante);
    timeVisitante.insJogador(jogadorAtacanteVisitante2);
    timeVisitante.insJogador(jogadorDefesorVisitante);
    timeVisitante.insJogador(jogadorDefesorVisitante2);
    timeVisitante.insJogador(jogadorGoleiroVisitante);

    Date currentDate = new Date(2022-06-04);
    
    Partida partida = new Partida(currentDate, timeCasa, timeVisitante);

    partida.getPlacar();

    partida.golCasa();

    
    
    
    System.out.println(partida);
    System.out.println(partida.getPlacar());
  }
}