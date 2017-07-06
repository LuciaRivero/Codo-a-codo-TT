// Técnicas de Programación - Ejercicio 10
// 10.	Una casa de artículos para el hogar ofrece a sus clientes 
// los siguientes planes de pago:
//	Plan 1: 100% al contado. Se hace el 10% de descuento sobre el precio publicado.
//	Plan 2: 50% al contado y el resto en 2 cuotas iguales. 
//	El precio publicado se incrementa en un 10%.
//	Plan 3: 25% al contado y el resto en 5 cuotas iguales. 
//	El precio publicado se incrementa en un 15%.
//	Plan 4: Totalmente financiado en 8 cuotas. El 60% se reparte en partes iguales 
//  en las primeras 4 cuotas y el resto se reparte en partes iguales en las últimas 4 cuotas.
//	El precio publicado se incrementa en un 25%.
// Dado el precio de un artículo, la computadora muestra los valores a pagar según cada plan.
		
Algoritmo mostrarPlanesDePago
	Definir precio Como Real;
	Definir valorPlan1 Como Real;
	Definir valorPlan2 Como Real;
	Definir valorPlan3 Como Real;
	Definir valorPlan4 Como Real;
	Definir valorContado2 Como Real;
	Definir valorContado Como Real;
	Definir valorCuota2 Como Real;
	Definir valorCuota3 Como Real;
	Definir valorCuota4_1 Como Real;
	Definir valorCuota4_2 Como Real;
	Escribir "Ingrese el precio del articulo: ";
	Leer precio;
	// PLAN 1
	valorPlan1 = precio - (precio * 0.1);
	Escribir "PLAN I";
	Escribir "Usted va a pagar $", valorPlan1, ".-";
	// PLAN 2
	valorPlan2 = precio + (precio * 0.1);
	valorContado2 = valorPlan2 / 2;
	valorCuota2 = (valorPlan2 - valorContado2) / 2;
	Escribir "PLAN II";
	Escribir "Usted va a pagar $", valorContado2, ".-  + dos cuotas de $", valorCuota2, ".-";
	// PLAN 3
	valorPlan3 = precio + (precio * 0.15);
	valorContado = valorPlan3 / 4;
	valorCuota3= (valorPlan3 - valorContado) / 5;
	Escribir "PLAN III";
	Escribir "Usted va a pagar $", valorContado, ".- + cinco cuotas de $", valorCuota3, ".-";
	// PLAN 4
	valorPlan4 = precio + (precio * 0.25);
	valorCuota4_1 = (valorPlan4 * 0.6) / 4;
	valorCuota4_2 = (valorPlan4 * 0.4) / 4;
	Escribir "PLAN IV";
	Escribir "Usted va a pagar cuatro cuotas de $", valorCuota4_1, ".- y luego cuatro cuotas de $", valorCuota4_2, ".-";
FinAlgoritmo