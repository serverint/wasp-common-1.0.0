# Common stuff
Contains common models, responses , request, utils and web filter. 
## CorsFilter
Add the following properties, in the application.properties file and the filter will add them in response headers 
```
endpoints.cors.exposed-headers=value
endpoints.cors.allowed-headers=value
endpoints.cors.allowed-methods=value
endpoints.cors.allowed-origins=value
endpoints.cors.allow-credentials=value
```
This filter also add's the request's start time in the request attributes in the ```startTime``` attribute.
## JwtFilter
Check's the jwt's signature, validity and existance in the db, the csrf header. If the jwt found in the db and it's valid, an IdentityToken object added in the ```identity-token``` request attribute.
Add the following environment variable in order to exclude paths from this filter 
```
ignore.jwt.filter.paths=/authentication/init,/v2/api-docs,/swagger.*,/.*.css,/.*.ico,/webjars/.*
```
This filter also add's the request's start time in the request attributes in the ```startTime``` attribute.

