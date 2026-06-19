Nombre del proyecto: Centro Logistico

Integrantes: Agustina Carranza e Ignacio Agustin Santos

Alternativa Elegida: Centro Logistico-Opcion C

Estructura de datos utilizadas: Arreglos, Listas Enlazadas, Grafos y Conjuntos
Funcionalidades implementadas en esta segunda etapa: Localizacion de stock, Movimiento de inventario, Seguimiento de lotes, Control de inventario critico

Link del repositorio: https://github.com/AgustinaCarranza/CentroLogistico

Actividades realizadas por cada integrante: 
Agustina Carranza:
ConjuntoCodigos, DiccionarioProductos, MovimientoInventario, NodoMovimiento, Producto
Ignacio Agustin Santos:
ColaCircularPedidos, Pedido, PilaMovimientos, Main

Compilar, ejecutar y probar el sistema:
Clonar el repositorio
git clone https://github.com/AgustinaCarranza/CentroLogistico
Compilar el proyecto(desde la carpeta raiz del repositorio)
javac controller/Main.java
Ejecutar el programa
java controller.Main

El codigo se encuentra organizado en paquetes segun las responsabilidades:
TDA: Implementacion de estructuras de datos (ColaCircularPedidos, PilaMovimientos, DiccionarioProductos, GrafosPasillos)
Interfaces: Definicion de contratos de cada TDA (ICola, IPila, IDiccionario, IGrafoPasillos)
Model: Clases de dominio (Producto, Pedido, Pasillos, NodoMovimiento, NodoVertice, NodoAdyacente)
Service: Logica de negocio (MovimientoInventario)
View:  Metodos de impresion en consola (mostrarProductos, mostrarMovimientos, mostrarPedido, mostrarGrafo)
controller:  Clase Main que integra todas las funcionalidades y coordina la ejecucion del sistema

Casos de prueba:
Caso 1(Localizacion de Stock)
Funcionalidad evaluada: Recuperar producto por codigo en el diccionario
Datos de entrada: Codigo = 9999
Resultado esperado: Producto encontrado → "Arroz"
Resultado obtenido: "Encontrado Arroz"
Observaciones: Correcto

Caso 2(Movimiento de inventario)
Funcionalidad evaluada: Registrar entrada y salida de stock
Datos de entrada: Producto = Leche (codigo 5555), entrada de 6 unidades, salida de 20 unidades
Resultado esperado: Stock actualizado a 75, historial con dos movimientos
Resultado obtenido: Stock = 75, historial muestra entrada y salida
Observaciones: Correcto

Caso 3(Control de inventario critico)
- Funcionalidad evaluada: Detectar productos con stock menor a 10
- Datos de entrada: Producto = Botellas de agua (stock = 6)
- Resultado esperado: Producto listado como critico
- Resultado obtenido: "Productos con stock critico: Botellas de agua"
- Observaciones: Correcto

Caso 4(Procesamiento de pedidos)
Funcionalidad evaluada: Encolar y desencolar pedidos
Datos de entrada: Pedido 7777 con Leche y Agua, Pedido 4444 con Arroz
Resultado esperado: Procesamiento en orden FIFO
Resultado obtenido: Pedido 7777 → Leche y Agua; Pedido 4444 → Arroz
Observaciones: Correcto

Caso 5(Recorridos en grafo de pasillos)
Funcionalidad evaluada: Recorrido DFS y BFS desde Pasillo A
Datos de entrada: Grafo con pasillos A, B, C, D conectados
Resultado esperado: DFS → A-B-C-D; BFS → A-B-D-C
Resultado obtenido: Igual al esperado
Observaciones: Correcto






