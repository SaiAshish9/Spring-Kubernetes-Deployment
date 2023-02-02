curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube-darwin-amd64

sudo install minikube-darwin-amd64 /usr/local/bin/minikube

https://minikube.sigs.k8s.io/docs/start/

```
minikube start
minikube status
minikube dashboard

We need to allow k8s to read docker repository:
eval $(minikube docker-env)
```

<img width="857" alt="Screenshot 2023-02-02 at 11 15 25 PM" src="https://user-images.githubusercontent.com/43849911/216401660-65856cc2-c916-4a35-97fc-52f3dafce97d.png">

<img width="898" alt="Screenshot 2023-02-02 at 11 21 56 PM" src="https://user-images.githubusercontent.com/43849911/216403092-49d0220b-cd8a-4f2b-9c20-ef07c310e384.png">

<img width="951" alt="Screenshot 2023-02-02 at 11 22 19 PM" src="https://user-images.githubusercontent.com/43849911/216403160-05040e07-7f41-4afb-9bbc-efc892307b06.png">
