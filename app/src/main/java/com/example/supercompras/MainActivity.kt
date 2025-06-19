package com.example.supercompras

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.supercompras.ui.theme.SuperComprasTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.vector.ImageVector

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperComprasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                  Titulo(modifier = Modifier.padding(innerPadding))
                    ImagemTopo(modifier = Modifier.padding(innerPadding))
                    Icone(
                        modifier = Modifier.padding(innerPadding),
                        icone = Icons.Default.Delete
                    )

                }
            }
        }
    }
}

@Composable
fun Titulo(modifier: Modifier = Modifier) {
    Text (text = "Lista de Compras", modifier = modifier)
}

@Composable
fun ImagemTopo(modifier: Modifier = Modifier) {
    Image(painter = painterResource(R.drawable.image_topo),
        contentDescription = null,
        modifier = modifier.size(width = 600.dp, height = 360.dp))
    
}

@Composable
fun Icone(icone: ImageVector, modifier: Modifier = Modifier) {
    Icon(icone, contentDescription = "Editar", modifier = modifier)
}

@Preview
@Composable
private fun IconEditPreview() {
    SuperComprasTheme {
        Icone(icone = Icons.Default.Delete)
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello Fabio Medeiros",
        modifier = modifier
    )
}

@Preview
@Composable
private fun ImagemTopoPreview() {
    SuperComprasTheme { ImagemTopo() }
}

@Preview
@Composable
private fun TituloPreview() {
    SuperComprasTheme {
        Titulo()
    }
    
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SuperComprasTheme {
        Greeting("Android")
    }
}