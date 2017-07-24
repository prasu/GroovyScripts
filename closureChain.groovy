
def convert ={ new Expando(language:it)}
def uppercase = { it -> it.toUpperCase() }

def chain = convert << uppercase

def listValue = ['Groovy','Java'].collect(chain)

println(listValue[1].language)