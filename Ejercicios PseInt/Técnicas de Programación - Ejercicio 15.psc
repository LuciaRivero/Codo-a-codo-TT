// Técnicas de Programación - Ejercicio 15
// 15. Dados el valor del radio de una circunferencia cuyo centro está
// ubicado en (0;0) y las coordenadas (x;y) de un punto, la computadora
// informa si el punto pertenece a la circunferencia.
Algoritmo coordenadas
	Definir radio como Entero;
	Definir x como Entero;
	Definir y como Entero;
	Definir hipotenusa como Real;
	Escribir "Ingrese radio del círculo";
	Leer radio;
	Escribir "Ingrese coordenada X";
	Leer x;
	Escribir "Ingrese coordenada Y";
	Leer y;
	hipotenusa = rc((x*x)+(y*y));
	Si radio == hipotenusa Entonces
		Escribir "El punto (",x,";",y,") pertenece a la circunferencia";
	Sino
		Escribir "El punto (",x,";",y,") NO pertenece a la circunferencia";
	FinSi
FinAlgoritmo