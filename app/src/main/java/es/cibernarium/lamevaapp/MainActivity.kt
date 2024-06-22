package es.cibernarium.lamevaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import es.cibernarium.lamevaapp.ui.theme.LaMevaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Invocarem una funció personalitzada
        estructuraMaps()
    }
}

//Aqui expliquem els mapes o diccionaris
private fun estructuraMaps() {
    var elMeuMapa: Map<String,Int> = mapOf()
    println(elMeuMapa)

    //Afegim valors
    //El fer un mapOf estem borrant l'estructura anterior i estem sobreescribint
    //elMeuMapa = mapOf("Oriol" to 8,"Sara" to 5,"Ricard" to 3)
    elMeuMapa = mutableMapOf("Oriol" to 8,"Sara" to 5,"Ricard" to 3) //Aixi és farem mutable
    println(elMeuMapa)

    //Si desitgem afegir sense borrar l'anterior
    elMeuMapa["Rosa"] = 6 //Donarà error ja que el map creat no es mutable o redimensionable
    //També es pot emprar
    elMeuMapa.put("Cristina",3)
    println(elMeuMapa)

    elMeuMapa.put("Cristina",7)
    println(elMeuMapa)

}