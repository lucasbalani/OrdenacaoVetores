package Methods;

public class SelectionSort {
    public static int[] Method(int[] Vetor){
        for(int fixo = 0; fixo < Vetor.length - 1; fixo++){
            int menor = fixo;
            
            for(int i = menor + 1; i < Vetor.length; i++){
                if (Vetor[i] < Vetor[menor]) {
                    menor = i;
                }
            }
            
            if (menor != fixo) {
                int temp = Vetor[fixo];
                
                Vetor[fixo] = Vetor[menor];
                Vetor[menor] = temp;
            }
        }
        
        return Vetor;
    }
}
