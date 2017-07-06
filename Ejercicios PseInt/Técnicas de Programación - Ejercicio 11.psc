// Técnicas de Programación - Ejercicio 11
// 11. Se ingresan dos números enteros. La computadora muestra su 
// cociente entero. Si hubiere resto, mostrarlo en otra línea.
Algoritmo cocienteEnteroConRestoCondicional
	Definir dividendo como Entero;
	Definir divisor como Entero;
	Definir cociente como Entero;
	Definir resto como Entero;
	Escribir "Ingrese un número";
	Leer dividendo;
	Escribir "Ingrese un divisor";
	Leer divisor;
	cociente = trunc(dividendo/divisor);
	resto = dividendo % divisor;
	Escribir "El cociente entre los dos números es ", cociente;
	Si resto != 0 Entonces
		Escribir "Restan ", resto, " unidades";
	FinSi
FinAlgoritmo