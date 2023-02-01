FROM openjdk:8
EXPOSE 8080
ADD build/libs/SpringBootKubernetesApplication-0.0.1-SNAPSHOT-plain.jar SpringK8sJar-0.0.1-SNAPSHOT
ENTRYPOINT ["java", "-jar", "n.jar"]