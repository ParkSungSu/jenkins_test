pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        sh './gradlew clean test'
      }
    }
    stage('build') {
      steps {
        sh './gradlew clean build -x test'
      }
    }
    stage('shell test') {
      steps {
        sh 'ls -al'
      }
    }
  }
}