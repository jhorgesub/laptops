## Spring Boot

Proyecto Spring Boot con las dependencias/starters:
* H2
* Spring Data JPA
* Spring Web
* Spring Boot DevTools
* Spring Security

Aplicación API Rest con acceso a Base de Datos H2 para persistir la información

El acceso se puede realizar desde Postman o navegador

## Entidad Laptop
1. Laptop
2. LaptopRepository
3. LaptopController

## Despliegue de la app Springboot en Github Pages
Crear un archivo `system.properties` en el proyecto con el contenido:
java.runtime.version=20

1. Subir el proyecto a github.com desde Intellij IDEA desde la opción VCS > Share project on Github
2. En github.com ir al repositorio y dentro de él, seleccionar `settings` > `Pages`
3. Una vez dentro de Pages, en `Source` debe estar seleccionada la opción 'Deploy from a branch'
4. Luego en `Branch`, seleccionar el branch deseado y click en Save
5. Automáticamente se generará un link para visitar la app ya desplegada