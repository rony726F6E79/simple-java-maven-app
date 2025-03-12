pipeline {

    agent any
    tools {
        maven maven-3.9
    }
    stages{
        stage("build jar") {
            steps {
                script {
                    echo "That is build state..."
                    sh 'mvn package'
                }
            }
        }
        
        stage("build image") {
            steps {
                script {
                withCredentials([usernamePassword(credentialsId: 'docker-my', usernameVariable: 'USR', passwordVariable: 'PSW')]) {
                    echo "That is build image state...."
                    sh 'docker build -t rony726f6e79/my-app:05 .'
                    sh 'echo $PSW | docker login -u $USR --password-stdin'
                    sh 'docker push build -t rony726f6e79/my-app:05'
                }
                }
            }
        }
        
        stage("deploy") {
            steps { 
                echo 'deploy... stepsssssss......'
            }
        }
    }

}
