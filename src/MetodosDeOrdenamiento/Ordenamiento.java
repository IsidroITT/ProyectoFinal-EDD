/*Metodos de ordenamiento
- Burbuja     -L
- Quicksort  -L
- ShellSort   -L
- Radix         -L
 */
package MetodosDeOrdenamiento;

/**
 *
 * @author isidro
 */
public class Ordenamiento {

    public Ordenamiento() {
    }

    public long[] Burbuja(long[] vector) {
        long aux;
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
        return vector;
    }

    public void Quicksort(long[] arreglo) {
        Quicksort(arreglo, 0, arreglo.length - 1);
    }

    private static void Quicksort(long A[], int izq, int der) {
        long pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der;         // j realiza la búsqueda de derecha a izquierda
       long aux;

        while (i < j) {                          // mientras no se crucen las búsquedas                                   
            while (A[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
                j--;           // busca elemento menor que pivote
            }
            if (i < j) {                        // si no se han cruzado                      
                aux = A[i];                      // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        A[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1) {
            Quicksort(A, izq, j - 1);          // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            Quicksort(A, j + 1, der);          // ordenamos subarray derecho
        }
    }

    public long[] Shellsort(long[] vector) {
        int salto, i;
        long aux;
        boolean cambios;

        for (salto = vector.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < vector.length; i++) // se da una pasada
                {
                    if (vector[i - salto] > vector[i]) {       // y si están desordenados
                        aux = vector[i];                  // se reordenan
                        vector[i] = vector[i - salto];
                        vector[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
        return vector;
    }

    public long[] Radix(long[] vector) {
        long[][] bucket = new long[10][vector.length];
        int[] bucketOfElement = new int[10];
        long max = 0;
        // Encuentra el elemento más grande en la matriz
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
        }
        // Calcula el número de bits del elemento más grande
        int maxLength = (max + "").length();
        for (int m = 0, n = 1; m < maxLength; m++, n *= 10) {
            // Coloca los números en arr en los cubos correspondientes según sus unidades, decenas, centenas, etc.
            for (int i = 0; i < vector.length; i++) {
                int digit = (int) (vector[i] / n % 10);
                // Asignar el valor de arr [i] a la matriz bidimensional en el depósito
                bucket[digit][bucketOfElement[digit]] = vector[i];
                bucketOfElement[digit]++;
            }
            int index = 0;
            // Leer los elementos en el depósito y reasignarlos a arr
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < bucketOfElement[j]; k++) {
                    vector[index] = bucket[j][k];
                    index++;
                }
                bucketOfElement[j] = 0;// Borrar el número de elementos en cada uno
            }
        }

        return vector;
    }
}
