// 19. Los tres lados a, b y c de un triángulo deben satisfacer 
// la desigualdad triangular: cada uno de los lados no puede ser 
// más largo que la suma de los otros dos. 
// Escriba un programa que reciba como entrada los tres lados 
// de un triángulo, e indique: si acaso el triángulo es inválido; 
// y, si no lo es, qué tipo de triángulo es (equilátero, isósceles o escaleno).
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
		// Si se cumple, es un triángulo válido
		Escribir "El triángulo es válido";
		Si a == b && b == c Entonces
			Escribir "El triángulo es equilátero";
		Sino
			Si a == b || b == c || a == c Entonces
				Escribir "El triángulo es isósceles";
			Sino
				Escribir "El triángulo es escaleno";
			FinSi
		FinSi
	Sino
		// No se cumplió. Es un triángulo inválido
		Escribir "El triángulo NO es válido";
	FinSi
FinAlgoritmo
