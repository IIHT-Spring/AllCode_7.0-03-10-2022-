import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student-reg',
  templateUrl: './student-reg.component.html',
  styleUrls: ['./student-reg.component.css'],
})
export class StudentRegComponent implements OnInit {
  title = 'Fill out all the details below'; // one way

  studentDetails = {
    firstname: '',
    lastname: '',
    class: 0,
    email: '',
    gender: '',
  };

  save() {
    console.log(this.studentDetails);
  }

  constructor() {}

  ngOnInit(): void {}
}
