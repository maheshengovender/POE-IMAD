import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    var textView25: TextView? = null
    var calculateButton: Button? = null
    var minTemperatures = intArrayOf(15, 20, 18, 17, 15)
    var maxTemperatures = intArrayOf(18, 25, 20, 19, 17)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        textView25 = findViewById<TextView>(R.id.textView21)
        calculateButton = findViewById<Button>(R.id.button6)
        calculateButton.setOnClickListener(View.OnClickListener {
            var totalMinTemperature = 0
            var totalMaxTemperature = 0
            val textView1 = findViewById<TextView>(R.id.textView22)
            val textView2 = findViewById<TextView>(R.id.textView20)
            val textView3 = findViewById<TextView>(R.id.textView16)
            val textView4 = findViewById<TextView>(R.id.textView4)
            val textView5 = findViewById<TextView>(R.id.textView5)
            val textView6 = findViewById<TextView>(R.id.textView6)
            val textView7 = findViewById<TextView>(R.id.textView7)


            val textView17 = findViewById<TextView>(R.id.textView21)
            val textView18 = findViewById<TextView>(R.id.textView24)
            val textView19 = findViewById<TextView>(R.id.textView25)

            val button = findViewById<Button>(R.id.button)




// this code will allow the user to exit the application
            val exitButton=findViewById<Button>(R.id.button)
            exitButton.setOnClickListener { finishAffinity()
            // Calculate total minimum and maximum temperatures
            for (i in minTemperatures.indices) {
                totalMinTemperature += minTemperatures[i]
                totalMaxTemperature += maxTemperatures[i]
            }

            // Calculate average temperatures
            val averageMinTemperature = totalMinTemperature / minTemperatures.size
            val averageMaxTemperature = totalMaxTemperature / maxTemperatures.size

            // Display average temperature in TextView 25
            val averageTemperature = (averageMinTemperature + averageMaxTemperature) / 2
            textView25.setText(averageTemperature.toString())
        })
    }
}