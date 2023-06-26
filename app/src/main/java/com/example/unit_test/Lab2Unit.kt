package com.example.unit_test


object Lab2Unit {

    fun megacharizardTurnAttackMewtwo(
        mewtwoHealth : Int,
        megacharizardDamage : Int,
        mewtwoState : Boolean
    ): Boolean {
        return if (mewtwoHealth <= megacharizardDamage && !mewtwoState) {
            true
        } else if (mewtwoHealth > megacharizardDamage && mewtwoState) {
            true
        } else {
            false
        }

    }

}