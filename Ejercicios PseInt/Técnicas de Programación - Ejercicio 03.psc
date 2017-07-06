// T�cnicas de Programaci�n - Ejercicio 3
// 3. Dados los valores de dos de los �ngulos interiores de un tri�ngulo, 
// la computadora muestra el valor del restante.
Algoritmo calcularAngulosInterioresTriangulo
	Definir angulo1 Como Entero;
	Definir angulo2 Como Entero;
	Escribir "Ingres� el valor del primer �ngulo:";
	Leer angulo1;
	Escribir "Ingres� el valor del segundo �ngulo:";
	Leer angulo2;
	Escribir "El �ngulo restante mide ", 180 - angulo1 - angulo2, "�.";
	// �Por qu� no declar� una variable para guardar el resultado?
	// Porque como el enunciado me dice MOSTRAR, se calcula directamente la operaci�n 
	// y se muestra por pantalla sin necesidad de reservar una variable. Es m�s eficiente.
	// Otra manera:
	// Definir anguloRestante Como Entero;
	// anguloRestante = 180 - angulo1 - angulo2;
	// Escribir "El �ngulo restante mide ", anguloRestante, "�.";
FinAlgoritmo