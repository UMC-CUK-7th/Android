package com.example.udemy_practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.udemy_practice.databinding.FragmentDetailBinding
import com.example.udemy_practice.databinding.FragmentPannelBinding
import com.example.udemy_practice.databinding.FragmentSongBinding
import com.example.udemy_practice.databinding.FragmentVideoBinding

class VideoFragment : Fragment() {
    lateinit var binding: FragmentVideoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVideoBinding.inflate(inflater,container,false)

        return binding.root
    }



}