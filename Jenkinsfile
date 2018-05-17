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
        sh './gradlew clean test'
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
        slackSend(message: 'wtf? only english??')
      }
    }
  }
}