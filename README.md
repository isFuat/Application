# Application
Data Manipulation with Spring Framework and Hibernate as a JPA Implementation

<p>This project is implemented for the use of Hibernate as a JPA and Spring Framework<br />
during database applications for the purpose of add, modify, delete and search data.</p>

<p>There are three objects in here: Employee, Department and Meetings.</p>

<p>To run this maven project, all all dependencies must be properly installed,<br /> 
such as Maven, jdk and jre an the step below should to be followed.<p>
<ol>
<li>
install the project from the given link.
</li>
<li>
 unzip the file, then make sure you have you this <code><jdk.version>1.7</jdk.version> </code> 
    without quote in your properties if you don't have jdk installed.
</li>
<li>
 Then change the properties of jdbc.properties based on whatever system you use as database.
	jdbc can be found in this path <code>~/src/webapp/WEB-IN</code>
</li>
<li>
 Then create a new application on maven built by right click the project then going run configurations.
	put the project directory to the base directory section and <code>tomcat:run</code> to goals and run the project.
</li>
</li>
 go to <code>http://localhost:8080/<projectname>/index</code> to see in web.
<li>
</ol>

<p><em>Note:</em> database table must be created as all attributes in one table,EDM,before all.</p>
