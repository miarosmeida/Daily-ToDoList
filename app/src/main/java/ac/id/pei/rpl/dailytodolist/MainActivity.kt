package ac.id.pei.rpl.dailytodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val date = findViewById<DatePicker>(R.id.datepick) as DatePicker
        val kalender : Calendar = Calendar.getInstance()
        date.init(kalender.get(Calendar.YEAR),kalender.get(Calendar.MONTH), kalender.get(Calendar.DAY_OF_MONTH),{view,year,monthOfYear,dayOfMonth->
            Toast.makeText(applicationContext,"("+date.dayOfMonth+"-"+(date.month+1)+"-"+date.year+")", Toast.LENGTH_SHORT).show()
        })
    }
}