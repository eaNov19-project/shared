mvn-clean:
	mvn clean

mvn-build: mvn-clean
	mvn install

cp:
	cp target/shared.jar deploy/shared.jar

git-add:
	git add -A . && git commit -m "1.0"

git-push: mvn-build cp git-add
	git push origin repository