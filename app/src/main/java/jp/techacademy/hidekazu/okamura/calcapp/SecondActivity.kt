package jp.techacademy.hidekazu.okamura.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var ans: Double = 0.0
        val value1 = intent.getStringExtra("VALUE1")
        val value2 = intent.getStringExtra("VALUE2")
        val status = intent.getIntExtra("STATUS", 0)
        Log.d("kotlintest", value1.toString())
        Log.d("kotlintest", value2.toString())
        when ("$status") {
            1.toString() -> ans = value1.toDouble() + value2.toDouble()
            2.toString() -> ans = value1.toDouble() - value2.toDouble()
            3.toString() -> ans = value1.toDouble() * value2.toDouble()
            4.toString() -> ans = value1.toDouble() / value2.toDouble()
        }
        textView.text = ans.toString()


    }
}