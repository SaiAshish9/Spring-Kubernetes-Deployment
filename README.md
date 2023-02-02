curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube-darwin-amd64

sudo install minikube-darwin-amd64 /usr/local/bin/minikube

https://minikube.sigs.k8s.io/docs/start/

```
minikube stop
minikube start
minikube status
minikube dashboard

kubectl describe pods <pod>

Remove all containers:
docker rm $(docker ps -a -q)

Remove all images:
docker rmi $(docker images -a -q)

kubectl get pods 
// 3 will be shown

kubectl delete pod spring-boot-k8s-7d5ccdcf9f-f9mfw

docker build -t spring-k8s:1.0 .

docker run spring-k8s:1.0

docker exec -it spring-k8s:1.0

eval $(minikube docker-env) 
// We need to allow k8s to read docker repository:

kubectl apply -f deployment.yaml 
// deployment.apps/spring-boot-k8s created

kubectl get deployments
NAME              READY   UP-TO-DATE   AVAILABLE   AGE
spring-boot-k8s   3/3     3            0 

kubectl get pods

kubectl delete deploy spring-boot-k8s

kubectl logs spring-boot-k8s-7d5ccdcf9f-f9mfw

kubectl apply -f service.yaml 

kubectl get service

kubectl get svc

kubectl get nodes -o wide 

kubectl scale deploy fci-primaryds --replicas=1

minikube ip 
# node ip

we need node port and ip to access the api
http://{{nodeIP}}:{PORT}/{API URL}/endpoint
http://192.168.64.14:32208/message

minikube dashboard
```

<img width="857" alt="Screenshot 2023-02-02 at 11 15 25 PM" src="https://user-images.githubusercontent.com/43849911/216401660-65856cc2-c916-4a35-97fc-52f3dafce97d.png">

<img width="898" alt="Screenshot 2023-02-02 at 11 21 56 PM" src="https://user-images.githubusercontent.com/43849911/216403092-49d0220b-cd8a-4f2b-9c20-ef07c310e384.png">

<img width="1110" alt="Screenshot 2023-02-03 at 2 06 00 AM" src="https://user-images.githubusercontent.com/43849911/216443787-03426a05-11e4-489c-8596-2af0ac81bd75.png">

<img width="961" alt="Screenshot 2023-02-02 at 11 42 14 PM" src="https://user-images.githubusercontent.com/43849911/216409573-2308d7ec-51eb-4c49-933c-da7db34a9123.png">

<img width="889" alt="Screenshot 2023-02-02 at 11 54 50 PM" src="https://user-images.githubusercontent.com/43849911/216414689-ce14cb0e-7bd4-4f92-b8d8-e0f3c3c056ab.png">

<img width="844" alt="Screenshot 2023-02-03 at 12 12 29 AM" src="https://user-images.githubusercontent.com/43849911/216420049-8c1c2f3e-93c0-4301-a5a4-250ca3f79e58.png">


<img width="1687" alt="Screenshot 2023-02-03 at 2 57 59 AM" src="https://user-images.githubusercontent.com/43849911/216453477-7fa9934d-ef7a-4c4f-b9c3-6e1c192ca33c.png">

```
replicas: 2, Create 2 PODS in k8s cluster 
```

```
NodePort, Load Balancer and ClusterIp are 3 types available in k8s
We can access api via node ip & node port
We can check deployments,pods, replicaSets, service, clusterIp at UI
```

```
If one pod is deleted at UI , new pod will restarted immediately to maintain the replicaSet count
```

```
Status can be terminating , running and Container.
Logs can be viewed via a right click.
```
```
Deployments Pods & ReplicaSets
```

```
Self Healing Concept in k8s
```

<img width="813" alt="Screenshot 2023-02-03 at 3 09 45 AM" src="https://user-images.githubusercontent.com/43849911/216455598-d3e8a6a0-acbe-4db1-a4a3-1017fcad6cc3.png">


<img width="949" alt="Screenshot 2023-02-03 at 3 20 42 AM" src="https://user-images.githubusercontent.com/43849911/216457490-d89abe84-a6fd-4685-9e86-0b99fea7e39e.png">

```
eval $(minikube docker-env) 

docker build -t springboot-k8s-example:1.0 .
```

<img width="996" alt="Screenshot 2023-02-03 at 3 24 06 AM" src="https://user-images.githubusercontent.com/43849911/216458052-01ba5796-c439-4721-8261-bbec053ee569.png">

```
kubectl apply -f deployment.yaml 
deployment.apps/spring-boot-k8s configured

kubectl get deployments
NAME              READY   UP-TO-DATE   AVAILABLE   AGE
spring-boot-k8s   0/2     1            0           32m

kubectl get pods
NAME                               READY   STATUS             RESTARTS   AGE
spring-boot-k8s-658c8fff8d-v9h64   0/1     ImagePullBackOff   0          35s
spring-boot-k8s-7d5ccdcf9f-8mwq6   0/1     ImagePullBackOff   0          32m
spring-boot-k8s-7d5ccdcf9f-btsrv   0/1     ImagePullBackOff   0          32m
```


<img width="666" alt="Screenshot 2023-02-03 at 3 37 12 AM" src="https://user-images.githubusercontent.com/43849911/216460222-cb68995a-ed44-41fa-ae23-5d160efd96eb.png">

<img width="1692" alt="Screenshot 2023-02-03 at 4 00 38 AM" src="https://user-images.githubusercontent.com/43849911/216464232-1a3252ee-b920-4e04-998c-fba36280fb3a.png">

<img width="760" alt="Screenshot 2023-02-03 at 3 39 08 AM" src="https://user-images.githubusercontent.com/43849911/216460550-69268c0c-d1a0-4a37-8cb7-329bd959efb4.png">

<img width="1229" alt="Screenshot 2023-02-03 at 4 26 29 AM" src="https://user-images.githubusercontent.com/43849911/216469937-62ec633a-7395-4f68-963a-c56bdbd536e3.png">

<img width="1224" alt="Screenshot 2023-02-03 at 4 26 47 AM" src="https://user-images.githubusercontent.com/43849911/216469978-44da7730-8a4b-40cf-b680-7299e767fc9d.png">

<img width="1223" alt="Screenshot 2023-02-03 at 4 27 00 AM" src="https://user-images.githubusercontent.com/43849911/216470002-6f6add63-fa6e-4432-8531-b7e53b6e8888.png">






