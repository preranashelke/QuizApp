package com.example.quizapp



object Constants {
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_question"
    const val CORRECT_ANSWER:String="correct_answer"
    fun getQuestions():ArrayList<Question>{
        val questionsList=ArrayList<Question>()
        val que1 = Question(
            1, "What is the name of this sport ?",
            R.drawable.volleyball,
            "Volleyball", "Archery",
            "Rugby", "Football", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What is the name of this sport ?",
            R.drawable.tennis_1,
            "Tennis", "Badminton",
            "Archery", "Skating", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What is the name of this sport ?",
            R.drawable.swimming,
            "Archery", "Swimming",
            "Running", "Cricket", 2
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What is the name of this sport ?",
            R.drawable.running,
            "Running", "Throw Ball",
            "Archery", "None Of These", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What is the name of this sport ?",
            R.drawable.rugby,
            "Rugby", "Volleyball",
            "Swimming", "Football", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What is the name of this sport ?",
            R.drawable.football,
            "Rugby", "Archery",
            "Football", "none of these", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What is the name of this sport ?",
            R.drawable.cricket,
            "Cricket", "Baseball",
            "Football", "WeightLifting", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What is the name of this sport ?",
            R.drawable.baseball,
            "Volleyball", "Cricket",
            "Swimming", "Baseball", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What is the name of this sport ?",
            R.drawable.badminton,
            "Cricket", "Badminton",
            "Archery", "Tennis", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What is the name of this sport ?",
            R.drawable.archery1,
            "Football", "Cricket",
            "Archery", "Tennis", 3
        )

        questionsList.add(que10)

        return questionsList
    }
}