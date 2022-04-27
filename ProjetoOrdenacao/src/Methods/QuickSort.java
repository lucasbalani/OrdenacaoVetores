package Methods;

public class QuickSort {
    public static int[] Method(int[] Vetor, int posInicio, int posFim){
        if (posFim > posInicio) {
            
            //Guarda o index do pivo
            int indexPivo = dividir(Vetor, posInicio, posFim);
            
            //Recursao
            QuickSort.Method(Vetor, posInicio, indexPivo-1);
            
            //Recursao
            QuickSort.Method(Vetor, indexPivo + 1, posFim);
        }
        
        
        return Vetor;
    }
    
    
    public static int dividir(int[] Vetor, int posInicio, int posFim){
        int pivo, pontEsq, pontDir = posFim;
        pontEsq = posInicio + 1;
        pivo = Vetor[posInicio];
        
        //Faz esse laço enquanto o ponto esquerdo for menor ou igual ao ponto direito.
        while(pontEsq <= pontDir){
               
            
            while(pontEsq <= pontDir && Vetor[pontEsq] <= pivo){
                pontEsq++;
            }
            
            while(pontDir <= pontEsq && Vetor[pontDir] > pivo){
                pontDir--;
            }
            
            if(pontEsq < pontDir){
                troca(Vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
            
        }
        
        troca(Vetor, posInicio, pontDir);
        return pontDir;
        
    }
    
    //Troca a posição dos dados no vetor
    public static void troca(int[] Vetor, int i, int j){
        
        int temp = Vetor[i];
        
        Vetor[i] = Vetor[j];
        Vetor[j] = temp;
    }
}
