package tayeb.shahbakhsh.tamiratkif

import android.app.Application
import tayeb.shahbakhsh.tamiratkif.database.AppDatabase

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        val database= AppDatabase.getAppDataBase(this)
    }
}