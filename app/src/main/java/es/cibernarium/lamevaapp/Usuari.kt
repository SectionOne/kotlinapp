package es.cibernarium.lamevaapp

class Usuari(val usuari:String,val clau:String,var rol:Int) {

    //Crearem Mètodes
    fun presentarse() {
        println("Sòc un usuari amb les credencials $usuari i $clau, amb un rol de $rol")
    }
}