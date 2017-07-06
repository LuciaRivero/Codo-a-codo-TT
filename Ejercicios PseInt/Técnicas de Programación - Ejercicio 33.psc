Algoritmo EJ33
	Definir palabraIngresada Como Cadena;
	Definir frase Como Cadena;
	Definir opcion Como Caracter;
	Definir continuar Como Logico;
	continuar = Verdadero;
	opcion = "";
	frase = "";
	Mientras continuar Hacer
		Escribir "Ingrese una palabra";
 		Leer palabraIngresada;
		frase = frase + " " + palabraIngresada;
		Mientras mayusculas(opcion) != "N" && minusculas(opcion) != "s" Hacer
			Escribir "¿Desea seguir ingresando? [S/N]";
			Leer opcion;
		FinMientras
		Si minusculas(opcion) == "n" Entonces
			continuar = falso;
		FinSi
		opcion = "";
	FinMientras
	Escribir frase;
FinAlgoritmo
