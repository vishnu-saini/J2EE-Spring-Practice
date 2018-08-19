# JNDI and Database Connection pool using tomcat and mysql

Follow these simple steps to setup Database Connection Pooling inside Tomcat 6.x

- **Step 1:** Add following element to conf/context.xml file. This Resource will be avaible to all Applications deployed
```xml
	<Resource name="jdbc/test" auth="Container" type="javax.sql.DataSource"
		maxActive="100" maxIdle="30" maxWait="10000" username="root" password="root"
		driverClassName="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/training" />
```
provide values for all attributes (username, password, driverClassName, url etc)

- **Step 2:** Add following to web.xml of your Application
```xml
	<resource-ref>
		<description>Test Database Connection</description>
		<res-ref-name>jdbc/test</res-ref-name>
		<res-type>javax.sql.DataSource</res-type>
		<res-auth>Container</res-auth>
	</resource-ref>
```