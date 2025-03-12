def buildjar(){
    echo "That is build state..."
    sh 'mvn package'
}
def buildimages(){
    echo "That is build image state...."
    withCredentials([usernamePassword(credentialsId: 'docker-my', usernameVariable: 'USR', passwordVariable: 'PSW')]) {
        
        sh 'docker build -t rony726f6e79/my-app:05 .'
        sh 'echo $PSW | docker login -u $USR --password-stdin'
        sh 'docker push rony726f6e79/my-app:05'
        }
}
def deply(){
    echo "That is deply state..."
}

return this
