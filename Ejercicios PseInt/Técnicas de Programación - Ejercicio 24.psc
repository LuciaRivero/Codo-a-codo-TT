Algoritmo EJ24
	Definir num Como Entero;
	Definir contador Como Entero;
	Escribir "Ingrese un número entre 1 y 10";
	Leer num;
	contador = 1;
	Si num < 1 || num > 10 Entonces
		Escribir "Número incorrecto.";
	Sino
		Mientras contador <= 10 Hacer
			Escribir num," x ",contador," = ",(num*contador);
			contador = contador + 1;
		FinMientras
	FinSi
FinAlgoritmo
