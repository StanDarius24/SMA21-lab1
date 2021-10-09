package com.example.lab

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatDialogFragment

class PopUp(text: String): AppCompatDialogFragment() {

    var text: String? = text

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder = AlertDialog.Builder(activity)
        builder.setTitle("Information")
            .setMessage(text)
            .setPositiveButton("ok") { dialogInterface, i -> }
            .setNegativeButton("cancel") { dialogInterface, i -> }

        return builder.create()
    }

}