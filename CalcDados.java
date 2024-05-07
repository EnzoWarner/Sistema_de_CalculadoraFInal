import java.util.Scanner;

class CalcDados {
    private double operando1;
    private double operando2;
    private char operacao;

    public void setOperando(int i, double valor) {
        if (i == 1) {
            operando1 = valor;
        } else if (i == 2) {
            operando2 = valor;
        }
    }

    public double getOperando(int i) {
        if (i == 1) {
            return operando1;
        } else if (i == 2) {
            return operando2;
        }
        return 0; // Retorno padrão se i não for 1 ou 2
        }
        
        public void setOperacao(char op) {
        operacao = op;
        }
        
        public char getOperacao() {
        return operacao;
        }
        }
