1. Authentication
First, if you are running a typical (web) application, you need your users to authenticate. That means your application needs to verify if the user is who he claims to be, typically done with a username and password check.
2. Authorization
->In simpler applications, authentication might be enough: As soon as a user authenticates, she can access every part of an application.
->However, most applications have the concept of permissions (or roles). Imagine customers who have access to the public-facing frontEnd of your webshop, and administrators who have access to a separate admin area.
->Both types of users need to login, but the mere fact of authentication doesn’t say anything about what they are allowed to do in your system. Hence, you also need to check the permissions of an authenticated user, i.e. you need to authorize the user.
