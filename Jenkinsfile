//Write pipeline script
pipeline{
    //all process of CICD

    //Any proxy available can execute
    agent any

    //Define some environment information

    //Define the processing flow of the pipeline
    stages {
        //All stages of the pipeline

        stage('Env inspection'){
            steps {
                sh 'java -version'
                sh 'git --version'
                sh 'apt-get install docker'
                sh 'docker version'
                sh 'pwd && ls -alh'

            }
        }

        stage('compilation'){
            agent {
                docker { image 'maven:3-alpine'}
            }
            steps {
                sh 'pwd && ls -alh'
                sh 'mvn -v'
            }
        }

        stage('test'){
            steps {
                echo 'test'
            }
        }

        stage('package'){
            steps {
                 echo 'package'
            }
        }

        stage('deploy'){
            steps {
                 echo "deploy"
            }
        }
    }
}