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
