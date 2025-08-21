package school.sptech.sprint1_nota1.ex3;

public class ExercicioDificilResponse {

    private int enesimoTermo;
    private int soma;

    public ExercicioDificilResponse() {
    }

    public ExercicioDificilResponse(int enesimoTermo, int soma) {
        this.enesimoTermo = enesimoTermo;
        this.soma = soma;
    }

    public void calcular(int n) {

        if (n > 0) {
            int anterior = 0;
            int atual = 1;
            int prox = anterior + atual;
            int total = 0;

            if (n == 1) {
                enesimoTermo = 1;
                soma = 1;
            }

            for (int i = 2; i <= n; i++) {

                total = anterior + atual;
                prox += total;
                anterior = atual;
                atual = total;

            }

            enesimoTermo = atual;
            soma = prox;
        }

    }

    public int getEnesimoTermo() {
        return enesimoTermo;
    }

    public void setEnesimoTermo(int enesimoTermo) {
        this.enesimoTermo = enesimoTermo;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

}
