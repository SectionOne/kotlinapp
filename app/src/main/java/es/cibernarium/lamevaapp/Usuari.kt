package es.cibernarium.lamevaapp

class Usuari(val usuari:String,val clau:String,var rol:Rol, val equip: Array<Usuari>? = null) {

    //Mètode enumerat
    enum class Rol {
        PENDENT,
        ACTIU,
        ADMINISTRADOR,
        BLOQUEJAT
    }
    //Crearem Mètodes
    fun presentarse() {
        println("Sòc un usuari amb les credencials $usuari i $clau, amb un rol de $rol")
    }
}