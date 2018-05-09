pipeline {
  agent {
    node {
      label 'master'
    }
    
  }
  stages {
    stage('test') {
      steps {
        sh 'gradle clean test'
      }
    }
    stage('build') {
      steps {
        echo 'build start'
        sh 'gradle build -x test'
      }
    }
    stage('show directory files') {
      steps {
        sh 'ls ./build/libs'
      }
    }
  }
}