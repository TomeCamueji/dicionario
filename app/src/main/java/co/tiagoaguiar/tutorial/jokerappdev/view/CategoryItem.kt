package co.tiagoaguiar.tutorial.jokerappdev.view

import android.view.View
import android.widget.TextView
import co.tiagoaguiar.tutorial.jokerappdev.R
import co.tiagoaguiar.tutorial.jokerappdev.model.Category
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item

class CategoryItem(private val category: Category): Item<CategoryItem.CategoryViewHolder>() {

   class CategoryViewHolder(view: View): GroupieViewHolder(view)

   override fun bind(p0: CategoryViewHolder, p1: Int) {
      p0.itemView.findViewById<TextView>(R.id.txt_category).text = category.word
   }

   override fun getLayout(): Int {
      return R.layout.item_category
   }

   override fun createViewHolder(itemView: View): CategoryViewHolder {
      return CategoryViewHolder(itemView)
   }
}