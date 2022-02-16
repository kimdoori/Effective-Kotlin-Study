package com.toss.study.effectivekotlinstudy.item01

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Item01Test {

    @Test
    fun `총체적 난국 고치기`() {
        val serverDeveloperInToss = ServerDeveloperRepository().getServerDevelopers()

        //////////// 이 부분을 수정하진 마세요! ////////////
        serverDeveloperInToss[0].name = "김토스"
        /////////////////////////////////////////////

        serverDeveloperInToss[0].name shouldBe "김효진"
        serverDeveloperInToss[0].silo shouldBe "offline-tosspay"
        serverDeveloperInToss[1].name shouldBe "윤찬명"
        serverDeveloperInToss[1].silo shouldBe "offline-tosspay"
    }

    class ServerDeveloperRepository() {
        fun getServerDevelopers(): MutableList<Employee> {
            return mutableListOf(
                Employee("김효진", "offline-tosspay"),
                Employee("윤찬명", "offline-tosspay"),
            )
        }
    }

    data class Employee(
        var name: String,
        var silo: String
    )
}
