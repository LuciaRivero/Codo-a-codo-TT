Algoritmo EJ24
	Definir num Como Entero;
	Definir contador Como Entero;
	Escribir "Ingrese un n�mero entre 1 y 10";
	Leer num;
	contador = 1;
	Si num < 1 || num > 10 Entonces
		Escribir "N�mero incorrecto.";
	Sino
		Mientras contador <= 10 Hacer
			Escribir num," x ",contador," = ",(num*contador);
			contador = contador + 1;
		FinMientras
	FinSi
FinAlgoritmo
