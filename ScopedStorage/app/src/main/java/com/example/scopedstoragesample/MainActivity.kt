package com.example.scopedstoragesample

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.content.FileProvider
import java.io.File


class MainActivity : ComponentActivity() {

    lateinit var viewModel: ScopedViewModel
    lateinit var txtFileContent:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtFileContent = findViewById(R.id.txtFileContent);

        viewModel = ScopedViewModel(application)
    }

    fun saveToExternalStorage(v:View){
        viewModel.saveToExternalStorage("Hello")
    }

    fun readFromExternalStorage(v:View){
       val data = viewModel.readFromExternalStorage()
        txtFileContent.text = data;

        val uris:ArrayList<Uri> = ArrayList(mutableListOf<Uri>())

        val provider = application.packageName + ".provider"
        val uri = FileProvider.getUriForFile(
            this@MainActivity,
            provider,
            File(data)
        )


        uris.add(uri)
        sendLogsViaEmail(uris)
    }

    fun sendLogsViaEmail(uris: ArrayList<Uri>) {
        try {
            val emailIntent = Intent(Intent.ACTION_SEND_MULTIPLE)
            emailIntent.type = "text/plain"
            emailIntent.putExtra(
                Intent.EXTRA_EMAIL,
                arrayOf<String>("krishjlk@gmail.com")
            )
            emailIntent.putExtra(
                Intent.EXTRA_SUBJECT,
                "Subject"
            )
            emailIntent.putExtra(Intent.EXTRA_TEXT, "")
            emailIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            emailIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            emailIntent.putExtra(Intent.EXTRA_STREAM, uris)
            startActivity(
                Intent.createChooser(
                    emailIntent,
                    "Picker"
                )
            )
        }
        catch (e: Exception){
            e.printStackTrace()
        }
    }
}

