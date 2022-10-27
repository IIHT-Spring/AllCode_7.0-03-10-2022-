import { Component, OnInit } from '@angular/core';
import Student from 'src/app/Entity/Student';
import { StudentService } from 'src/app/Services/student.service';

@Component({
  selector: 'app-redgistered-students',
  templateUrl: './redgistered-students.component.html',
  styleUrls: ['./redgistered-students.component.css']
})
export class RedgisteredStudentsComponent implements OnInit {

  students : Student[] =[];
 
  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
    const promise = this.studentService.getStudents();
    promise.subscribe((response) => {
      console.log(response);
      this.students = response as Student[];      
    })
  }

}
