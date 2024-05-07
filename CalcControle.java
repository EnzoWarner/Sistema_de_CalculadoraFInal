import java.util.Scanner;
class CalcControle {
    private CalcDados dados;
    private CalcInterface calcInterface;
    
    public CalcControle(CalcDados dados, CalcInterface calcInterface) {
    this.dados = dados;
    this.calcInterface = calcInterface;
    }
    
    public void executar() {
    while (true) {
        double opn1 = calcInterface.recebeOperando(1);
        double opn2 = calcInterface.recebeOperando(2);
        char op = calcInterface.recebeOperacao();
    
        if (op == 's') {
            System.out.println("Encerrando o programa.");
            System.exit(0);
        }
    
        dados.setOperando(1, opn1);
        dados.setOperando(2, opn2);
        dados.setOperacao(op);
    
        double resultado = opera(opn1, opn2, op);
        calcInterface.mostraResultado(resultado);
    }
    }
    private double opera(double opn1, double opn2, char op) {
        double resultado = 0;
        switch (op) {
            case '+':
                resultado = opn1 + opn2;
                break;
            case '-':
                resultado = opn1 - opn2;
                break;
            case '*':
                resultado = opn1 * opn2;
                break;
            case '/':
                if (opn2 != 0) {
                    resultado = opn1 / opn2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
        return resultado;
        }
        }
    