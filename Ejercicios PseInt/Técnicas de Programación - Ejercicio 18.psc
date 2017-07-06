// 18. Dados dos números enteros, la computadora indica si el mayor 
// es divisible por el menor.
Algoritmo esDivisible
	Definir numero1 como Entero;
	Definir numero2 como Entero;
	Definir elMayor como Entero;
	Definir elMenor como Entero;
	Escribir "Escriba un número";
	Leer numero1;
	Escribir "Escriba un número";
	Leer numero2;
	Si ( numero1 <= numero2 ) Entonces
		elMenor = numero1;
		elMayor = numero2;
	Sino
		elMenor = numero2;
		elMayor = numero1;
	FinSi
	Si (elMayor % elMenor == 0) Entonces
		Escribir elMayor," es divisible por ",elMenor;
	Sino
		Escribir elMayor," NO es divisible por ",elMenor;
	FinSi
FinAlgoritmo
