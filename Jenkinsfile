pipeline {
  agent {
    node {
      label 'master'
    }
    
  }
  stages {
    stage('test') {
      steps {
        sh 'ls'
      }
    }
    stage('done') {
      steps {
        echo 'hi'
      }
    }
  }
}