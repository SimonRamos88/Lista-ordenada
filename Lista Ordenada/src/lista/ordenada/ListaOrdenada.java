
package lista.ordenada;


public class ListaOrdenada {
    int[] array;
    int n;
    int count;
    int pos;
    
    public ListaOrdenada(int n){
        this.array = new int[n];
        this.n = n;
        this.pos =0;
        this.count = 0;
    }
    
    public boolean Buscar(int element){
        int posi = 0;
        while(element> array[posi] && posi<count){
            posi ++;
        }
        this.pos = posi;
        return element == array[posi];
    }
    
    
    public boolean Insertar(int element){
        boolean bandera = false;
        if(count<n){
            if( !Buscar(element) ){
                for(int i = count-1;i>=pos;i-- ){
                    array[i+1] = array[i];             
                }
                array[pos] = element;
                this.count ++;
                bandera = true;               
            }
        }else{
            System.out.println("Esta lleno pa");
        }
        
        return bandera;
    
    }
    
    public boolean Eliminar(int element){
        
        boolean bandera = false;    
        if( Buscar(element) ){
            for(int i=pos; i<count-1; i++){
                array[i] = array[i+1];
            }
            this.count--;
            bandera = true;
        }
        
        
        return bandera;
    }     
    
    public String toString(){
        String cad = "[ ";
        for(int i=0;i<count;i++){
            cad +=array[i]+" ";
        }
        cad +=" ]";
        return cad;
    }
    
    public static void main(String[] args) {
        ListaOrdenada list = new ListaOrdenada(2);
        list.Insertar(5);
        list.Insertar(3);
        list.Insertar(6);
        //System.out.println(list.toString());
        list.Insertar(1);
        list.Insertar(2);
        System.out.println(list.toString());
        list.Eliminar(5);
        list.Eliminar(3);
        
        System.out.println(list.toString()); 
        list.Buscar(3);
        
        
        
        
    }
    
}
