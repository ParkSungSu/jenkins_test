pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh './gradlew clean build -x test'
      }
    }
    stage('test') {
      steps {
        sh './gradlew test'
      }
    }
    stage('remote shell test') {
      steps {
        sh '''/hello.sh
'''
      }
    }
    stage('testpss') {
      steps {
        slackSend 'jenkins test'
      }
    }
  }
}