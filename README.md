# "RESTfull-ish" API for a Simple ToDo App

## [Demo application](https://todo-frontend-nine.vercel.app/) that utilizes this api.
You can register a new user, or use the dummy credentials as follows


username : `billy`

password : `billy`

### [repo for demo app](https://github.com/philFernandez/ToDo_Frontend)

## Endpoints Available

-   Register a user: `POST`

    -   `https://somehost.com/register`

-   Authenticate a user: `POST`

    -   `https://somehost.com/authenticate`

-   Write a new ToDo record to the database: `POST`

    -   `https://somehost.com/api/todo`

-   Get list of all stored ToDo records: `GET`

    -   `https://somehost.com/api/todos`

## Shape of `POST` Requests

-   `POST` request for registering user

```json
{
    "username": "<NewUsersName>",
    "password": "<NewUserPassword>"
}
```

-   `POST` request for authenticating is identical to registering
    -   Successful authentication request returns a JASON WEB TOKEN (jwt) for future `GET` requests authentication verification.
-   `POST` request for writing new ToDo record to database

```json
{
    "description": "<some description text>",
    "startDate": "<date formatted however you want (string)>",
    "endDate": "<date formatted however you want (string)>",
    "priority": "<LOW | MEDIUM | HIGH> OR <0 | 1 | 2>"
}
// Need to send along JWT (JSON WEB TOKEN) with request
```

## Shape of `GET` request for receiving stored records

```json
[
    {
        "id": 1,  // IDs are auto generated
        "description": "<some description text>",
        "startDate": "<string date>",
        "endDate": "<string date>",
        "priority": "<LOW | MEDIUM | HIGH>"
    },
    {
        "id": 2,
        "description": "<some description text>",
        "startDate": "<string date>",
        "endDate": "<string date>",
        "priority": "<LOW | MEDIUM | HIGH>"
    },
    // ...
]
```
