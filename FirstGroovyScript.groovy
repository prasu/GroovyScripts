
println("welcome to Groovy")

def enum DAYS{
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT,
    SUN
}

d = DAYS.MON..DAYS.WED

for( var in d ){
    println var
}

println("Extents: ----")
println d.from
println d.to