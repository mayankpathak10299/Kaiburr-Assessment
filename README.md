# Kaiburr-Assessment
Name: Mayank Pathak

Reg. No: 19BCE10299
# Task-1-Java REST API example
---
- Implement an application in java which provides a REST API with endpoints for searching,
creating and deleting “server” objects:

- GET servers. Should return all the servers if no parameters are passed. When server id
is passed as a parameter - return a single server or 404 if there’s no such a server.

- PUT a server. The server object is passed as a json-encoded message body. Here’s an
example:
{
“name”: ”my name,
“id”: “001”,
“language”:”java”,
“framework”:”django”
}

- DELETE a server. The parameter is a server ID.

- GET (find) servers by name. The parameter is a string. Must check if a server name
contains this string and return one or more servers found. Return 404 if nothing is found.

“Server” objects should be stored in MongoDB database.

- Be sure that you can show how your application responds to requests using postman, curl or any other HTTP client.
---
# Task-2-Swagger codegen.
- Create the same REST API as in task #1, but use https://editor.swagger.io/ to create your API
definition and generate the server code. 
- Choose any java-based server or server framework,
that you like.
- You can either use the online editor or generate the code manually, e.g. using this
document: https://github.com/swagger-api/swagger-codegen/wiki/server-stub-generator-howto.
- Make sure that you can deploy/run the generated code. Once your stub is ready - implement the
same functionality as described in task #1, but now in java.
- Finally, be sure that you can show how your application responds to requests using postman,
curl or any other HTTP client.

---
# Task-3-Kubernetes.
- Dockerfiles and build docker images. Create kubernetes yaml manifests for the application (at least a deployment and a service). 
- The following requirements should be fulfilled:
- you can bring your application up by applying your yaml manifests
- mongodb is running in a separate pod
- the application should take mongo connection details from the environment variables
- the app endpoints should be available from your host machine
- a persistent volume should be used to store the MongoDB data. I.e., when you delete
the MongoDB pod the records in the db should not disappear.
---
# Task-4-WEB UI Forms.
- Create a basic WEB UI frontend for an application that you created for #1 or #2 using any UI
framework of your choice. 
- You should be able to create, show and delete records from your UI.
---
# Task-6-Data-Science-Example.
- A sample machine learning program for classify the gender of each face based on its physical features.
---
