
String[] array = ['Raj','Prasu','Mannu']
def s = '''
       **Groovy
       **Grails
       **Griffon
'''

def name='prasu'
def location='jersey'

s= "Hello ${name} You are in ${location} welcome"


//map activities
def mapWithDefaults = [start:'one'].withDefault {key ->
    key.isNumber() ? 33 : 'Hello'

}

def m1 =[lang:'Groovy',framework:'Grails']
def m2 = [lang:'Java',framework:'Grails']

def reversed= [:]
m1.reverseEach {key,value ->
    reversed [key]= value
}


//list activities
def list = [1,2,3,4,5]


println("head and tail of array")
println(array.head())
println(array.tail())

println("\n list to String")
println(list.toListString())


println("\n replace specific characters")
println('Groovy'.tr('Gro','6'))

println("\n replace marginal characters")
println(s.stripMargin("*"))

println("\n gstring examples")
println(s.getValues()+ ' '+ s.getStrings()+' '+s)


println("\n map activities")
println(mapWithDefaults.start +' '+mapWithDefaults['1']+' '+mapWithDefaults['tell']+ mapWithDefaults)
print(m1.intersect(m2))
println(reversed)