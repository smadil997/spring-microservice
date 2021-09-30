# Spring Microservices Architecture Initial Setup and Seed Proejct


Here i was planning to set-up a full stack Application with java microservices as backend and angular as UI.Main moto of this setup is to understand of Full stack application work. where new commers or beginners can understand easily, How we can setup a production ready application easily.

I will try to add many things in this setup so others people can understand or also can use same setup for their business.

### Planing on setup.
>I am planning to setup both things UI and Back-end also i will try to add Continuous delivery piple line with circleCI and also try add that application on cloud so for cloud we will use GCP.
Thinks we will Implement

IDE:- eclipse

Back-end :- Java Spring boot with microservice architecture.

UI:- Angular Latest Version

Database:- Mysql

Etc………

##### So we are very clear about our setup

Here you can clone this application and simply run on you machine and also you use for commercial use.
## ...More content loading

###### Techonology We will use in project

## Eureka Discovery
>Eureka is a RESTful (Representational State Transfer) service that is primarily
>used in the AWS cloud for the purpose of discovery, load balancing and failover of middle-tier >servers. It plays a critical role in Netflix mid-tier infra.
[Netflix/eureka](hhttps://github.com/Netflix/eureka)
## Feign
>Feign works by processing annotations into a templatized request.
>Arguments are applied to these templates in a straightforward fashion before output.
>Although Feign is limited to supporting text-based APIs, it dramatically simplifies system >aspects such as replaying requests. Furthermore, Feign makes it easy to unit test your >conversions knowing this.
>[OpenFeign/feign](https://github.com/OpenFeign/feign)


## Zuul
>Zuul is an L7 application gateway that provides capabilities for dynamic routing, 
monitoring, resiliency, security, and more. Please view the wiki for usage, information, HOWTO, etc
>[Netflix/zuul](https://github.com/Netflix/zuul)




Rest Repositories: to expose JPA repositories as REST endpoints
Web: Spring MVC and embedded Tomcat
Hystrix: a circuit breaker to stop cascading failure and enable resilience
Lombok: to reduce boilerplate code
