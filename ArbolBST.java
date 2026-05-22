public class ArbolBST {

    private NodoAnimal raiz;

    public ArbolBST() {
        this.raiz = null;
    }

    // Método público de inserción
    public void insertar(int codigo, String raza, double peso, int edad) {
        NodoAnimal nuevo = new NodoAnimal(codigo, raza, peso, edad);
        raiz = insertarRec(raiz, nuevo);
    }

    // Método privado recursivo de inserción
    private NodoAnimal insertarRec(NodoAnimal nodo, NodoAnimal nuevo) {
        // Si el nodo está vacío, insertar aquí
        if (nodo == null)
            return nuevo;

        // Menor → izquierda
        if (nuevo.getCodigo() < nodo.getCodigo()) {
            nodo.izq = insertarRec(nodo.izq, nuevo);
            // Mayor → derecha
        } else if (nuevo.getCodigo() > nodo.getCodigo()) {
            nodo.der = insertarRec(nodo.der, nuevo);
        } else {
            System.out.println("El código " + nuevo.getCodigo() + " ya existe.");
        }
        return nodo;
    }

    // Recorrido inorden: Izquierda → Raíz → Derecha (orden ascendente)
    public void recorrerInorden() {
        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return;
        }
        inordenRec(raiz);
    }

    private void inordenRec(NodoAnimal n) {
        if (n == null)
            return;
        inordenRec(n.izq);
        System.out.println(n);
        inordenRec(n.der);
    }

    // Buscar un nodo por código
    public NodoAnimal buscar(int codigo) {
        NodoAnimal actual = raiz;
        while (actual != null) {
            if (codigo == actual.getCodigo())
                return actual;
            else if (codigo < actual.getCodigo())
                actual = actual.izq;
            else
                actual = actual.der;
        }
        return null; // no encontrado
    }

    // Modificar peso y edad de un nodo existente
    public boolean modificar(int codigo, double nuevoPeso, int nuevaEdad) {
        NodoAnimal nodo = buscar(codigo);
        if (nodo == null)
            return false;
        nodo.setPeso(nuevoPeso);
        nodo.setEdad(nuevaEdad);
        return true;
    }
}