import java.util.Scanner;

public class Main {
public static void main(String[] args) {
CalcDados dados = new CalcDados();
CalcInterface calcInterface = new CalcInterface();
CalcControle controle = new CalcControle(dados, calcInterface);

controle.executar();
}
}
