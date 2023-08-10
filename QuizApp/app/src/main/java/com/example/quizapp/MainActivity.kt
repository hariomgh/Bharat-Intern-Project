package com.example.quizapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnExit.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you sure!")
            builder1.setMessage("Do you really want to close the app")
            builder1.setIcon(R.drawable.ic_baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                // what action should be performed when it is clicked yes
                finish()
            })
            builder1.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                // what action should be performed when it is clicked no
            })
            builder1.show()
        }

        binding.qN1.setOnClickListener {
            val options = arrayOf(" finish()", "system.exit().", "stopSelf() and stopService()")
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("How to stop the services in android?")
            builder1.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                // what action should be performed when user clicks on any option
                Toast.makeText(this, "you choose ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when submit is clicked ?
            })
            builder1.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when submit is clicked ?
            })
            builder1.show()
        }

        binding.qN2.setOnClickListener {
            val options = arrayOf(" Android is a stack of software's for mobility", " Google mobile device name", " Virtual machine")

            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What is Android?")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when Yes is clicked ?
            })
            builder2.show()
        }

        binding.qN3.setOnClickListener {
            val options = arrayOf(" Collection of views and other child views", " Base class of building blocks", " Layouts")

            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What is android view group?")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when Yes is clicked ?
            })
            builder2.show()
        }


        binding.qN4.setOnClickListener {
            val options = arrayOf("Using intent()", "Using getContext() in onCreate()", "A and B both")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("How to access the context in android content provider?")
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                // what action should be performed when user clicks on any option
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when Yes is clicked ?
            })
            builder2.show()
        }

        binding.qN5.setOnClickListener {
            val options = arrayOf("Using with tool, we can redraw images in 9 sections.", "image extension tool", "image editable tool")

            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What is the 9 patch tool in android?")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when Yes is clicked ?
            })
            builder2.show()
        }


        binding.qN1.setOnClickListener {
            val options = arrayOf(" finish()", "system.exit().", "stopSelf() and stopService()")
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("How to stop the services in android?")
            builder1.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                // what action should be performed when user clicks on any option
                Toast.makeText(this, "you choose ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when submit is clicked ?
            })
            builder1.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when submit is clicked ?
            })
            builder1.show()
        }

        binding.qN2.setOnClickListener {
            val options = arrayOf(" Android is a stack of software's for mobility", " Google mobile device name", " Virtual machine")

            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What is Android?")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when Yes is clicked ?
            })
            builder2.show()
        }

        binding.qN3.setOnClickListener {
            val options = arrayOf(" Collection of views and other child views", " Base class of building blocks", " Layouts")

            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What is android view group?")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when Yes is clicked ?
            })
            builder2.show()
        }


        binding.qN4.setOnClickListener {
            val options = arrayOf("Using intent()", "Using getContext() in onCreate()", "A and B both")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("How to access the context in android content provider?")
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                // what action should be performed when user clicks on any option
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when Yes is clicked ?
            })
            builder2.show()
        }

        binding.qN5.setOnClickListener {
            val options = arrayOf("Using with tool, we can redraw images in 9 sections.", "image extension tool", "image editable tool")

            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What is the 9 patch tool in android?")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when Yes is clicked ?
            })
            builder2.show()
        }

        binding.qN6.setOnClickListener {
            val options = arrayOf("Base Adapter is a common class for any adapter, which can we use for both ListView and spinner", " A kind of adapter", "none of the above")

            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What is a base adapter in android?")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when Yes is clicked ?
            })
            builder2.show()
        }
        binding.qN7.setOnClickListener {
            val options = arrayOf("Connection management", "Cookies management and Authentication management", "both")

            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What are the functionalities of HTTP Client interface in android?")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when Yes is clicked ?
            })
            builder2.show()
        }
        binding.qN8.setOnClickListener {
            val options = arrayOf("Using with tool, we can redraw images in 9 sections.", "image extension tool", "image editable tool")

            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What is the 9 patch tool in android?")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when Yes is clicked ?
            })
            builder2.show()
        }
        binding.qN9.setOnClickListener {
            val options = arrayOf("good ", "average", "best")

            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("how was this app")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when Yes is clicked ?
            })
            builder2.show()
        }
        binding.qN10.setOnClickListener {
            val options = arrayOf("linked in", "twitter", "other")

            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("which social media brought you here")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // WHat action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                //  WHat action should be performed when Yes is clicked ?
            })
            builder2.show()
        }

    }
}