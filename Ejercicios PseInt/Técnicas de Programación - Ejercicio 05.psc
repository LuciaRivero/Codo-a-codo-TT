// T�cnicas de Programaci�n - Ejercicio 5
// 5. Dados dos valores para cada cateto de un tri�ngulo rect�ngulo, 
// la computadora calcula y muestra el valor de la hipotenusa.
Algoritmo calcularHipotenusa
	Definir cateto1 Como Entero;
	Definir cateto2 Como Entero;
	Escribir "Ingres� el valor del primer cateto:";
	Leer cateto1;
	Escribir "Ingres� el valor del segundo cateto:";
	Leer cateto2;
	Escribir "La hipotenusa vale ", rc((cateto1*cateto1)+(cateto2*cateto2));
FinAlgoritmo

// "rc" es una funci�n que nos facilita PSeInt para calcular la ra�z cuadrada 
// del valor que tenga entre par�ntesis.