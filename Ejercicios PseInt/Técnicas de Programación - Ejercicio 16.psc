// 16. Se ingresan tres n�meros. La computadora los muestra 
// ordenados de menor a mayor.
Algoritmo orden
	Definir a como Entero;
	Definir b como Entero;
	Definir c como Entero;
	Escribir "Escriba el primer n�mero";
	Leer a;
	Escribir "Escriba el segundo n�mero";
	Leer b;
	Escribir "Escriba el tercer n�mero";
	Leer c;
	// PASO A ORDENARLOS
	Si (a <= b && b <= c) Entonces
		Escribir a," ",b," ",c;
	Sino
		Si (a <= c && c <= b) Entonces
			Escribir a," ",c," ",b;
		Sino
			Si (b <= a && a <= c) Entonces
				Escribir b," ",a," ",c;
			Sino
				Si (b <= c && c <= a) Entonces
					Escribir b," ",c," ",a;
				Sino
					Si (c <= a && a <= b) Entonces
						Escribir c," ",a," ",b;
					Sino
						Escribir c," ",b," ",a;
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
