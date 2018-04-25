# Spring Boot on Docker connecting to MySQL Docker container

1. 
`docker run --name mysql-standalone -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=test -e MYSQL_USER=sa -e MYSQL_PASSWORD=password -d mysql:5.6`

2. construirlo desde intellij , crear la imagen con :'docker build . -t exercises-mysql'

3. construir contenedor y unirlo con la db docker run -p 8086:8086 --name exercises-mysql --link mysql-standalone:mysql -d exercises-mysql

4. verificar si los contenedores estan funcionando con docker log <name>, el de mysql debe decir 3306 y el de ms algo de tomcat y el puerto
  
5. mirar con docker container ls si estan corriendo y probar en la ip de rancher node

