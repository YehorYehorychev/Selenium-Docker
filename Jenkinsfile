pipeline{

    agent any

    stages{

        stage('Build Jar'){
            steps{
                sh "mvn clean package -DskipTests"
            }
        }

        stage('Build Image'){
            steps{
                sh "docker build -t=yehorychev/selenium-docker ."
            }
        }

        stage('Push Image'){
            steps{
                sh "docker push yehorychev/selenium-docker"
            }
        }
    }
}