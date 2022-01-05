# SpringCloud for Hoxton.SR1

#### 介绍
    记录SpringCloud的学习历程...


#### 软件架构
    Spring Cloud是一系列框架的有序集合。它利用Spring Boot的开发便利性巧妙地简化了分布式系统基础设施的开发，如服务发现注册、配置中心、消息总线、负载均衡、断路器、数据监控等，都可以用Spring Boot的开发风格做到一键启动和部署。Spring并没有重复制造轮子，它只是将目前各家公司开发的比较成熟、经得起实际考验的服务框架组合起来，通过Spring Boot风格进行再封装屏蔽掉了复杂的配置和实现原理，最终给开发者留出了一套简单易懂、易部署和易维护的分布式系统开发工具包。
Spring Cloud正是对Netflix的多个开源组件进一步的封装而成，同时又实现了和云端平台，和Spring Boot开发框架很好的集成。
Spring Cloud是一个相对比较新的微服务框架，2016年才推出1.0的release版本. 虽然Spring Cloud时间最短, 但是相比Dubbo等RPC框架, Spring Cloud提供的全套的分布式系统解决方案。
Spring Cloud 为开发者提供了在分布式系统（配置管理，服务发现，熔断，路由，微代理，控制总线，一次性token，全居琐，leader选举，分布式session，集群状态）中快速构建的工具，使用Spring Cloud的开发者可以快速的启动服务或构建应用、同时能够快速和云平台资源进行对接。


#### 版本声明

1.  SpringCloud            Hoxton SR1
2.  SpringBoot             2.2.2.RELEASE
3.  SpringCloud Alibaba    2.1.0.RELEASE
4.  Java                   JDK1.8
5.  Maven                  3.5及以上
6.  MySQL                  5.7及以上 

#### 版本控制依据

link： https://start.spring.io/actuator/info

{
  "git": {
    "branch": "440074a4c964542b196e2d7db2912decd8ab1e72",
    "commit": {
      "id": "440074a",
      "time": "2021-03-12T11:09:14Z"
    }
  },
  "build": {
    "version": "0.0.1-SNAPSHOT",
    "artifact": "start-site",
    "versions": {
      "spring-boot": "2.4.3",
      "initializr": "0.11.0-SNAPSHOT"
    },
    "name": "start.spring.io website",
    "time": "2021-03-12T11:11:07.576Z",
    "group": "io.spring.start"
  },
  "bom-ranges": {
    "azure": {
      "2.2.4": "Spring Boot >=2.2.0.RELEASE and <2.3.0.M1",
      "3.1.0": "Spring Boot >=2.3.0.M1 and <2.4.0-M1"
    },
    "codecentric-spring-boot-admin": {
      "2.2.4": "Spring Boot >=2.2.0.RELEASE and <2.3.0.M1",
      "2.3.1": "Spring Boot >=2.3.0.M1 and <2.5.0-M1"
    },
    "solace-spring-boot": {
      "1.0.0": "Spring Boot >=2.2.0.RELEASE and <2.3.0.M1",
      "1.1.0": "Spring Boot >=2.3.0.M1 and <2.5.0-M1"
    },
    "solace-spring-cloud": {
      "1.0.0": "Spring Boot >=2.2.0.RELEASE and <2.3.0.M1",
      "1.1.1": "Spring Boot >=2.3.0.M1 and <2.4.0-M1",
      "2.0.0": "Spring Boot >=2.4.0.M1 and <2.5.0-M1"
    },
    "spring-cloud": {
      "Hoxton.SR10": "Spring Boot >=2.2.0.RELEASE and <2.3.10.BUILD-SNAPSHOT",
      "Hoxton.BUILD-SNAPSHOT": "Spring Boot >=2.3.10.BUILD-SNAPSHOT and <2.4.0.M1",
      "2020.0.0-M3": "Spring Boot >=2.4.0.M1 and <=2.4.0.M1",
      "2020.0.0-M4": "Spring Boot >=2.4.0.M2 and <=2.4.0-M3",
      "2020.0.0": "Spring Boot >=2.4.0.M4 and <=2.4.0",
      "2020.0.1": "Spring Boot >=2.4.1 and <2.5.0-M1",
      "2020.0.2-SNAPSHOT": "Spring Boot >=2.4.4-SNAPSHOT"
    },
    "spring-cloud-alibaba": {
      "2.2.1.RELEASE": "Spring Boot >=2.2.0.RELEASE and <2.3.0.M1"
    },
    "spring-cloud-gcp": {
      "2.0.0": "Spring Boot >=2.4.0-M1 and <2.5.0-M1"
    },
    "spring-cloud-services": {
      "2.2.6.RELEASE": "Spring Boot >=2.2.0.RELEASE and <2.3.0.RELEASE",
      "2.3.0.RELEASE": "Spring Boot >=2.3.0.RELEASE and <2.4.0-M1"
    },
    "spring-geode": {
      "1.2.12.RELEASE": "Spring Boot >=2.2.0.RELEASE and <2.3.0.M1",
      "1.3.9.RELEASE": "Spring Boot >=2.3.0.M1 and <2.4.0-M1",
      "1.4.3": "Spring Boot >=2.4.0-M1 and <2.5.0-M1",
      "1.5.0-M2": "Spring Boot >=2.5.0-M1"
    },
    "vaadin": {
      "14.4.9": "Spring Boot >=2.1.0.RELEASE and <2.5.0-M1"
    },
    "wavefront": {
      "2.0.2": "Spring Boot >=2.1.0.RELEASE and <2.4.0-M1",
      "2.1.0": "Spring Boot >=2.4.0-M1"
    }
  },
  "dependency-ranges": {
    "native": {
      "0.9.0": "Spring Boot >=2.4.3 and <2.4.4-SNAPSHOT",
      "0.9.1-SNAPSHOT": "Spring Boot >=2.4.4-SNAPSHOT and <2.5.0-M1"
    },
    "okta": {
      "1.4.0": "Spring Boot >=2.2.0.RELEASE and <2.4.0-M1",
      "1.5.1": "Spring Boot >=2.4.0-M1 and <2.4.1",
      "2.0.1": "Spring Boot >=2.4.1 and <2.5.0-M1"
    },
    "mybatis": {
      "2.1.4": "Spring Boot >=2.1.0.RELEASE and <2.5.0-M1"
    },
    "camel": {
      "3.3.0": "Spring Boot >=2.2.0.RELEASE and <2.3.0.M1",
      "3.5.0": "Spring Boot >=2.3.0.M1 and <2.4.0-M1",
      "3.8.0": "Spring Boot >=2.4.0.M1 and <2.5.0-M1"
    },
    "open-service-broker": {
      "3.1.1.RELEASE": "Spring Boot >=2.2.0.RELEASE and <2.3.0.M1",
      "3.2.0": "Spring Boot >=2.3.0.M1 and <2.4.0-M1",
      "3.3.0": "Spring Boot >=2.4.0-M1 and <2.5.0-M1"
    }
  }
}