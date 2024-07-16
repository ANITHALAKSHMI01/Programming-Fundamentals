package com.chainsys.stremdemo;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
public class TestOfStream 
{
	public static void main(String[] args) 
	{
		Student student1=new Student("Anitha",22,new Address("1234"),Arrays.asList(new MobileNumber("3333"),new MobileNumber("1234")));
		Student student2 =new Student("Khavya",20,  new Address("1235"), Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));
		Student student3 = new Student("Gladson",20,new Address("1236"),Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));
		List<Student> students=Arrays.asList(student1,student2,student3);
		
		Optional<Student> stud=students.stream().filter(student -> student.getName().equals("Kavi")).findFirst();
		System.out.println(stud.isPresent()?stud.get().getName():"No Student Found");
		System.out.println();
		
		Optional<Student> stud1=students.stream().filter(student ->student.getAddress().getZipcode().equals("1235")).findFirst();
		System.out.println(stud1.isPresent() ? stud1.get().getName():"No Student Found");
		System.out.println();
		
		List<Student> stud2=students.stream().filter(student -> student.getMobileNumbers().stream().anyMatch(x ->Objects.equals(x.getNumber(), "3333"))).collect(Collectors.toList());
		String result=stud2.stream().map(student -> student.getName()).collect(Collectors.joining(",", "[","]"));
		System.out.println(result);
		System.out.println();
		
		List<Student> stud3=students.stream().filter(student -> student.getMobileNumbers().stream().allMatch(x->Objects.equals(x.getNumber(), "1111") || Objects.equals(x.getNumber(), "1234"))).collect(Collectors.toList());
		String result1=stud3.stream().map(student -> student.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(result1);
		System.out.println();
		
		TempStudent tempStud1=new TempStudent("Jansi",23,new Address("3424"),Arrays.asList(new MobileNumber("7869"),new MobileNumber("8907")));
		TempStudent tempStud2=new TempStudent("Elakkiya",28,new Address("4123"),Arrays.asList(new MobileNumber("6989"),new MobileNumber("6543"),new MobileNumber("1234")));
		List<TempStudent> tempStudents=Arrays.asList(tempStud1,tempStud2);
		
		List<Student> stud4=tempStudents.stream().map(tempStud -> new Student(tempStud.name,tempStud.age,tempStud.address,tempStud.mobileNumbers)).collect(Collectors.toList());
		System.out.println(stud4);
		System.out.println();
		
		List<String> studentName=stud4.stream().map(Student::getName).collect(Collectors.toList());
		System.out.println(studentName);
		System.out.println(studentName.stream().collect(Collectors.joining(",")));
		System.out.println(studentName.stream().collect(Collectors.joining(",","[","]")));
		System.out.println();
		
		String name=stud4.stream().map(Student::getName).collect(Collectors.joining(","));
		System.out.println(name);
		System.out.println();
		
		List<String> names= Arrays.asList("Jan","Kayal","Dilan","Ram","Rakshana");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
