def parameter_list = [
    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?'),
    text(name: 'BIOGRAPHY', defaultValue: '', description: 'Enter some information about the person'),
    booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value'),
    choice(name: 'CHOICE', choices: ['One', 'Two', 'Three'], description: 'Pick something'),
    password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password'),
    choice(name: 'LET_CHOICE', choices: ['A', 'B', 'C'], description: 'Pick something')
]
properties([
    parameters(parameter_list)
])

def utils

pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Example') {
            steps {
                script {
                    params.each { name, value ->
                        println "Name: $name -> Value: $value"
                    }
                }
                
                sh 'env'
                
                script {
                    def person = [name: 'Guillaume', age: 36]
                    utils = load 'utils.Groovy'
                    utils.prepare_build_enviroment(
                        label: 'Hello World',
                        str: """
                            line1 ${person.name}
                            line2 ${person.age}
                        """)
                }
                
                echo "Hello ${params.PERSON}"
                echo "Biography: ${params.BIOGRAPHY}"
                echo "Toggle: ${params.TOGGLE}"
                echo "Choice: ${params.CHOICE}"
                echo "Password: ${params.PASSWORD}"
            }
        }
    }
}