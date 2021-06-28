![log search result](/images/log_search_result.png)

# Elastic Docker Demo
this is a tutorial for monitoring Spring Boot Application logs on Elastic Stack.
it provides simple Spring Boot Application, Elasticsearch, kibana, filebeat. Elastic stack is working on Docker so it's easy to reproduce the environment anywhere.
you can understand how we can monitor logs using Elastic Stack through this demo.

## Requirement
- docker
- Java IDE (Eclipse, IntelliJ, etc.)

## Installation
```bash
git clone https://github.com/sgr0416st/elastic-docker-demo.git
```

## Usage
please refer [] for more details (Japanese)

1. open terminal, go to this root project and run docker compose

```bash
cd {your project folder}
docker-compose up
```

2. open logging-demo (which is the sub project of this repository) on your IDE and run the application.

3. set up kibana
    
    a. access to the Kibana [(http://localhost:5601)](http://localhost:5601) and go to menu > Stack Management > Index Patterns

    b. click Create Index Pattern

    c. input filebeat-* as Index pattern name and go next step

    d. select @timestamp from time field drop down and create

4. search log from kibana 
    a. go to menu > Analytics > Discover

    b. Set the search range from 0:00 on the day you run this demo to now.

    c. access http://localhost:8080 and wait for 30 seconds(it populates the log like ("yyyy-MM-ddThh:mm:ss.SSS: return response"))

    d. set same search range and update
    --> you should find new logs!

you will be able to see the new logs on your kibana!!

## Note
if you face any issues for running this project, please see docker logs from your project path.

```bash
docker-compose logs -f
```

## Author 
* suguru.sato
* sgr0416st@gmail.com