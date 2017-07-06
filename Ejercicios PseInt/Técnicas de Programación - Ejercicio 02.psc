// Técnicas de Programación - Ejercicio 2
// 2. Dados el valor de una hora de trabajo y la cantidad de horas trabajadas, 
// la computadora muestra el valor del sueldo bruto.
Algoritmo calcularSueldoBruto
	Definir valorPorHora Como Real;
	Definir horasTrabajadas Como Entero;
	Escribir "Ingresá el valor monetario de cada hora de trabajo:";
	Leer valorPorHora;
	Escribir "Ingresá la cantidad de horas trabajadas:";
	Leer horasTrabajadas;
	Escribir "El sueldo bruto es de $", valorPorHora * horasTrabajadas, ".-";
	// ¿Por qué no declaré una variable para guardar el resultado?
	// Porque como el enunciado me dice MOSTRAR, se calcula directamente la operación 
	// y se muestra por pantalla sin necesidad de reservar una variable. Es más eficiente.
	// Otra manera:
	// Definir sueldoBruto Como Real;
	// sueldoBruto = valorPorHora * horasTrabajadas;
	// Escribir "El sueldo bruto es de $", sueldoBruto, ".-";
FinAlgoritmo