package org.techtales.class_28_alertdialouge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import org.techtales.class_28_alertdialouge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.alert.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Delete Files")
            dialog.setMessage("Do you want to delete files?")
            dialog.setIcon(R.drawable.delete)

            dialog.setPositiveButton("YES"){dialogInterface, which->
                Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show()
            }

            dialog.setNegativeButton("NO"){dialogInterface, which->
                Toast.makeText(this, "Click No", Toast.LENGTH_SHORT).show()
            }

            dialog.setNeutralButton("CANCEL"){dialogInterface, which->
                Toast.makeText(this, "Click Cancel", Toast.LENGTH_SHORT).show()
            }

            val alertDialog:AlertDialog = dialog.create()
            alertDialog.setCancelable(false)
            alertDialog.show()



        }
    }
}