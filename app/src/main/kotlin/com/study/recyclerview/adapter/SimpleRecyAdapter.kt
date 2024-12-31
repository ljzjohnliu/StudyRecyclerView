package com.study.recyclerview.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.study.recyclerview.R
import com.study.recyclerview.bean.RecyConstantsBean

class SimpleRecyAdapter(val someData: List<RecyConstantsBean>) :
    RecyclerView.Adapter<SimpleRecyAdapter.SomeViewHolder>() {
    //适配器传入一个集合 集合的类型是 RecyConstantsBean
    var itemClickListener: ListItemClickListener? = null

    class SomeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //获取子条目的布局控件ID
        val mImgRecyItem: ImageView
        val mTxtRecyItem: TextView

        init {
            mImgRecyItem = view.findViewById(R.id.img_recy_item)
            mTxtRecyItem = view.findViewById(R.id.txt_recy_item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SomeViewHolder {
        //设置RecyclerView 子条目的布局
        val someView = LayoutInflater.from(parent.context).inflate(R.layout.item_simple_recy, null)
        return SomeViewHolder(someView)
    }

    override fun onBindViewHolder(holder: SimpleRecyAdapter.SomeViewHolder, position: Int) {
        //这里给子条目控件设置图片跟文字
        holder.mImgRecyItem.setImageResource(someData[position].titlePic)
        holder.mTxtRecyItem.text = someData[position].title
        Log.d("TAG", "onBindViewHolder: ---------------")

        holder.mImgRecyItem.setOnClickListener {
            //当点击子条目图片的时候出发接口回调
            itemClickListener?.invoke(position)
        }

    }
    override fun getItemCount(): Int {
        //这里控制条目要显示多少
        return someData.size
    }

}

typealias ListItemClickListener = (Int) -> Unit //设置item控件的点击事件