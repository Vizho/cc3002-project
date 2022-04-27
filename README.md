# AventurasdeMarcosyLuis

##Instrucciones
Vaya a la carpeta 'test' y corra los test 'TestEnemy' y 'TestPlayer' respectivamente.

##Sobre el programa
El funcionamiento básico de este programa gira en torno a las funcionalidades de los personajes, ya sean jugables o no,
y cómo estos se relacionan entre sí, y además cómo lo hacen con los items.

Funciona como una columna vertebral, donde todo lo que tienen en común reside en Character y en AbstractCharacter,
y de allí se empieza a detallar las acciones particulares en las siguientes clases hasta llegar a los personajes como individuos.

Con la nueva actualización los personajes pueden interactuar más fácilmente con los objetos mediante un Baúl
donde se guardan los objetos que comparten Marcos y Luis, y se puede acceder de mejor manera a ellos.
Además se creó el sistema de ataques, por lo que los personajes principales y los enemigos pueden atacarse bajo las reglas estipuladas.
Del mismo modo se añadió la función de subir de nivel, donde se suben las stats de los personajes y también se añaden items
al Baúl.
Por último, se mejoró la interacción con los Puntos, como el HP y el FP, de modo que ahora se tiene un modelo
más correcto del uso de estas estadísticas.