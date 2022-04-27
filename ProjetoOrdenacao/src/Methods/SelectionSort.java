package Methods;

public class SelectionSort {
    public static int[] Method(int[] Vetor){
        
        //Percorre o vetor
        for(int fixo = 0; fixo < Vetor.length - 1; fixo++){
            int menor = fixo;
            
            
            //Percorre todo o vetor novamente
            for(int i = menor + 1; i < Vetor.length; i++){
                //Valida se o indice "i" do vetor é menor que o indice "menor" do vetor
                if (Vetor[i] < Vetor[menor]) {
                    
                    //Atribui o valor de i para a variavel menor.
                    menor = i;
                }
            }
            
            //Faz a troca se o menor for diferente de fixo
            if (menor != fixo) {
                int temp = Vetor[fixo];
                
                Vetor[fixo] = Vetor[menor];
                Vetor[menor] = temp;
            }
        }
        
        return Vetor;
    }
}
