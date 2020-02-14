package mx.edu.ittepic.ladm_u1_practica2_ricardovilla

import android.content.Context
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.io.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TAMBIEN SE PONE EN EL MANIFEST
        if (ContextCompat.checkSelfPermission(this,android.Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED){

            //PERMISO NO CONCEDIDO, ENTONCES SE SOLICITA
            ActivityCompat.requestPermissions(this,arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE,android.Manifest.permission.READ_EXTERNAL_STORAGE),0)
        }
        else{
            mensaje("LOS PERMISOS YA FUERON OTORGADOS")
        }

        button.setOnClickListener {
            if(radioButton.isChecked){

                guardarArchivoInterno()
            }
            else{
                guardarAchivoSD()
            }
        }

        button2.setOnClickListener {
            if (radioButton.isChecked){

                leerArchivoInterno()

            }
            else{
                leerArchivoSD()
            }
        }
    }



    private fun guardarArchivoInterno(){

        if(editText2.text.isEmpty()){
            mensaje("DEBES PONERLE UN NOMBRE AL ARCHIVO")
            return
        }
        try {
            var archivo = editText2.text.toString()+".txt"
            var flujoSalida = OutputStreamWriter(openFileOutput(archivo, Context.MODE_PRIVATE))
            var data = editText.text.toString()


            flujoSalida.write(data)
            flujoSalida.flush()
            flujoSalida.close()
            mensaje("¡EL ARCHIVO FUE CREADO CON ÉXITO!")
            editText.setText("")
            editText2.setText("")
        }catch (error: IOException){
            mensaje(error.message.toString())
        }
    }

    fun leerArchivoInterno(){
        if(editText2.text.isEmpty()){
            mensaje("DEBES PONERLE UN NOMBRE AL ARCHIVO")
            return
        }
        try {

            var archivo = editText2.text.toString()+".txt"
            var flujoEntrada = BufferedReader(InputStreamReader(openFileInput(archivo)))
            var data = flujoEntrada.readLine()

            // var vector = data.split("&")
             editText.setText(data.toString())



        }catch (error: IOException){
            mensaje(error.message.toString())
        }
    }

    fun mensaje (m: String){
        AlertDialog.Builder(this).setTitle("ATENCION")
            .setMessage(m)
            .setPositiveButton("ACEPTAR"){d,i->}
            .show()
    }

    fun guardarAchivoSD(){

        if (noSD()){
            mensaje("NO HAY MEMORIA EXTERNA")
            return
        }
        if(editText2.text.isEmpty()){
            mensaje("DEBES PONERLE UN NOMBRE AL ARCHIVO")
            return
        }
        try {
            var archivo = editText2.text.toString()+".txt"
            var rutaSD = Environment.getExternalStorageDirectory()
            var datosArchivo = File(rutaSD.absolutePath,archivo)
            var flujoSalida = OutputStreamWriter(FileOutputStream(datosArchivo))
            var data = editText.text.toString()
            flujoSalida.write(data)
            flujoSalida.flush()
            flujoSalida.close()
            mensaje("¡EL ARCHIVO FUE CREADO CON ÉXITO!")


        }catch (error: IOException){
            mensaje(error.message.toString())
        }
    }

    fun leerArchivoSD(){
        if (noSD()){
            mensaje("NO HAY MEMORIA EXTERNA")
            return
        }
        if(editText2.text.isEmpty()){
            mensaje("DEBES PONERLE UN NOMBRE AL ARCHIVO")
            return
        }
        try {
            var archivo = editText2.text.toString()+".txt"
            var rutaSD = Environment.getExternalStorageDirectory()
            var datosArchivo = File(rutaSD.absolutePath,archivo)
            var flujoEntrada = BufferedReader(InputStreamReader(FileInputStream(datosArchivo)))
            var data = flujoEntrada.readLine()
            editText.setText(data.toString())




        }catch (error: IOException){
            mensaje(error.message.toString())
        }

    }


    fun noSD():Boolean{
        var estado = Environment.getExternalStorageState()

        if (estado != Environment.MEDIA_MOUNTED){
            return true

        }
        return false
    }

}
