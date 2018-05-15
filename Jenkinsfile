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
    stage('remote shell test') {
      steps {
        sh '''/hello.sh
whoami
'''
      }
    }
  }
  environment {
    sendyUrl = 'ec2-13-209-0-21.ap-northeast-2.compute.amazonaws.com'
  }
}