/*Metodos de ordenamiento
- Burbuja
- Quicksort
- ShellSort
- Radix
 */
package MetodosDeOrdenamiento;

/**
 *
 * @author isidro
 */
public class Ordenamiento {

    public Ordenamiento() {}

    public long[] Burbuja(long[] vector) {
        long aux;
        for (int i = 0; i < vector.length-1; i++) {
            for (int j = 0; j < vector.length-1; j++) {
                if (vector[j]>vector[j+1]) {
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
        return vector;
    }

    public long[] Quicksort(long[] vector) {
        return Quicksort(vector, 0, vector.length - 1);
    }

    private long[] Quicksort(long[] vector, int izq, int der) {
        if (izq >= der) {
            return vector;
        }
        int i = izq, d = der;
        if (izq != der) {
            int pivote;
            long aux;
            pivote = izq;
            while (izq != der) {
                while (vector[der] >= vector[pivote] && izq < der) {
                    der--;
                }
                while (vector[izq] < vector[pivote] && izq < der) {
                    izq++;
                }
                if (der != izq) {
                    aux = vector[der];
                    vector[der] = vector[izq];
                    vector[izq] = aux;
                }
            }
            if (izq == der) {
                Quicksort(vector, i, izq - 1);
                Quicksort(vector, izq + 1, d);
            }
        } else {
            return vector;
        }
        return vector;
    }

    public void Shellsort(long[] vector) {

    }

    public void Radix(long[] vector) {

    }

    public static void main(String[] args) {
        long arreglo[] = new long[500];
        Ordenamiento hola = new Ordenamiento();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (long) (500*Math.random());
        }
        
        System.out.println("--- Arreglo sin ordenar ---");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("["+(i+1)+"] "+arreglo[i]);
        }
        
        System.out.println("--- Arreglo ordenado ---");
        long[] arregloOrdenado = hola.Quicksort(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("["+(i+1)+"] "+arregloOrdenado[i]);
        }
    }
}
