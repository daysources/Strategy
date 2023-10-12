public class Aritmetica implements ICalcMedia {

    @Override
    public double CalculaMedia (double nota1, double nota2){return (nota1+nota2)/2;}
    @Override
    public String Resultado(double resulmedia)
    {if (resulmedia>=5){return "Aprovado";}
    else{return "Reprovado";}
    }}
