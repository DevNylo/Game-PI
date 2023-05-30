public class Personagem implements Habilidades{

    private String nome;
    private int nivel;
    private int vida;

    private int poderFisico;

    private int poderMagico;

    private int mana;

    private int defesaFisica;

    private int defesaMagica;

    private int evasao;

    private int chanceDeAcerto;

    private int velocidade;

    public Personagem(){}

    public Personagem(int vida, int poderFisico, int poderMagico, int mana){
        this.vida = vida;
        this.poderFisico = poderFisico;
        this.poderMagico = poderMagico;
        this.mana = mana;
    }

    // GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPoderFisico() {
        return poderFisico;
    }

    public void setPoderFisico(int poderFisico) {
        this.poderFisico = poderFisico;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDefesaFisica() {
        return defesaFisica;
    }

    public void setDefesaFisica(int defesaFisica) {
        this.defesaFisica = defesaFisica;
    }

    public int getDefesaMagica() {
        return defesaMagica;
    }

    public void setDefesaMagica(int defesaMagica) {
        this.defesaMagica = defesaMagica;
    }

    public int getEvasao() {
        return evasao;
    }

    public void setEvasao(int evasao) {
        this.evasao = evasao;
    }

    public int getChanceDeAcerto() {
        return chanceDeAcerto;
    }

    public void setChanceDeAcerto(int chanceDeAcerto) {
        this.chanceDeAcerto = chanceDeAcerto;
    }

    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }


    // HABILIDADES

    @Override
    public void skillUm() {

    }

    @Override
    public void skillDois() {

    }

    @Override
    public void skillTres() {

    }

    @Override
    public void skillQuatro() {

    }
}
