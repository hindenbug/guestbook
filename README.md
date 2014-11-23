# guestbook

FIXME

## Prerequisites

You will need [Leiningen][1] 1.7.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

## Namespaces in the app

```clj
  guestbook.handler
```
Responsible for bootstrapping and creating the hander for the server to pass requests to the
application

```clj
  guestbook.routes.name
```
Workflow/routes lives here

```clj
  guestbook.views.layout
```
Manages application layout

```clj
  guestbook.models.db
```
Governs the data model for the application, connection, table definitions etc

## License

Copyright © 2014 FIXME


