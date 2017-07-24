
Binding bind = new Binding()
bind.console = { String message ->
    println message
}
bind.file = { String filename , Closure c ->
    def outputFile = new File(filename)
    outputFile.withWriter { writer ->
        c.call writer
    }

}

GroovyShell shell = new GroovyShell(bind)
shell.evaluate(new File('fileSCript.groovy'))



