Algoritmo EJ23
	Definir dia Como Entero;
	Definir mes Como Entero;
	Escribir "Ingrese el d�a";
	Leer dia;
	Escribir "Ingrese el mes";
	Leer mes;
	Si dia >= 1 && dia <= 31 Entonces
		Si mes >= 1 && mes <= 12 Entonces
			Segun mes Hacer
				1:
					Si dia <= 21 Entonces
						Escribir "Sos de capricornio";
					Sino
						Escribir "Sos de acuario";
					FinSi
				2:
					Si dia <= 28 Entonces
						Si dia <= 19 Entonces
							Escribir "Sos de acuario";
						Sino
							Escribir "Sos de piscis";
						FinSi
					Sino
						Escribir "Febrero solo tiene 28 d�as (no contemplamos a�os bisiestos)";	
					FinSi
				3:
					Si dia <= 20 Entonces
						Escribir "Sos de piscis";
					Sino
						Escribir "Sos de aries";
					FinSi
				4:
					Si dia <= 30 Entonces
						Si dia <= 21 Entonces
							Escribir "Sos de aries";
						Sino
							Escribir "Sos de tauro";
						FinSi
					Sino
						Escribir "Abril solo tiene 30 d�as";	
					FinSi
				5:
					Si dia <= 22 Entonces
						Escribir "Sos de tauro";
					Sino
						Escribir "Sos de g�minis";
					FinSi
				6:
					Si dia <= 30 Entonces
						Si dia <= 22 Entonces
							Escribir "Sos de g�minis";
						Sino
							Escribir "Sos de c�ncer";
						FinSi
					Sino
						Escribir "Junio solo tiene 30 d�as";	
					FinSi
				7:
					Si dia <= 22 Entonces
						Escribir "Sos de c�ncer";
					Sino
						Escribir "Sos de leo";
					FinSi
				8:
					Si dia <= 24 Entonces
						Escribir "Sos de leo";
					Sino
						Escribir "Sos de virgo";
					FinSi
				9:
					Si dia <= 30 Entonces
						Si dia <= 23 Entonces
							Escribir "Sos de virgo";
						Sino
							Escribir "Sos de libra";
						FinSi
					Sino
						Escribir "Septiembre solo tiene 30 d�as";	
					FinSi
				10:
					Si dia <= 23 Entonces
						Escribir "Sos de libra";
					Sino
						Escribir "Sos de escorpio";
					FinSi
				11:
					Si dia <= 30 Entonces
						Si dia <= 23 Entonces
							Escribir "Sos de escorpio";
						Sino
							Escribir "Sos de sagitario";
						FinSi
					Sino
						Escribir "Noviembre solo tiene 30 d�as";	
					FinSi
				12:
					Si dia <= 22 Entonces
						Escribir "Sos de sagitario";
					Sino
						Escribir "Sos de capricornio";
					FinSi
			FinSegun
		Sino
			Escribir "Mes inv�lido";
		FinSi
	Sino
		Escribir "D�a incorrecto";
	FinSi
FinAlgoritmo
