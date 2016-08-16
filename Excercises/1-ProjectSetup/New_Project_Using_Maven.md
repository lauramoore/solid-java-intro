The first thing Maven helps us out with is sharing projects via SCM.  
Eclipse (via m2e plugin) will read the pom.xml file present and auto-configure Eclipse to be able to build and run the tests and application.

### Import using Eclipse IDE Menu
1. `File > Import ... > Maven > Checkout Maven Projects from SCM`

### Build and Run the Application
* Use the IDE to trigger the Main class `project-right-click > Run As > Java Application`
* Check for Success message in Console

### Build and Run the Unit Tests
* Use the IDE to trigger Maven Test `project-right-click > Run As > Maven Test`
* Check for Success message in Console
