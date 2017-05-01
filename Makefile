run:
	mkdir -p app/out
	find . -not -name "*.swp" | grep java > sources.txt
	javac @sources.txt -sourcepath src -d app/out -cp app/out
	java -cp ./app/out Main
