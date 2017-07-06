Algoritmo EJ27
	Definir contador Como Entero;
	Definir cantTerminos Como Entero;
	Definir actual Como Entero;
	Definir anterior Como Entero;
	Definir fibo Como Entero;
	Escribir "Ingrese la cantidad de términos de la sucesión de Fibonacci:";
	Leer cantTerminos;
	contador = 0;
	anterior = 0;
	actual = 1;
	Mientras contador < cantTerminos Hacer
		fibo = anterior + actual;
		Escribir anterior," " Sin Saltar;
		anterior = actual;
		actual = fibo;
		contador = contador + 1;
	FinMientras
FinAlgoritmo
