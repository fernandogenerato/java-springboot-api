# Spring Boot Project with Clean Architecture and Redis Cache

This is a Spring Boot project that follows the best practices of Clean Architecture and incorporates a Redis cache layer. It is configured to be easily run using Docker Compose.

## Prerequisites

- Docker
- Docker Compose

## Configuration

Make sure Docker and Docker Compose are installed on your system.

1. Clone this repository to your local machine:

```bash
git clone https://github.com/fernandogenerato/java-springboot-api.git
```

2. Navigate to the cloned directory:

```bash
cd java-springboot-api
```

3. Run the following command to start the application with Docker Compose:

```bash
docker-compose up -d --build
```

This will start the Redis services and the Spring Boot API.

## Accessing the API

The API will be available at [http://localhost:8080](http://localhost:8080).

POST
``` curl

curl --location 'http://localhost:8080/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Devante",
    "email": "Wilhelmine.Skiles@example.com",
    "document": "5ec1c3ef-25ad-48a3-a08c-b87ce4b4cc53}"
}'
```
GET
```
curl --location 'http://localhost:8080/users/5ec1c3ef-25ad-48a3-a08c-b87ce4b4cc53'
```

## Accessing Redis Commander

Redis Commander is a tool for managing Redis instances through a web interface. It will be available at [http://localhost:8081](http://localhost:8081).
![image](https://github.com/fernandogenerato/java-springboot-api/assets/22321412/c90a387a-4161-4008-8703-4faa98858763)


## Redis Configuration

Redis is configured in the `docker-compose.yml` file and exposed on port `6379`. You can modify the configurations as needed.
