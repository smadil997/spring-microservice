# Spring Microservices Architecture Initial Setup and Seed Proejct

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
