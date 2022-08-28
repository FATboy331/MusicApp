package com.geektech.musicapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.MenuView
import androidx.constraintlayout.helper.widget.Carousel
import androidx.recyclerview.widget.RecyclerView
import com.geektech.musicapp.databinding.FragmentMusicBinding
import com.geektech.musicapp.databinding.ItemMusicBinding

class MusicAdapter(
    val data: ArrayList<MusicData>,
    val onClick:()-> Unit
):
    RecyclerView.Adapter<MusicAdapter.MusicViewHolder>(){






    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
return MusicViewHolder(ItemMusicBinding.
inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
holder.bind()
    }

    override fun getItemCount(): Int = data.size

    inner class MusicViewHolder(private val binding:ItemMusicBinding) :
        RecyclerView.ViewHolder(binding.root){
        fun bind(){
            itemView.setOnClickListener {
                onClick()
            }
val item = data[adapterPosition]
binding.Numbers.text = item.numbers
binding.NameMusic.text = item.musicName
binding.ExecutorMusic.text = item.musicExecutor
binding.TimeMusic.text = item.musicTime

        }
    }

    }


