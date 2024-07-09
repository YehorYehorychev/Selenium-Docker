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
                bat "docker build -t=yehorychev/selenium-docker ." // <- Local docker image name
            }
        }

        stage('Push Image') {
            environment{
                DOCKER_HUB = credentials('docker-hub-credentials')
            }
            steps {
                bat 'docker login -u %DOCKER_HUB_USR% -p %DOCKER_HUB_PSW%'
                bat "docker push yehory/selenium-docker"  // <- docker-hub repository name
            }
        }
    }

    post {
        always {
            bat "docker logout"
        }
    }
}