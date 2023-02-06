package com.example.scopedstoragesample

import android.app.Application
import android.content.Intent
import android.net.Uri
import android.os.Environment
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.lang.Exception

class ScopedViewModel(application: Application): AndroidViewModel(application) {

     fun saveToExternalStorage(data:String){
         try {
         val fileDir = getApplication<Application>().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS)
         fileDir?.let {
             var filePath:String = it.path
             filePath = filePath.plus(File.separator).plus("sample.txt")
             val file = File(filePath)
               val outSteam = FileOutputStream(file)
             outSteam.write(data.toByteArray())
             outSteam.close()
             return
             }
         }
         catch (e:Exception){
             e.printStackTrace()
         }

     }

    fun readFromExternalStorage():String{
        var data:String = ""
        try {
            val fileDir = getApplication<Application>().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS)
            fileDir?.let {
                var filePath:String = it.path
                filePath = filePath.plus(File.separator).plus("sample.txt")
                val file = File(filePath)
                val myInputStream = file.inputStream()
                val size: Int = myInputStream.available()
                val buffer = ByteArray(size)
                myInputStream.read(buffer)
                myInputStream.close()
                data = String(buffer)
                return file.path
            }
        }
        catch (e:Exception){
            e.printStackTrace()
        }
        return data;
    }



}