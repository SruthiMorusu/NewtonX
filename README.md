# NewtonX
A RESTful Web Service for Student using Java and Maven


Requirements
=======

* Spring Tool Suite 
* Maven
* Java JDK 1.8

Instructions
=======

* Install Maven
* Download the entire project source code
* Run with mvn spring-boot:run command from the project folder to start the service
* Execute the url http://localhost:8080/student?name=John with the desired student name in name field in url to search particular     student details


API Documentation
=======

The following is the details on API route implementations.

---
### GET student data
---

Returns the information for the specified student.

* **URL**

  `/student/:name

* **Method:**
  
  `GET`
  
*  **URL Params**

   **Required:**
 
     `*name*`

   **Optional:**
 
     None

* **Data Params**

  **Required:**
    
    None

   **Optional:**
 
     None
