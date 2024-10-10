package com.seongeun.mission2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.seongeun.mission2.databinding.ActivityMainBinding

class MainFragment : Fragment() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override  fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View{
        _binding = ActivityMainBinding.inflate(inflater, container, false)
        return binding.root
    }

}