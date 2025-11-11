node {
        stage ('pull') {
             sh 'git pull https://github.com/mayurpandit25/jenkins.git'
        }
        stage ('build') {
             echo 'build successfull'
        }
        stage ('test') {
             echo 'test successful'
        }
        stage ('deploy') {
             echo 'deploy successful'
        }
                      
 }
