// 20. Escriba un programa que simule una calculadora básica que realice 
// operaciones de suma, resta, multiplicación y división. 
// El programa debe recibir como entrada dos números reales y un operador, 
// que puede ser +, -, * o /. La salida del programa debe ser el resultado 
// de la operación.
Algoritmo triangulos
	Definir numero1 como Real;
	Definir numero2 como Real;
	Definir operador como Caracter;
	Escribir "Escriba valor del primer numero";
	Leer numero1;
	Escribir "Escriba valor del segundo numero";
	Leer numero2;
	Escribir "Indique la operación";
	Escribir "Para sumarlos, coloque el +";
	Escribir "Para restarlos, coloque el -";
	Escribir "Para multiplicarlos, coloque el *";
	Escribir "Para dividirlos, coloque el /";
	Leer operador;
	Si operador == "+" Entonces 
		Escribir numero1," ",operador," ",numero2," = ",(numero1+numero2);
	Sino
		Si operador == "-" Entonces 
			Escribir numero1," ",operador," ",numero2," = ",(numero1-numero2);
		Sino 
			Si operador == "*" Entonces 
				Escribir numero1," ",operador," ",numero2," = ",(numero1*numero2);
			Sino
				Escribir numero1," ",operador," ",numero2," = ",(numero1/numero2);
			FinSi
		FinSi
	FinSi
FinAlgoritmo
