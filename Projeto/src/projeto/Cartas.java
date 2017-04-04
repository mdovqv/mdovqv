
package projeto;


public class Cartas {
    private String nome;
    private int ataque;
    private int def;
    private int inteligencia;
    
    public Cartas(String nome, int ataque, int def, int inteligencia) { //método construtor
    this.nome=nome;
    this.ataque=ataque;
    this.def=def;
    this.inteligencia=inteligencia;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    
}
