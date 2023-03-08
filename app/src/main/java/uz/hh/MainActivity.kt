package uz.hh

import adatpter.UserAdabter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import utillls.mydata
import uz.hh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    private lateinit var userAdabter:UserAdabter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        mydata.addVallue()

        userAdabter=UserAdabter(mydata.list)
        binding.iv1.adapter = userAdabter
    }
}