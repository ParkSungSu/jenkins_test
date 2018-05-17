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
        slackSend(message: '한국어도 되는지 테스트 좀 해볼게요.')
      }
    }
  }
}