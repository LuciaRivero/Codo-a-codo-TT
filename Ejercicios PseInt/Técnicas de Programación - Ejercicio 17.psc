// 17. Se ingresa un número. La computadora muestra el doble 
// del número por pantalla si es par y mayor que 50. Si es 
// un positivo menor que 50 e impar, la computadora muestra el triple.
Algoritmo doblesYTriples
	Definir num como Entero;
	Escribir "Escriba un número";
	Leer num;
	
	Si ( (num % 2 = 0) && (num > 50) ) Entonces
		Escribir num*2;
	Sino
		Si (num % 2 != 0) && (num >= 0) && (num < 50) Entonces
			Escribir num*3;
		FinSi
	FinSi
FinAlgoritmo
