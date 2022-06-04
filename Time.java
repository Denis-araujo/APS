class Time {
    private String nome;
    private Jogador jogadores;
    private int vitorias;
    private int derrotas;
    private int empates;
  
    public Time(String nome) {
      this.nome = nome;
    }

    String getNome(){
      return nome;
    }
  
    String getResultado(){
      return "Vitorias:" + vitorias + "Derrotas: " + derrotas + "Empates:" + empates;
    }
  
    public void somaVitoria() {
      this.vitorias = vitorias++;
    }

    public void somaDerrota() {
      this.derrotas = derrotas++;
    }

    public void somaEmpate() {
      this.empates = empates++;
    }

    public String imprimeJogadores() {
      return "Jogador" + jogadores;
    }

    public void insJogador(Jogador pJog){
      this.jogadores = pJog;
    }

}