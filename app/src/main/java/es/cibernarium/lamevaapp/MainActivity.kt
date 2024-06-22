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
        estructuraArrays()
    }
}

//Aqui expliquem els arrays
private fun estructuraArrays() {
    var alumne1 = "Oriol"
    val alumne2 = "Joana"
    val alumne3 = "Iria"
    val alumne4 = "Ramon"

    //Crearem el Array i tenim que designar de quin tipus de dada contindrà
    // i no podrán combinarse
    val aula: ArrayList<String> = arrayListOf<String>()
    //Afegir dades una a una
    aula.add(alumne1)
    aula.add(alumne2)
    aula.add(alumne3)
    aula.add(alumne4)
    println(aula)

    aula.addAll(listOf("Joan","Eva"))
    println(aula)

    //Accedir a dades
    println(aula[2])

    aula[2] = "Francesc"

    println(aula[2])
}