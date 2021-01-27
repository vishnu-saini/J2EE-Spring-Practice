# Remote Method Invocation (RMI) && Enterprise Java Beans (EJB)

This project is about remote method invocation. It is acheived by two ways. 
- Using JNDI (In TestServlet1.java)
- Using DI with @EJB annotation (In TestServelt2.java)

# How to run

Step 1: Import Both project in Eclipse (Should have EJB plugin)
- EJB-Remote is a EJB Module 
- EJB-Remote-Invocation is a dynamic web project, it invokes a method from the other EJB module (EJB-Remote)

Step 2: Add glassfish system libraries.
Step 3: Run both project on Glassfish.
Step 4: Open in browser and try both url 
- http://localhost:8080/EJB-Remote-Invocation/test1
- http://localhost:8080/EJB-Remote-Invocation/test2


