pipeline {
  agent {
    node {
      label 'master'
    }
    
  }
  stages {
    stage('test') {
      steps {
        sh 'gradlew clean test'
      }
    }
    stage('build') {
      steps {
        echo 'build start'
        sh 'gradlew build -x test'
      }
    }
    stage('show directory files') {
      steps {
        sh 'ls ./build/libs'
      }
    }
  }
}