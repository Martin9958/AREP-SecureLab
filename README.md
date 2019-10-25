# AREP-SecureLab

- Desarrolle una aplicación Web segura con los siguientes requerimientos:

1. Debe permitir un acceso seguro desde el browser a la aplicación. Es decir debe garantizar autenticación, autorización e integridad de usuarios.
2. Debe tener al menos dos computadores comunicandose entre ellos y el acceso de servicios remotos debe garantizar: autenticación, autorización e integridad entre los servicios. 
3. Nadie puede invocar los servicios si no está autorizado.
Explique como escalaría su arquitectura de seguridad para incorporar nuevos servicios.

## Entregables:

- Código en github, bien documentado.
- Informe que describe la arquitectura de seguridad de su prototipo.

## Ayudas:

- https://github.com/tipsy/spark-ssl
- https://www.baeldung.com/spring-boot-https-self-signed-certificate
- https://docs.oracle.com/cd/E19798-01/821-1841/gjrgy/
- https://docs.oracle.com/cd/E19509-01/820-3503/ggfen/index.htmlhttps://aws.amazon.com/es/serverless/build-a-web-app/

## Documento:

- Este Documento muestra el desarrollo de una aplicacion Web segura utilizando Spring y maven, donde se establece un registro de usuarios, un login que permite la autenticacion de los usuarios y un inicio que no sera accesible a todos los usuarios, sino solo a usuarios que esten en base de datos, adicionalmente esta establecida medianre protocolo HTTPS y el certificado correspondiente.

## Imagenes:
- Login

![Login](https://github.com/Martin9958/AREP-SecureLab/blob/master/src/images/Screen%20Shot%202019-10-24%20at%207.24.41%20PM.png)

- Registro

![Login](https://github.com/Martin9958/AREP-SecureLab/blob/master/src/images/Screen%20Shot%202019-10-24%20at%207.25.06%20PM.png)

- Pagina de Inicio

![Login](https://github.com/Martin9958/AREP-SecureLab/blob/master/src/images/Screen%20Shot%202019-10-24%20at%207.25.20%20PM.png)

