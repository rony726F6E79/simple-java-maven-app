pipeline {
  agent any
  environment {
    MY_NAME = 'Roni'
  }
  
  stages {
    stage("debug") {
      steps {
        script {
          echo "Current branch: ${env.BRANCH_NAME}"
        }
      }
    }
    
    stage("build") {
      when {
        expression {
          echo "Checking condition: MY_NAME=${env.MY_NAME}, BRANCH_NAME=${env.BRANCH_NAME}"
          return env.MY_NAME == 'Roni' && env.BRANCH_NAME == 'master'
        }
      }
      steps {
        echo 'build... stepsssssss......'
      }
    }
    
    stage("test") {
      steps {
        script {
          withCredentials([usernamePassword(credentialsId: 'rony-git', usernameVariable: 'MY_GIT_USR', passwordVariable: 'MY_GIT_PSW')]) {
            echo "my git user name: ${MY_GIT_USR}"
            echo "my git user pass: ${MY_GIT_PSW}"
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
  
  post {
    always {
      echo 'always done ...........'
    }
    success {
      echo 'success done ...........'
    }
    failure {
      echo 'failure done ...........'
    }
  }
}
