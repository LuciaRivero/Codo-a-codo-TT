// Técnicas de Programación - Ejercicio 4
// 4. Dado el valor del radio de una esfera, la computadora muestra el valor 
// de su superficie y su volumen.
Algoritmo calcularSuperficieVolumenEsfera
	Definir radioEsfera Como Entero;
	Escribir "Ingresá el radio de la esfera:";
	Leer radioEsfera;
	Escribir "La superficie de la esfera es de ", 4 * PI * radioEsfera * radioEsfera;
	Escribir "El volumen de la esfera es de ", 4/3 * PI * radioEsfera * radioEsfera * radioEsfera;
FinAlgoritmo

// ¿De donde salió "PI" si no la declaré? Es una constante tan popular 
// que el propio PSeInt la incorpora por defecto. 
// Declarar una variable con el nombre "PI" dará error.