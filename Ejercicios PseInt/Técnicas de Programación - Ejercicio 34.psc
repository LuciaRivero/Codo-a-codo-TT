Algoritmo sin_titulo
	Definir numeroIngresado Como Entero;
	Definir numeroAnterior Como Entero;
	Definir opcion Como Cadena;
	Definir continuar Como Logico;
	Definir esAscendente Como Logico;
	continuar = Verdadero;
	esAscendente = Verdadero;
	opcion = "";
	numeroAnterior = 0;
	Mientras continuar Hacer
		Escribir "Ingrese un número";
		Leer numeroIngresado;
		Si numeroIngresado < numeroAnterior Entonces
			esAscendente = falso;
		FinSi
		// Este ciclo es para...
		Mientras Minusculas(opcion) != "no" && Minusculas(opcion) != "si" Hacer
			Escribir "¿Más números? [SI/NO]";
			Leer opcion;
		FinMientras
		// Pregunto si corta o no
		Si Minusculas(opcion) == "no" Entonces
			continuar = falso;
		FinSi
		opcion = "";
		numeroAnterior = numeroIngresado;
	FinMientras
	Si esAscendente Entonces
		Escribir "Es ascendente";
	Sino
		Escribir "NO es ascendente";
	FinSi
FinAlgoritmo
