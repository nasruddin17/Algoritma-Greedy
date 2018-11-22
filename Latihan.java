package latihan;
public class Latihan {
    public static void main(String[] args) {
        System.out.println("SOLUSI SHORTEST PATH Menggunakan Algoritma Greedy");
        int[][]graph={
            {0,4,2,0,0,0,3,0},
            {4,0,0,0,0,5,0,0},
            {2,0,0,7,6,1,0,0},
            {0,0,7,0,2,0,6,0},
            {0,0,6,2,0,4,0,3},
            {0,5,1,0,4,0,0,2},
            {3,0,0,6,0,0,0,0},
            {0,0,0,0,3,2,0,0}
        };
        int vStart = 1;
        int vEnd   = 3;
        int activeVertex = vStart;        
        boolean[]visited = new boolean[graph.length];
        visited[vStart]  = true;
        System.out.print("V"+vStart);
        int jarak = 0;
        while(activeVertex!=vEnd){
            int iMin = -1;
            int MIN  = Integer.MAX_VALUE;
            for(int j=0;j<graph[activeVertex].length;j++){
                int value = graph[activeVertex][j];
                if(visited[j]==false&&value>0&&value<MIN){
                    MIN = value;//ditemukan MIN yang baru
                    iMin = j;//update nilai iMin
                }
            }
            if(iMin!=-1){
                activeVertex=iMin; 
                visited[iMin]=true;
                jarak = jarak + MIN;
                System.out.print(" - V"+activeVertex);                
            }else{
                break;
            }
        }//end of while
        System.out.println("\nJaraknya: "+jarak);
        
    }
    
}
