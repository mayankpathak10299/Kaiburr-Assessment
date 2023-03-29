# Kaiburr Task1 (Java REST API example)
---
Implement an application in java which provides a REST API with endpoints for searching,
creating and deleting “server” objects:

● GET servers. Should return all the servers if no parameters are passed. When server id
is passed as a parameter - return a single server or 404 if there’s no such a server.

● PUT a server. The server object is passed as a json-encoded message body. Here’s an
example:
{
“name”: ”my name,
“id”: “001”,
“language”:”java”,
“framework”:”django”
}

● DELETE a server. The parameter is a server ID.

● GET (find) servers by name. The parameter is a string. Must check if a server name
contains this string and return one or more servers found. Return 404 if nothing is found.

“Server” objects should be stored in MongoDB database.

Be sure that you can show how your application responds to requests using postman, curl or
any other HTTP client.

---

# Information & Documents for Task 1 of Kaiburr
1. REST APIs are crucial in software development for their standardized interface.
2. They use HTTP verbs to interact with resources.
3. Implementation details of the server are hidden from clients, providing a uniform interface.
4. Endpoints need to be defined for actions such as searching, creating, and deleting server objects.
5. MongoDB is used to store server objects and careful planning is necessary for a successful implementation.
---
