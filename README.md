# FreightConsignNumber
1) This application is developed using spring-boot .
2) To run the application run the command - java -jar FreightConsignNumber-1.0-SNAPSHOT.jar
3) to generate the next freightConsignmentNumber we have to hit URL http://localhost:8080/generateConsignNo
and requestBody should be attached to the request 

{
  "carrierName":"FreightmateCourierCo",
  "accountNumber":"123ABC",
  "digits":10,
  "lastUsedIndex":19605,
  "rangeStart":19000,
  "rangeEnd":20000
}

