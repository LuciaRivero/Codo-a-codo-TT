Algoritmo EJ29
	Definir contador Como Entero;
	Definir numeroMayor Como Entero;
	Definir posicionNumeroMayor Como Entero;
	Definir numeroIngresado Como Entero;
	contador = 1;
	Escribir "Ingrese el ",contador,"º número";
	Leer numeroIngresado;
	numeroMayor = numeroIngresado;
	posicionNumeroMayor = contador;
	contador = contador + 1;
	Mientras contador <= 5 Hacer
		Escribir "Ingrese el ",contador,"º número";
		Leer numeroIngresado;
		Si numeroIngresado > numeroMayor Entonces
			numeroMayor = numeroIngresado;
			posicionNumeroMayor = contador;
		FinSi
		contador = contador + 1;
	FinMientras
	Escribir "El número más grande fue el ",numeroMayor;
	Escribir "Se encontró en la ",posicionNumeroMayor,"º posición";
FinAlgoritmo
