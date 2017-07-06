// Técnicas de Programación - Ejercicio 5
// 5. Dados dos valores para cada cateto de un triángulo rectángulo, 
// la computadora calcula y muestra el valor de la hipotenusa.
Algoritmo calcularHipotenusa
	Definir cateto1 Como Entero;
	Definir cateto2 Como Entero;
	Escribir "Ingresá el valor del primer cateto:";
	Leer cateto1;
	Escribir "Ingresá el valor del segundo cateto:";
	Leer cateto2;
	Escribir "La hipotenusa vale ", rc((cateto1*cateto1)+(cateto2*cateto2));
FinAlgoritmo

// "rc" es una función que nos facilita PSeInt para calcular la raíz cuadrada 
// del valor que tenga entre paréntesis.