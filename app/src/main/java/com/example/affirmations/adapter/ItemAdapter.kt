package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * This piece of code is half mystery to me. ask google what the heck is happening here.
 * I know what lines does what, but some objects and data structures is plain black magic on
 * how they work. I added comments from the guide just so I can feel like i know what i'm doing.
 */
class ItemAdapter(
    private val context: Context,
    private val dataset : List<Affirmation>
 ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /** Provide a reference to the views for each data item
    * Complex data items may need more than one view per item, and
    * you provide access to all the views for a data item in a view holder.
    * Each data item is just an Affirmation object.
    */
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount(): Int {
        return dataset.size
    }


}