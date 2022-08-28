package com.geektech.musicapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.musicapp.databinding.FragmentMusicBinding

class MusicFragment : Fragment() {

    private lateinit var binding : FragmentMusicBinding
    private val data = arrayListOf<MusicData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicBinding.inflate(inflater,container,false)
        loadData()
        val adapter = MusicAdapter(data, this::onClick)
        binding.MusicRecycler.adapter = adapter
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }



    private fun onClick(){
val intent = Intent(context,SecondActivity::class.java)
        startActivity(intent)
    }



    private fun loadData() {
        data.add(MusicData("1","Bad","Mari Ferrari","2:40"))
        data.add(MusicData("2","Back In Black","AC/DC","4:15"))
        data.add(MusicData("3","Impossible","James Arthur","3:29"))
        data.add(MusicData("4","Выхода нет","Сплин","3:47"))
        data.add(MusicData("5","Sunset Lover","Petit Biscuit","3:58"))
        data.add(MusicData("6","Am I Wrong","Nico & Vinz","4:05"))
        data.add(MusicData("7","Centuries","Fall Out Boy","3:49"))
        data.add(MusicData("8","Океан","L'One feat. Фидель","3:58"))
        data.add(MusicData("9","Leave a Light On","Tom Walker","3:05"))
        data.add(MusicData("10","Seven Nation Army","The White Stripes","3:51"))
    }


}