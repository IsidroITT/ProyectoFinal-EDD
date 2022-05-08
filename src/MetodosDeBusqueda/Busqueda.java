/* Metodos de busqueda
- Busqueda secuencial -L
- Busqueda binaria        -L
*/
package MetodosDeBusqueda;

import MetodosDeOrdenamiento.Ordenamiento;

/**
 *
 * @author isidro
 */
public class Busqueda {
    private Ordenamiento BB;
    public int pos;
    
    public Busqueda(){
        pos = 0;
        BB = new Ordenamiento();
    }
    
    public boolean Secuencial(long[] vector, long dato){
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == dato){
                pos = i+1;
                return true;
            }
        }
        return false;
    }
    
    public boolean Binaria(long[] vectorOrdenado, long dato){
        int centro, primero, ultimo;
        long valorCentro;
        
        primero = 0;
        ultimo = vectorOrdenado.length-1;
        
        while (primero <= ultimo) {
            centro = (primero + ultimo) / 2;
            valorCentro = vectorOrdenado[centro];
            if (dato == valorCentro) {
                pos = centro+1;
                return true;
            } else if (dato < valorCentro) {
                ultimo = centro - 1;
            } else {
                primero = centro + 1;
            }
        }
        return false;
    }
}