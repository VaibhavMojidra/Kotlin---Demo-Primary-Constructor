class Student(public val name: String,private val age: Int){
	fun printName(){
		println("Name: $name")
	}
	
	fun printAge(){
		println("Age: $age")
	}
}

class Teacher(val _name:String,val _age:Int){
	
	var name:String
	var age:Int
	
	init{
		name=_name
		age=_age
	}
	
	fun printName(){
		println("Name: $name")
	}
	
	fun printAge(){
		println("Age: $age")
	}
	
}


fun main(args: Array<String>) {
	var student1=Student("Vaibhav",23)
	//student1.age this will give error as its private
	student1.printName()
	student1.printAge()
	
	var teacher=Teacher("Dhanraj",40)
	teacher.printName()
	teacher.printAge()
}