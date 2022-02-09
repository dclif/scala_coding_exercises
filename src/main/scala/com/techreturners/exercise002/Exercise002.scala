package com.techreturners.exercise002

class Exercise002 {

  def isFromManchester(person: Person): Boolean = person.city == "Manchester"



  //Person("Peter", "Smith", "Manchester", 23)

  def canWatchFilm(person: Person, ageLimit: Int ): Boolean = person.age > ageLimit

}