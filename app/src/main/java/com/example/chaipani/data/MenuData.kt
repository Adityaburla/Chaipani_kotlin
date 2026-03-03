package com.example.chaipani.data

data class MenuItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val category: String,
    val imageUrl: String = ""
)

object MenuRepository {
    val items = listOf(
        MenuItem(1, "Masala Chai", "Traditional Indian tea with spices", 2.50, "Tea"),
        MenuItem(2, "Ginger Chai", "Refreshing tea with fresh ginger", 2.00, "Tea"),
        MenuItem(3, "Espresso", "Strong and bold coffee shot", 3.00, "Coffee"),
        MenuItem(4, "Cappuccino", "Smooth coffee with foamy milk", 4.50, "Coffee"),
        MenuItem(5, "Green Tea", "Healthy and light green tea", 2.50, "Tea"),
        MenuItem(6, "Samosa", "Crispy pastry with spicy potato filling", 1.50, "Snacks"),
        MenuItem(7, "Paneer Pakora", "Deep fried cottage cheese fritters", 3.50, "Snacks"),
        MenuItem(8, "Iced Latte", "Cold coffee with milk and ice", 4.00, "Coffee")
    )

    fun getCategories() = listOf("All", "Tea", "Coffee", "Snacks")
}
