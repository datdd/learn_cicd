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
        libraryResource(resource: 'utils.Groovy', encoding: 'UTF-8')
        load 'utils.Groovy'
      }
    }

  }
  environment {
    VAR_1 = '1'
    VAR_2 = '2'
  }
}