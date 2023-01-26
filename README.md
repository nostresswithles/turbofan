### Usage
139-162-146-253.ip.linodeusercontent.com:8080

### Functionality
**Install Docker on VM**
* install Docker on [ubuntu](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-22-04) <br><br>

**Copy the .jar from your local machine to a folder on the VM**
* scp ./target/turbofan-api-0.0.1-SNAPSHOT.jar root@139.162.146.253:~/projects/gui_api <br><br>

**Build and run the docker image**
```bash 
    docker build -t nostresswithles/turbofan . 
```
```bash 
    docker run --rm --name turbofan_gui -d -p 8080:8081 nostresswithles/turbofan 
```




https://www.w3schools.com/js/js_graphics_chartjs.asp

# How to toggle chars
https://www.youtube.com/watch?v=tFIXoUzMyyo