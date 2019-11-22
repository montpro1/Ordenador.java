fun main() {
    println("Esto es una app")
    var ratonA=Raton()
    println(ratonA.tipo)
var ratonB=Raton("psaux")
    println(ratonB.tipo)
    ratonA.tipo="bluetooh"
    println(ratonA.tipo)
    var miComputadora=Computer("I5",Raton())
    println(miComputadora.cpu)
    println("${miComputadora.cpu} tiene un raton ${miComputadora.raton.tipo}")
    println(miComputadora.toString())
    var miComputadora1=Raton(tipo = "inalambrico")
    println(miComputadora1.tipo)
    var ratonSorpresa=Raton("ay")
    println(ratonSorpresa.tipo)
var miComp=Computer(cpu = ("i5"),raton = ("raton"))
    miComp.memoria=4000





}