package com.example.demo.jpa;

import com.example.demo.jpa.entity.Student;
import com.example.demo.jpa.entity.Teacher;
import com.example.demo.jpa.repository.ClassRepository;
import com.example.demo.jpa.repository.StudentRepository;
import com.example.demo.jpa.repository.SubjectRepository;
import com.example.demo.jpa.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Configuration
public class TestareDataBase {


    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private TeacherRepository teacherRepository;



   /* @Scheduled(fixedDelay = 1000 * 60)
    public void testDataBase() {
        List<Student> studentList = studentRepository.findAll();
        studentList.forEach(student -> System.out.println(student.getName() + " " + student.getLastName()));
    }*/

    /*@Scheduled(fixedDelay = 1000 * 60 * 10)
    public void queryImplementation() {
        List<Student> queryStudentList = studentRepository.findAll();
        System.out.println(queryStudentList);
        List<Student> queryStudentListByFirstNameAndLastName = studentRepository.findByNameAndLastName("Alan", "Smith");
        System.out.println(queryStudentListByFirstNameAndLastName);

    }*/

    //toti studentii dintr o clasa
    //toti profesorri care predau matematica
    //cat studenti sunt in clasa x
    //gasiti studenti dupa data nasterii
    //gasit studentii care sunt nascuti intre data1 si data2
    //gasiti cel mai tanar student
    // cel mai bine platit profesor
    //media salariala a profesorilor
    /*@Scheduled(fixedDelay = 1000 * 60 * 10)
    public void findStudentsFromClass() {
        System.out.println("Dati clasa de interes: ");
        Scanner keyboard = new Scanner(System.in);
        String className = keyboard.nextLine();   // 5A

        Class studentClass = classRepository.findByName(className);
        List<Student> students = studentRepository.findAllByClassId(studentClass.getId());
        students.forEach(System.out::println);

    }*/
    /*@Scheduled(fixedDelay = 1000 * 60 * 10)
    public void findTeachersOfMathematics() {

        Subject subject = subjectRepository.findSubjectBySubjectName("Matematica");
        List<Teacher> teachers = teacherRepository.findAllBySubjectId(subject.getId());
        teachers.forEach(System.out::println);

    }*/

    /*@Scheduled(fixedDelay = 1000 * 60 * 10)
    public void findStudentsNumberInASpecificClass() {

        Class studentClass = classRepository.findByName("12 B");
        Integer numberOfStudents = studentRepository.findAllByClassId(studentClass.getId()).size();
        System.out.println(numberOfStudents);

    }
*/
    /*@Scheduled(fixedDelay = 1000 * 60 * 10)
    public void findStudentsByDateOfBirth() {

        LocalDate date = LocalDate.of(1977, 10, 28);
        List<Student> students  = studentRepository.findAllByDateOfBirth(date);
        students.forEach(System.out::println);

    }*/

    /*@Scheduled(fixedDelay = 1000 * 60 * 10)
    public void findStudentsBetweenTwoDates() {

        LocalDate date1 = LocalDate.of(1976, 10, 28);
        LocalDate date2 = LocalDate.of(1978, 10, 28);
        List<Student> students = studentRepository.findAllByDateOfBirthIsBetween(date1, date2);
        students.forEach(System.out::println);

    }*/

    /*@Scheduled(fixedDelay = 1000 * 60 * 10)
    public void findStudentsWithMinBirthDate() {

        List<Student> students = studentRepository.findAll();
        Optional<Student> youngestStudent = students.stream()
                .reduce((student1, student2)
                        -> student1.getDateOfBirth().isAfter(student2.getDateOfBirth())
                        ? student1 : student2);

        // Displaying the longest String
        youngestStudent.ifPresent(System.out::println);
    }*/

    /*@Scheduled(fixedDelay = 1000 * 60 * 10)
    public void finPoorestTeacher() {

        List<Teacher> teachers = teacherRepository.findAll();
        Teacher poorestTeacher = teachers.stream().min(Comparator.comparing(Teacher::getSalary)).orElseThrow(NoSuchElementException::new);
        System.out.println(poorestTeacher);
    }*/

   /* @Scheduled(fixedDelay = 1000 * 60 * 10)
    public void findTeachersSalaryAverage() {

        List<Teacher> teachers = teacherRepository.findAll();
        Double teachersSalaryAverage = teachers.stream().map(e -> e.getSalary().doubleValue()).reduce((double) 0, Double::sum);
        teachersSalaryAverage = teachersSalaryAverage / teachers.size();
        System.out.println(teachersSalaryAverage);
    }*/
}
