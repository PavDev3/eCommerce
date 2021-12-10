package dev.pablo.recyclerview.presentation.product_list

import androidx.lifecycle.ViewModel
import dev.pablo.recyclerview.data.Product
import dev.pablo.recyclerview.data.getProducts
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ProductListViewModel: ViewModel() {

    private var _productList = MutableStateFlow<List<Product>>(emptyList())
    val productList: StateFlow<List<Product>> = _productList

    init {
        _productList.value = getProducts()
    }
}