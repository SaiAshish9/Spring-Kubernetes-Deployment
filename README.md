curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube-darwin-amd64

sudo install minikube-darwin-amd64 /usr/local/bin/minikube

https://minikube.sigs.k8s.io/docs/start/

```
minikube start
minikube status
minikube dashboard

kubectl get pods

docker build -t spring-k8s:1.0 .

eval $(minikube docker-env) // We need to allow k8s to read docker repository:

kubectl apply -f deployment.yaml 
// deployment.apps/spring-boot-k8s created

kubectl get deployments
NAME              READY   UP-TO-DATE   AVAILABLE   AGE
spring-boot-k8s   3/3     3            0 




```

<img width="857" alt="Screenshot 2023-02-02 at 11 15 25 PM" src="https://user-images.githubusercontent.com/43849911/216401660-65856cc2-c916-4a35-97fc-52f3dafce97d.png">

<img width="898" alt="Screenshot 2023-02-02 at 11 21 56 PM" src="https://user-images.githubusercontent.com/43849911/216403092-49d0220b-cd8a-4f2b-9c20-ef07c310e384.png">

<img width="951" alt="Screenshot 2023-02-02 at 11 22 19 PM" src="https://user-images.githubusercontent.com/43849911/216403160-05040e07-7f41-4afb-9bbc-efc892307b06.png">

<img width="961" alt="Screenshot 2023-02-02 at 11 42 14 PM" src="https://user-images.githubusercontent.com/43849911/216409573-2308d7ec-51eb-4c49-933c-da7db34a9123.png">

<img width="889" alt="Screenshot 2023-02-02 at 11 54 50 PM" src="https://user-images.githubusercontent.com/43849911/216414689-ce14cb0e-7bd4-4f92-b8d8-e0f3c3c056ab.png">

<img width="844" alt="Screenshot 2023-02-03 at 12 12 29 AM" src="https://user-images.githubusercontent.com/43849911/216420049-8c1c2f3e-93c0-4301-a5a4-250ca3f79e58.png">

```
replicas: 2, Create 2 PODS in k8s cluster 
```
