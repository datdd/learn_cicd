def prepare_build_enviroment() {
    println("Parameters")

    params.each { name, value ->
        println "Name: $name -> Value: $value"
    }

    println("END!")
}

return this