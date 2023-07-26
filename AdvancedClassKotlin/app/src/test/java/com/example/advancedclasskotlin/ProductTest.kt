package com.example.advancedclasskotlin

import org.junit.Assert.*
import org.junit.Test

class ProductTest {

    class ProductTest {

        @Test
        fun testSpaghettiProduct() {
            // Arrange
            val spaghetti = Product("Spaghetti", 20.00, 3)

            // Act
            spaghetti.applyDiscount(20)

            // Assert
            assertEquals(16.00, spaghetti.price, 0.01)
        }

        @Test
        fun testSteakProduct() {
            // Arrange
            val steak = Product("Steak", 30.00, 8)

            // Act - No discount applied

            // Assert
            assertEquals(30.00, steak.price, 0.01)
        }

        @Test
        fun testLasagnaProduct() {
            // Arrange
            val lasagna = Product("Lasagna", 10.00, 0)

            // Act - No discount applied

            // Assert
            assertEquals(10.00, lasagna.price, 0.01)
        }

    }
}
