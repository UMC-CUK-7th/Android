package com.seongeun.mission2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.seongeun.mission2.databinding.FragmentCategoryBinding
import com.seongeun.mission2.databinding.ActivityMainBinding

class CategoryFragment : Fragment() {
    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!

    override  fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View{
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

}