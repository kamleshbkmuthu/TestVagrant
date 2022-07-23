1) Test cases are added in src\test\java\testRCBApi\ApiTest.java.
2) Refer src\test\java\testRCBApi Package for test case implementation.
3) JSON data payload is from src\main\java\resources\InputData.java.
4) Execute the test task from command line(pointing to local directory) using ./gradlew test -> command.
5) After executing the above test task, report will be generated in  ->
	C:\Users\BKKamlesh\eclipse-workspace\TestRCBApi\lib\AutomationReport\emailable-report.html

TestRCBApi Project pre-requisites are:

1) Jre/jdk 8 & above
2) Eclipse
3) Testng to be installed from eclipse market place
4) Gradle to be installed from eclipse market place (i guess this was issue from earlier interaction?)
5) Git installation for cloning the project
6) Once project is cloned gradle refresh 
Here are two ways we can do same if the gradle installation is successful.
-> From eclipse right click on project and gradle-> refresh gradle
-> second approach from command prompt navigate to project amd run below command
gradlew refresh / gradlew.bat refresh
-> if above step isnt resolving then run first clean and then refresh gradle command

