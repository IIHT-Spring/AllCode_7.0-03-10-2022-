import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

const BASE_URL = 'http://localhost:5000/students'; // instead of this you will have your sspringboot endpoints 

@Injectable({
  providedIn: 'root',
})
export class StudentService {
  saveStudent(student: {
    firstname: String;
    lastname: String;
    class: number;
    email: String;
    gender: String;
  }) {
    return this.http.post(BASE_URL, student);
  }

  deleteStudent(student:any) {
    return this.http.delete(BASE_URL+"/"+student.id)
  }

  getStudents() {
    return this.http.get(BASE_URL);
  }

  constructor(public http: HttpClient) {}
}
