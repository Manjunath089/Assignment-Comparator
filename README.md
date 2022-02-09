# Assignment-Comparator
### **Features :**
- Maven based BDD Cucumber framework
- Log4j enabled for logging
- Report Generation (cucumber-reporting)
- Centralized Configuration (Using Properties file)
- JUnit as unit testing framework

### **Setup**
- Install Java and Maven
- Add cucumber plugin in Eclipse

### **Details of the Framework**
- Both API and UI are integrated into a single framework
- Scenarios are written in Feature file
- TestRunner connects feature file with step defnition class
- Object Repositories are stored in page object model class
- Compare.class compares the values from both UI and API in a range, handles both the cases
- Dependencies are added in POM.xml file

### **Procedure for Execution**
- Go to TestRunner.class > Right-click > RunAs > JUnit
- Logs are generated in Log4J folder, It indicates whether the values are in range or not
- Reports are generated in Reports folder, it indicates whether the test case is passed or Failed
- 
