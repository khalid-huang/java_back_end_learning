javac -d ./tomcat/webapps/ROOT/WEB-INF/classes ./tomcat/webapps/ROOT/WEB-INF/src/*.java
echo "javac done; start tomcat catalia.sh"

#./tomcat/bin/catalina.sh stop
./tomcat/bin/catalina.sh run
