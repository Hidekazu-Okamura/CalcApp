package jp.techacademy.hidekazu.okamura.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var ans: Double = 0.0
        val value1 = intent.getIntExtra("VALUE1", 0)
        val value2 = intent.getIntExtra("VALUE2", 0)
        val status = intent.getIntExtra("STATUS", 0)
        when ("$status") {
            1.toString() -> ans = value1.toDouble() + value2.toDouble()
            2.toString() -> ans = value1.toDouble() - value2.toDouble()
            3.toString() -> ans = value1.toDouble() * value2.toDouble()
            4.toString() -> ans = value1.toDouble() / value2.toDouble()
        }
        textView.text = ans.toString()


    }
}