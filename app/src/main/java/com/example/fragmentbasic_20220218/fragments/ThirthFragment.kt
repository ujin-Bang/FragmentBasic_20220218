package com.example.fragmentbasic_20220218.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentbasic_20220218.R
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnSecondToast.setOnClickListener {
            Toast.makeText(requireContext(), "3번째 프래그먼트가 클릭됨", Toast.LENGTH_SHORT).show()
        }
    }

}