package com.marlena.paymentmanager.ui.payments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.marlena.paymentmanager.R

class PaymentsFragment : Fragment() {

    private lateinit var paymentsViewModel: PaymentsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        paymentsViewModel =
            ViewModelProviders.of(this).get(PaymentsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_payments, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        paymentsViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}