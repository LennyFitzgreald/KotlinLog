package jp.techacademy.wakahara.koumei.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("太郎", 30, "犬")
        human1.say()
        human1.think()

        val human2 = Human("花子", 25, "猫")
        human2.say()
        human2.think()

    }
}