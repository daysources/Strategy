public class Disciplina {
    private ICalcMedia CalcMedia;
    private double P1, P2;
    private String Nome;
    double Media;
    String Situacao;

    public Disciplina(ICalcMedia CalcMedia){this.CalcMedia = CalcMedia;}

    public ICalcMedia getCalcMedia() {return this.CalcMedia;}
    public String getSituacao() {return this.Situacao;}
    public String getNome() {return this.Nome;}
    public double getP1() {return this.P1;}
    public double getP2() {return this.P2;}
    public double getMedia() {return this.Media;}

    public void setCalcMedia(ICalcMedia CalcMedia) {this.CalcMedia = CalcMedia;}
    public void setSituacao(String Situacao) {this.Situacao = Situacao;}
    public void setNome(String Nome) {this.Nome = Nome;}
    public void setP1(double P1) {this.P1 = P1;}
    public void setP2(double P2) {this.P2 = P2;}
    public void setMedia(double Media) {this.Media = Media;}

    public void CalcularMedia()
    {double Media = CalcMedia.CalculaMedia(P1,P2);
    setMedia(Media);
    setSituacao(CalcMedia.Resultado(Media));
    }
}
