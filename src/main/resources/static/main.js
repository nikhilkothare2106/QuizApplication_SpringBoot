function startQuiz(quizType){
    localStorage.setItem("topic",quizType)
    window.location.href = `quiz.html`
}