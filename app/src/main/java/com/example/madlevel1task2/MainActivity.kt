package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding
import com.example.madlevel1task2.databinding.ActivityMainBinding.inflate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Sets the activity layout resource file.


        binding.button.setOnClickListener {
            checkAnswer()
        }
    }

    private fun checkAnswer() {
      val answer1 =  binding.TTVeld.text.toString()
        val answer2 =  binding.TFVeld.text.toString()
       val answer3 =binding.FTVeld.text.toString()
        val answer4 =binding.FFVeld.text.toString()

        var aantCorrect =  0

        if (answer1 == "T") {
            aantCorrect += 1
        }
        if (answer2 == "F") {
            aantCorrect += 1
        }
        if (answer3 == "F") {
            aantCorrect += 1
        }
        if (answer4 == "F") {
            aantCorrect += 1
        }
        Toast.makeText(this, getString(R.string.Correct, aantCorrect), Toast.LENGTH_LONG).show()
       
    }
}
