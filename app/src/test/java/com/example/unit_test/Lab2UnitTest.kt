package com.example.unit_test

import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class Lab2UnitTest {


    @Test
    fun megacharizardTurn_mewtwoEqualDamageAlive_returnFalse() {
        val result = Lab2Unit.megacharizardTurnAttackMewtwo(
                25,
                25,
                true
                )
        assertFalse(result)
    }
    @Test
    fun megacharizardTurn_mewtwoEqualDamageAlive_returnTrue() {
        val result = Lab2Unit.megacharizardTurnAttackMewtwo(
            25,
            25,
            false
        )
        assertTrue(result)
    }
    @Test
    fun megacharizardTurn_mewtwoAboveDamageDead_returnFalse() {
        val result = Lab2Unit.megacharizardTurnAttackMewtwo(
            50,
            25,
            false
        )
    assertFalse(result)
    }
    @Test
    fun megacharizardTurn_mewtwoAboveDamageAlive_returnFalse() {
        val result = Lab2Unit.megacharizardTurnAttackMewtwo(
            50,
            25,
            true
        )
        assertTrue(result)
    }
}