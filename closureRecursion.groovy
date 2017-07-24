
def closure = { it , res=[] ->
    if( it .length() == 0){
        return
    }else{
        res = res.collect({k = it.substring(1)})
        println(res)
        trampoline(it.substring(1),res)
    }

}.trampoline()


closure("usarp")