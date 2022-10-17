# FreightConsignNumber
1) This application is developed using spring-boot .
2) FreightConsignNumber-all-1.0-SNAPSHOT.jar(fat jar) is found the root directory of the repository.Please download the jar to run the program.
3) To run the application run the command - java -jar FreightConsignNumber-all-1.0-SNAPSHOT.jar
4) to generate the next freightConsignmentNumber we have to hit URL http://localhost:8080/generateConsignNo ,Request method -POST
and requestBody should be attached to the request .This can be  executed using any REST client like POSTMAN.

{
  "carrierName":"FreightmateCourierCo",
  "accountNumber":"123ABC",
  "digits":10,
  "lastUsedIndex":19605,
  "rangeStart":19000,
  "rangeEnd":20000
}

