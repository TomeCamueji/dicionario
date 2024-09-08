package co.tiagoaguiar.tutorial.jokerappdev.Presenter

import android.os.Looper
import co.tiagoaguiar.tutorial.jokerappdev.model.Category
import co.tiagoaguiar.tutorial.jokerappdev.view.CategoryItem
import co.tiagoaguiar.tutorial.jokerappdev.view.HomeFragment

class HomePresenter(private val view: HomeFragment) {

    fun FindAllCategory() {
        view.showProgress()
        fakeRequest()

    }

    private fun onSucess(response: List<Category>) {
        val categories = response.map { CategoryItem(it) }

        view.showCategories(categories)
    }

    fun onComplete(){
        view.hideProgress()
    }

    private fun fakeRequest() {
        android.os.Handler(Looper.getMainLooper()).postDelayed({
            val response = arrayListOf(
                Category("Sabonete Cortado"),
                Category("Mbange") ,
                Category("Kamba"),
                Category("Madié"),
                Category("Nengue"),
                Category("Bardeia"),
                Category("Pausado"),
                Category("Banzelo"),
                Category("Babulo"),
                Category("Balo"),
                Category("Mboa"),
                Category("Mambo"),
                Category("Buluzento"),
                Category("Cunanga"),
                Category("Rafeiro"),
                Category("Panina"),
                Category("Sabonete Cortado"),
                Category("Mbange") ,
                Category("Kamba"),
                Category("Madié"),
                Category("Nengue"),
                Category("Bardeia"),
                Category("Pausado"),
                Category("Banzelo"),
                Category("Babulo"),
                Category("Balo"),
                Category("Mboa"),
                Category("Mambo"),
                Category("Buluzento"),
                Category("Cunanga"),
                Category("Rafeiro"),
                Category("Panina")
            )
            onSucess(response)
            onComplete()
        }, 4000)
    }
}