#Clases Esenciales 1 

Repositorio contenedor de las soluciones de los ejercicios del 1 al 7 de java propuestos en Atenea en el documento DSA-ClasesEsenciales20131002.pdf.

Para solucionarlos en este caso he usado una clase para cada ejercicio que realiza las peticiones de los enunciados. Estas clases y sus metodos se llaman desde la clase principal llamada ClasesEsenciales1 de manera que los ejercicios se ejecutan secuencialmente mostrando por consola sus resultados y el final de cada uno de ellos.

Para los ejercicios 4 y 5 se ha comprobado que el hecho de recorrer byte a byte (o char a char) un archivo para contar su tamaño da el mismo resultado que usar el metodo .length() de la clase File por eso aparecen dos mensajes: uno calculado leyendo el archivo y otro con el metodo length.

He creado una clase ObtenerFechaHora que retorna la fecha y hora de una forma muy complicada, ya que me daba problemas con los formatos devueltos, asi que cree un metodo para asegurar que todos los numeros devueltos contenian 2 digitos. Habria sido mucho mejor usar SimpleDataFormat pero no lo conocia.

Para ejecutarlo, una vez hecho el build usar el siguiente comando:

java -cp archivo_resultado_del_maven_build.jar
edu.upc.eetac.dsa.asantamaria.ClasesEsenciales1.ClasesEsenciales1

Debe tenerse en cuenta que se han usado los archivos "registro.txt", "numeros.txt" y "carta_de_ajuste.jpg" (disponibles en el repositorio) si estos no estan ubicados en la carpeta desde donde se ejecuta la app los ejercicios del 1 al 6 lanzaran una excepcion tipo FileNotFound.

Albert Santamaria