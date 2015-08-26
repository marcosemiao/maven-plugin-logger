# Maven Plugin Logger

## Fonctionnalités générales
Cette librairie permet dans la création d'un plugin maven, de rediriger les traces d'une implémentation d'un logger vers le logger par défaut de Maven.

- Facile d'utilisation, il suffit de rajouter la dépendance Maven dans votre application et la dépendance correspondant à votre implémentation de votre logger
- Disponible sur le repository central de Maven.
- Compatible à partir de la version Java 6.

## Utilisation rapide
- Ajouter la dépendance dans votre plugin maven :

````xml
<dependency>
	<groupId>com.github.marcosemiao.maven.plugin.logger</groupId>
	<artifactId>maven-plugin-logger</artifactId>
	<version>0.0.1</version>
</dependency>
````

- Dans votre plugin maven votre Pojo ne doit plus hériter de la classe "**AbstractMojo**" mais la classe "**AbstractLoggerMojo**".
Exemple :

````java
@Mojo(name = "deploy", defaultPhase = LifecyclePhase.PACKAGE)
public class DeployMojo extends AbstractMojo {

}
````

remplacer par :
````java
@Mojo(name = "deploy", defaultPhase = LifecyclePhase.PACKAGE)
public class DeployMojo extends AbstractLoggerMojo {

}
````

- Ajouter la dépendance de votre implémentation de log avec le scope "**runtime**" (Pour SLF4j) :
````xml
<dependency>
	<groupId>com.github.marcosemiao.maven.plugin.logger</groupId>
	<artifactId>maven-plugin-logger-slf4j</artifactId>
	<scope>runtime</scope>
	<version>0.0.1</version>
</dependency>
````
