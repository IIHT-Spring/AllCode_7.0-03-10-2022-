import { Component, OnInit } from '@angular/core';
import Student from 'src/app/Entity/Student';

@Component({
  selector: 'app-student-reg',
  templateUrl: './student-reg.component.html',
  styleUrls: ['./student-reg.component.css'],
})
export class StudentRegComponent implements OnInit {
  title = 'Fill out all the details below'; // one way

  student :Student = new Student();


  save() {
    console.log(this.student);
  }

  constructor() {}

  ngOnInit(): void {}
}
