def gv
pipeline {

    agent any
    tools {
        maven 'maven-3.9'
    }
    stages{
        stage("int") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    gv.buildjar()
                }
            }
        }
        
        stage("build image") {
            steps {
                script {
                     gv.buildimages()

                }
            }
        }
        
        stage("deploy") {
            steps { 
                script {
                     gv.deply()

                }
            }
        }
    }

}
