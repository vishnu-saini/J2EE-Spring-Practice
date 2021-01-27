## JMS Core Java Consumer Producer demo

- Step 1 : Install glassfish server plugin in eclipse. (If not install)
- Step 2 : Add glassfish server, It require two paths 
	1. Glassfish server location
	2. Java Location
- Step 3 : Leave username and password feild blank in next window and finish
- Step 3 : Start Glassfish Server
- Step 4 : Open Admin console : Right click on server > Glassfish > View admin cosole
- Step 5 : In Admin console create two resources
	1. Connection factories
	2. Destination resources
	
	Both available in Resources > JMS Resources
	
	First Create Destination Resources (By clicking on Destination resources)
	1. Provide any `JNDI name` like (test/myJMSQueue)
	2. Provide `Physical Destination Name`  like (myQueue)
	3. Select `Resource type` (queue or topic)
	
	Second create Connection Factory
	1. Provide any `JNDI name` like (test/myJMSQueueCF)
	2. Select `Resource Type`: `javax.jms.QueueConnectionFactory`
	
- Step 6 : Import Consumer and Producer project in Eclipse
- Step 8 : add `gf-client.jar` in build path from the path `glassfish4\glassfish\lib` (don't copy other location)
- Step 9 : First Run Consumer.java as java Application
- Step 10 : Now Run Producer.java as java Application
- Step 11 : Check both console for the output