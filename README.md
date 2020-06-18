# Liv2Train Backend Abhay Katharotiya

### Prerequisites
* java 1.8.x
* maven 3.x

### Steps To Setup

**1. Clone the repository**
```bash
    git clone https://github.com/AbhayKatharotiya/Backend_Liv2Train_Abhay_Katharotiya.git
```

**2. Build project**
```bash
    mvn clean install
``` 

**3. Run project** 
```bash
    java -jar target/backend-0.0.1-SNAPSHOT.jar
``` 
- Alternatively, you can run the app without packaging it using -
```bash
    mvn spring-boot:run
```

**4. Explore Apis**  
  

  ## Explore apis 

The app defines following APIs. 
 
```   
    POST /center   
    GET /center
```

#### POST /center API
* Use following body in signup api
```json
    {
        "centerName":"center name",
        "centerCode":"134560789aaa",
        "address":{
            "detailedAddress":"abc Palace",
            "city":"abc",
            "state":"xyz",
            "pincode":"123456"
        },
        "studentCapecity":15,
        "coursesOffered":["course1","course2","course3"],
        "contactEmail":"abc@mail.com",
        "contactPhone":"9876543210"
    }
```
* In this body email and contact no should be valid 
* Center name should be less then 40 characters
* Center code should be of 12 character alphanumeric value

#### GET /center API
* This api is used to get list of added centers

## Explore Other Repositories 

https://github.com/AbhayKatharotiya/SecurityModule.git
https://github.com/AbhayKatharotiya/BankingSystem.git
https://github.com/AbhayKatharotiya/E-commerce-Servlet-.git

