## This is shared library to use in out project

- Make changes in functionality that you need
- Run `mvn clean install` from root directory

### How to attach shared library to your project
- Add dependency to your `pom.xml` file in the `<dependencies>` node
	```
	<dependency>
		<groupId>ea.sof</groupId>
		<artifactId>shared</artifactId>
		<version>1.0</version>
	</dependency>
	```

### Push your changes
- push your changes to github