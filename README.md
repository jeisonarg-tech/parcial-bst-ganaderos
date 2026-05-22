# Parcial BST - GanaderosCasanare S.A.S.

## Descripción
Sistema de gestión de inventario de reses para GanaderosCasanare S.A.S.
implementado con un Árbol Binario de Búsqueda (BST) en Java.
Cada res se identifica por su código de chapeta electrónica asignado por el ICA.

## Autor
Jeison - Uniremington Yopal - Algoritmos II - 3er Semestre - 2026

## Estructura del proyecto
Parcial2/
├── NodoAnimal.java   → clase que representa cada res (código, raza, peso, edad)
├── ArbolBST.java     → BST con inserción recursiva, inorden, buscar y modificar
└── Principal.java    → menú interactivo en consola

## Requisitos
- Java 8 o superior
- No requiere librerías externas

## Cómo compilar y ejecutar

Compilar:
javac *.java

Ejecutar:
java Principal

## Opciones del menú
| Opción | Descripción                              |
|--------|------------------------------------------|
| 1      | Insertar un nuevo animal                 |
| 2      | Modificar datos de un animal existente   |
| 3      | Consultar datos de un animal por código  |
| 4      | Listar inventario completo (inorden)     |
| 5      | Salir                                    |

## ¿Cómo funciona el BST?
- La clave de ordenamiento es el código de chapeta (int)
- Si el código es MENOR que el nodo actual → va a la IZQUIERDA
- Si el código es MAYOR que el nodo actual → va a la DERECHA
- El recorrido inorden lista las reses en orden ascendente de código
- La búsqueda tiene complejidad O(log n) en un árbol equilibrado

## Secuencia de prueba (datos del parcial)
Insertar en orden: 50, 30, 70, 20, 40, 60, 80, 35, 45, 75

Árbol resultante:
<img width="424" height="439" alt="image" src="https://github.com/user-attachments/assets/39a81c6a-d074-4771-afa0-4759ac51f03f" />


Inorden: 20, 30, 35, 40, 45, 50, 60, 70, 75, 80
