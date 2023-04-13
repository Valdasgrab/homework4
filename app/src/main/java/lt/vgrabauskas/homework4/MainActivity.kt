package lt.vgrabauskas.homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var textView1: TextView
    lateinit var textView2: TextView
    lateinit var textView3: TextView
    lateinit var textView4: TextView
    lateinit var textView5: TextView
    lateinit var textView6: TextView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1 = findViewById(R.id.textview1)
        textView2 = findViewById(R.id.textview2)
        textView3 = findViewById(R.id.textview3)
        textView4 = findViewById(R.id.textview4)
        textView5 = findViewById(R.id.textview5)
        textView6 = findViewById(R.id.textview6)
        button = findViewById(R.id.clickbutton)

        button.setOnClickListener {
            diceRoll()
        }
    }

    private fun diceRoll() {
        var diceList = mutableListOf<Int>()
        var sum = 0
        for (index in 0..5) {
            diceList.add(index, (Random.nextInt(1,6)))
            sum += diceList[index]
        }
        textView1.text = diceList[0].toString()
        textView2.text = diceList[1].toString()
        textView3.text = diceList[2].toString()
        textView4.text = diceList[3].toString()
        textView5.text = diceList[4].toString()
        textView6.text = diceList[5].toString()
        button.text = sum.toString()
    }


}

