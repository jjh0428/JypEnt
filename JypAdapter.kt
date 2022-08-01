package sungil.myjypent1

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.GlideContext
import sungil.myjypent1.databinding.RvItemJypBinding

class JypAdapter(
    val jypList: List<Jyp>
) : RecyclerView.Adapter<JypAdapter.ViewHolder>() {

    inner class ViewHolder(
        val binding: RvItemJypBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(jyp: Jyp) { // XML 파일과 data class 를 연결하는 부분
            Glide.with(binding.ivProfile.context)
                .load(jyp.imgUrl)
                .into(binding.ivProfile)
            binding.tvName.text = jyp.name
            binding.tvInfo.text = jyp.info

            binding.ivProfile.setOnClickListener {
//                Toast.makeText(context, "이미지클릭", Toast.LENGTH_SHORT).show()
                val jypIntent = Intent(binding.ivProfile.context, DetailActivity::class.java)
                binding.ivProfile.context.startActivity(jypIntent)
            }
            binding.tvName.setOnClickListener{
                jyp.name += "+"
                notifyDataSetChanged()
            }
            binding.tvInfo.setOnClickListener{
                jyp.info += "+"
                notifyItemChanged(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RvItemJypBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val jyp = jypList[position]
        holder.bind(jyp)
    }

    override fun getItemCount(): Int {
        return jypList.size
    }
}