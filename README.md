# Prerequisitos
Tener Docker instalado

# Instrucciones
Para correr el proyecto son necesarios los siguientes pasos. 

1.- Es necesario clonar el repositorio y despues posicionarse en el root directory de este.
![image](https://github.com/giraffeman123/tech-interview-xaldigital/assets/36062624/3cddf5bd-26f5-4196-a8cc-715869e9f9c5)

2.- Estando ahi se dirigira a la carpeta web-app. 
Dentro de esta ejecutara el siguiente comando ```./mvnw clean package```. Este comando es para empaquetar nuestro servidor web en .war. 

3.- Habiendo finalizado dirigirse nuevamente al root directory y estando ahi ejecutar el siguiente comando: ```docker-compose up -d```

Esperar un momento en lo que los contenedores inicializan. 

Finalmente nuestra aplicacion estara expuesta en el siguiente enlace: https://localhost/home
