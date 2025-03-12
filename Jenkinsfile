pipeline {
  agent any
  environment{
    MY_NAME = 'Roni'
    MY_GIT = credentials('rony-git')   
  }
  stages {
    stage("build") {
      when {
        expression {
          MY_NAME == 'rony' && BRANCH_NAME=='master'
        }
      }
      steps {
        echo 'build... stepsssssss......'
      }
    }
    stage("test") {
      steps {
        echo "my git user name ${MY_GIT_USR}"
        echo "my git user pass ${MY_GIT_PSW}"
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
