public class NodoAnimal {

    // Atributos del animal
    private int codigo; // código de chapeta (clave BST)
    private String raza;
    private double peso; // en kg
    private int edad; // en meses

    // Referencias a hijos izquierdo y derecho
    NodoAnimal izq;
    NodoAnimal der;

    // Constructor
    public NodoAnimal(int codigo, String raza, double peso, int edad) {
        this.codigo = codigo;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
        this.izq = null;
        this.der = null;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getRaza() {
        return raza;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    // Setters
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                " | Raza: " + raza +
                " | Peso: " + peso + " kg" +
                " | Edad: " + edad + " meses";
    }
}