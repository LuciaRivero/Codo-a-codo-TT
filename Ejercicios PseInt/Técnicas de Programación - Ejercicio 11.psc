// T�cnicas de Programaci�n - Ejercicio 11
// 11. Se ingresan dos n�meros enteros. La computadora muestra su 
// cociente entero. Si hubiere resto, mostrarlo en otra l�nea.
Algoritmo cocienteEnteroConRestoCondicional
	Definir dividendo como Entero;
	Definir divisor como Entero;
	Definir cociente como Entero;
	Definir resto como Entero;
	Escribir "Ingrese un n�mero";
	Leer dividendo;
	Escribir "Ingrese un divisor";
	Leer divisor;
	cociente = trunc(dividendo/divisor);
	resto = dividendo % divisor;
	Escribir "El cociente entre los dos n�meros es ", cociente;
	Si resto != 0 Entonces
		Escribir "Restan ", resto, " unidades";
	FinSi
FinAlgoritmo