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
        variablesConstants()
    }
}

/*
Aqui fem una funció per parlar de variables
 */
private fun variablesConstants(){
    //Crearem una variable
    var nomAlumne = "Joan Perez"
    println(nomAlumne)

    //Sobreescribim el valor
    nomAlumne = "Patricia Sanchez"
    println(nomAlumne)

    nomAlumne = 23 //No és poden fer tipus diferents els declarats
}
