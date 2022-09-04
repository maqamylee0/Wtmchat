package com.tech4dev.wmtchat

import com.tech4dev.model.Message
import com.tech4dev.model.User

class SampleData {
    val LIST_OF_FRIENDS: List<User> = listOf(
        User("James Paul", "Hi i am alive"),
        User("Joan Okereke", "Hey i am using whatsapp"),
        User("Miracle Ebere", "Programming vibes"),
        User("Fadwa Fuad", "I love coding"),
        User("Ruth Okeniyi", "Hey i am using whatsapp"),
    )
}

class SampleMessages{
    val LIST_OF_MESSAGES: List<Message> = listOf(

        Message("Joan Okereke", "19:00", "I need to get my book"),
        Message("Emelda Joe", "07:00", "Hello, hope you are okay"),
        Message("Mr. Atimi", "09:00", "Ther will be class"),
        Message("Job Man", "17:00", "Come for the interview")
    )
}