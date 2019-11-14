## This is shared library to use in out project

- Make changes in functionality that you need
- Run "make push" from root directory

### How to attach shared library to your project
- Add to your `pom.xml` file this repository in the `<project>` node 
	```
	<repositories>
		<repository>
			<id>private-repo</id>
			<name>PrivateRepo</name>
			<url>https://github.com/eaNov19-project/shared/raw/repository</url>
			<releases>
				<enabled>true</enabled>
				<updatePolicy>never</updatePolicy>
			</releases>
			<snapshots>
				<enabled>false</enabled>
			</snapshots>
		</repository>
	</repositories>
	``` 
- Add dependency to your `<dependencies>` node
	```
	<dependency>
		<groupId>ea.sof</groupId>
		<artifactId>shared</artifactId>
		<version>LATEST</version>
	</dependency>
	```
