// T�cnicas de Programaci�n - Ejercicio 9
// 9. Dado un tiempo en segundos, la computadora lo muestra expresado 
// en d�as, horas, minutos y segundos.
Algoritmo pasajeADias
	Definir cantSegundos Como Entero;
	Definir cantDias Como Entero;
	Definir cantHoras Como Entero;
	Definir cantMinutos Como Entero;
	Escribir "Ingres� la cantidad de segundos:";
	Leer cantSegundos;
	cantDias = trunc(cantSegundos/86400);
	cantSegundos = cantSegundos % 86400;
	cantHoras = trunc(cantSegundos/3600);
	cantSegundos = cantSegundos % 3600;
	cantMinutos = trunc(cantSegundos/60);
	cantSegundos = cantSegundos % 60;
	Escribir "Equivale a ", cantDias, "d, ", cantHoras, "h, ", cantMinutos, "m y ", cantSegundos, "s";
FinAlgoritmo

// trunc() es una funci�n que nos facilita PSeInt para tomar
// solo la parte entera de un n�mero (o quitarle la parte decimal, seg�n la �ptica).
// Es necesaria porque las variables est�n declaradas como enteros.