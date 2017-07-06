// 19. Los tres lados a, b y c de un tri�ngulo deben satisfacer 
// la desigualdad triangular: cada uno de los lados no puede ser 
// m�s largo que la suma de los otros dos. 
// Escriba un programa que reciba como entrada los tres lados 
// de un tri�ngulo, e indique: si acaso el tri�ngulo es inv�lido; 
// y, si no lo es, qu� tipo de tri�ngulo es (equil�tero, is�sceles o escaleno).
Algoritmo triangulos
	Definir a como Entero;
	Definir b como Entero;
	Definir c como Entero;
	Escribir "Escriba valor del primer lado";
	Leer a;
	Escribir "Escriba valor del segundo lado";
	Leer b;
	Escribir "Escriba valor del tercer lado";
	Leer c;
	Si (a < b+c) && (b < a+c) && (c < a+c) Entonces 
		// Si se cumple, es un tri�ngulo v�lido
		Escribir "El tri�ngulo es v�lido";
		Si a == b && b == c Entonces
			Escribir "El tri�ngulo es equil�tero";
		Sino
			Si a == b || b == c || a == c Entonces
				Escribir "El tri�ngulo es is�sceles";
			Sino
				Escribir "El tri�ngulo es escaleno";
			FinSi
		FinSi
	Sino
		// No se cumpli�. Es un tri�ngulo inv�lido
		Escribir "El tri�ngulo NO es v�lido";
	FinSi
FinAlgoritmo
