// MAC OS ->
/*
pipeline {

    agent any

    stages{

        stage('Build Jar') {
            steps{
                sh "mvn clean package -DskipTests"
            }
        }

        stage('Build Image') {
            steps{
                sh "docker build -t=yehorychev/selenium-docker ."
            }
        }

        stage('Push Image') {
            steps{
                sh "docker push yehorychev/selenium-docker"
            }
        }
    }
} */

// WINDOWS USING BAT ->

pipeline {

    agent any

    stages {

        stage('Build Jar') {
            steps{
                bat "mvn clean package -DskipTests"
            }
        }

        stage('Build Image') {
            steps{
                bat "docker build -t=yehorychev/selenium-docker:latest ." // <- Local docker image name
            }
        }

        stage('Push Image') {
            environment{
                DOCKER_HUB = credentials('docker-hub-credentials')
            }
            steps {
                bat 'docker login -u %DOCKER_HUB_USR% -p %DOCKER_HUB_PSW%'
                bat "docker push yehory/selenium-docker:latest"  // <- docker-hub repository name
                bat "docker tag yehory/selenium-docker:latest yehory/selenium-docker:${env.BUILD_NUMBER}"
                bat "docker push yehory/selenium-docker:${env.BUILD_NUMBER}"
            }
        }
    }

    post {
        always {
            bat "docker logout"
        }
    }
}