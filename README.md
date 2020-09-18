# jbang-test
Demo testing JBang java scripting library with a twist + kotlin

### here is the compile kotlin class
build/classes/kotlin/main/

### with this, the kotlin library is imported
 ```
//DEPS org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.10
 ```
 
### before ejecting the script we need to generate the necessary kotlin classes
 ```
gradle build
 ```

### to run the java script
 ```
jbang --cp=build/classes/kotlin/main/ src/jscript.java
 ```
