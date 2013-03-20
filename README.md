java-todos
==========

The point of this exercise is to see how you go about solving the problem, what code you end up writing, what dependencies you require, how you test it, and the user experience you create.

The Problem:
------------

Create a web-service layer that manages a simple Todo list. At the very minimum, the web services that must be supported are:

* retrieve full list of Todos
* delete a Todo by id
* create a new Todo

It is up to you to decide how you would like the user to interact with the application. A couple of options are:

* HTML + Javascript user interface
* commandline interface (apache commons CLI or JCommander are helpful)

Unit tests should be furnished.

If you do anything above and beyond, please explain what and why.

Getting Started:
----------------

```bash
mvn package
mvn jetty:run
```

Then, visit 
[http://localhost:8080/java-todos/](http://localhost:8080/java-todos/)

All API endpoints are mounted at /apis, e.g.:

[http://localhost:8080/java-todos/api/todos](http://localhost:8080/java-todos/api/todos)

Good luck!
