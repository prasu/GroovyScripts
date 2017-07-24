def testSwitch(def val){
    def result
    switch (val){
        case [lang:'groovy',frame:'grails']:
            result = "$val"
            break
        case 0..9:
            result = "$val"
            break
        case ['eer',1,'pp']:
            result = "$val"
            break
        default:
            result = 'Default'
            break

    }
    result
}

println(testSwitch('lang'))
