package jp.techacademy.hidekazu.okamura.calcapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        //editText1.setOnClickListener(this)
    }
    @SuppressLint("SetTextI18n")
    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        try {
            intent.putExtra("VALUE1", Integer.parseInt(editText1.text.toString()))
            intent.putExtra("VALUE2", Integer.parseInt(editText2.text.toString()))
            when(v.id){
                R.id.button1 -> intent.putExtra("STATUS", 1)
                R.id.button2 -> intent.putExtra("STATUS", 2)
                R.id.button3 -> intent.putExtra("STATUS", 3)
                R.id.button4 -> intent.putExtra("STATUS", 4)
            }
            startActivity(intent)
        } catch (e : Exception) {
        } finally {
            if (editText1.text.toString()=="") {
                //editText2.text = "何か数値を入力してください"
            }
            if (editText2.text.toString()=="") {
                //editText2.text = "何か数値を入力してください"
            }
        }
    }
}