pipeline {
  agent any
  stages {
    stage('Example Build') {
      steps {
        script {
          def MyClass = load "src/MyClass.groovy"
          print "Result " + MyClass.testMethod()
        }
      }
    }
  }
}