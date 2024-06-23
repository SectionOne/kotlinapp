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
        crearUsuari()
    }
}

//Aqui expliquem com definir una funció
private fun crearUsuari() {
    val nouUsuari = Usuari("admin", "1234", Usuari.Rol.ADMINISTRADOR)
    val nouUsuari1 = Usuari("Rosa", "1234", Usuari.Rol.ACTIU)
    println(nouUsuari.usuari)
    nouUsuari.rol = Usuari.Rol.BLOQUEJAT;
    println(nouUsuari.rol)
    //nouUsuari.clau = "4321" Aquest parametre no es podria modificar al ser let
    nouUsuari.presentarse()
    nouUsuari1.presentarse()
}