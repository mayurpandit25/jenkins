node {
        stage ('clone') {
             sh 'git clone   https://github.com/mayurpandit25/jenkins.git'
        }
        stage ('build') {
             echo 'build successful'
        }
        stage ('test') {
             echo 'test successful'
        }
        stage ('deploy') {
             echo 'deploy successful'
        }
                      
 }
