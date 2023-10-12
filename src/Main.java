public class Main {
public static void main(String[] args)
{
//Aritmetica calculo = new Aritmetica();
Geometrica calculo = new Geometrica();
Disciplina d = new Disciplina(calculo);

d.setNome( "Design Patterns - Strategy");
System.out.println("\nEngenharia de Software III\n"+d.getNome()+"\n");

d.setP1(7); d.setP2(9);
d.CalcularMedia();

System.out.println(
String.format("P1:%.2f\nP2:%.2f\nMedia:%.2f\nSituação: Aluno %s",
d.getP1(),d.getP2(), d.getMedia(), d.getSituacao()+"\n"));

}}