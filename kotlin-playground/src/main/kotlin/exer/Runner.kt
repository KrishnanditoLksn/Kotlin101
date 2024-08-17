package org.example.exer

fun main() {
    val event1 =
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 =
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

    val events = mutableListOf(event1, event2, event3, event4, event5, event6)


    val lessThanSixty = events.filter {
        it.durationInMinutes < 60
    }


    val morningEventsCount = events.groupBy {
        it.daypart
    }

    morningEventsCount.forEach { (daypart) ->
        println("$daypart: ${events.size} events")
    }

    /*   lessThanSixty.forEach {
           println("${it.title} - ${it.description} - ${it.daypart} - ${it.durationInMinutes}")
       }
   */
    println("Last event of the day: ${events[events.size - 1].title}")


    val durationOfEvent = if (events[0].durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

    println("Last event of the day: ${events.last().title}")

}