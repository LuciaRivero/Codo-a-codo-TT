// Técnicas de Programación - Ejercicio 3
// 3. Dados los valores de dos de los ángulos interiores de un triángulo, 
// la computadora muestra el valor del restante.
Algoritmo calcularAngulosInterioresTriangulo
	Definir angulo1 Como Entero;
	Definir angulo2 Como Entero;
	Escribir "Ingresá el valor del primer ángulo:";
	Leer angulo1;
	Escribir "Ingresá el valor del segundo ángulo:";
	Leer angulo2;
	Escribir "El ángulo restante mide ", 180 - angulo1 - angulo2, "º.";
	// ¿Por qué no declaré una variable para guardar el resultado?
	// Porque como el enunciado me dice MOSTRAR, se calcula directamente la operación 
	// y se muestra por pantalla sin necesidad de reservar una variable. Es más eficiente.
	// Otra manera:
	// Definir anguloRestante Como Entero;
	// anguloRestante = 180 - angulo1 - angulo2;
	// Escribir "El ángulo restante mide ", anguloRestante, "º.";
FinAlgoritmo