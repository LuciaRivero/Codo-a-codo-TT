// 26.	Dada la cantidad de términos a considerar entre 
// los paréntesis, la computadora muestra el valor de la 
// correspondiente aproximación de Pi: 
// 4 · (1/1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + 1/n).
// Ejemplo: Se ingresa 5, la computadora muestra 3.33968
	
Algoritmo EJ26
	Definir termino Como Real;
	Definir contador Como Entero;
	Definir acumulador Como Real;
	Definir denominador Como Entero;
	Definir cantidadDeTerminos Como Entero;
	Escribir "¿Cuántos terminos desea considerar?";
	Leer cantidadDeTerminos;
	contador = 1;
	acumulador = 0;
	denominador = 1;
	Mientras contador <= cantidadDeTerminos Hacer
		Si (contador%2 == 0) Entonces // ES PAR
			termino = - (1 / denominador); // Guardo siempre las fracciones que restan (-1/3, -1/7, -1/11...)
		Sino // ES IMPAR
			termino = (1 / denominador); // Guardo siempre las fracciones que suman (+1/1, +1/5, +1/9...)
		FinSi
		acumulador = acumulador + termino; // si termino es negativo, mas por menos es menos asique se resta ;)
		denominador = denominador + 2;	// Los denominadores se incrementan de dos en dos
		contador = contador + 1; // Un nuevo ciclo...
	FinMientras
	Escribir "El resultado es ", (4 * acumulador);
FinAlgoritmo