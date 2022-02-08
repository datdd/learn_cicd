pipeline {
  agent any
  stages {
    stage('Example') {
      steps {
        echo "Hello ${params.PERSON}"
        echo "Biography: ${params.BIOGRAPHY}"
        echo "Toggle: ${params.TOGGLE}"
        echo "Choice: ${params.CHOICE}"
        echo "Password: ${params.PASSWORD}"
      }
    }

  }
  environment {
    VAR_1 = '1'
    VAR_2 = '2'
  }
}