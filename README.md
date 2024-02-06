### Gateway Example
- boot-gateway: main route of the application
- first-service: first backend service
- second-service: second backend service

#### boot-gateway
All request goes through this application and it will reroute to appropriate application

- reroute
`localhost:8080/employee/** -> localhost:8010/employee/**`
`localhost:8080/consumer/** -> localhost:8020/consumer/**`

- successful case
`http://localhost:8080/employee/message`
`http://localhost:8080/consumer/message`

- failsafe case - Exception occurs
`http://localhost:8080/employee/fail`

- failsafe case - Timeout occurs
`http://localhost:8080/employee/time`

#### first-service
provide localhost:8010/employee/message end point

#### second-service
provide localhost:8020/consumer/message end point