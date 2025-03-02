package fpt.thienhdph47232.qrapp

import android.app.Application
import com.google.firebase.FirebaseApp

class MyApp : Application(){
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this) // chay firebase
    }
}