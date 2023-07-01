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
                sh 'docker version'
                sh 'mvn  -v'
            }
        }

        stage('compilation'){
            steps {
               sh 'echo "compilation"'

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