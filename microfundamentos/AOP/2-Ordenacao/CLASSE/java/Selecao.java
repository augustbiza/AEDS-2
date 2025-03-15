// Ordenação por Seleção padrão
// sort = coloca o menor na esquerda (crescente)
// sortInverse = coloca o menor na direita (decrescente)

class Selecao extends Ordenacao {

    public Selecao() {

        super();
    }

    public Selecao(int tam) {

        super(tam);
    }

    @Override
    public void sort() {

        for(int i = 0; i < tam-1; i++) {

            int menor = i;

            for(int f = i+1; f < tam; f++) {

                if(arr[f] < arr[menor]) menor = f;
            }

            if(arr[i] != arr[menor]) {

                int aux = arr[i];
                arr[i] = arr[menor];
                arr[menor] = aux;
            }
        }
        
    }

    @Override
    public void sortInverse() {

        for(int i = tam-1; i > 0 ; i--) {

            int menor = i;

            for(int f = i-1; f >= 0; f--) {

                if(arr[f] < arr[menor]) menor = f;
            }

            if(arr[i] != arr[menor]) {

                int aux = arr[i];
                arr[i] = arr[menor];
                arr[menor] = aux;
            }
        }
    }

}