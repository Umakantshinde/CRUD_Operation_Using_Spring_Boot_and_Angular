import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { StudentService } from './student.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Crud_Frontend';
  studentDetails : any;
  constructor(private studentService:StudentService){
    this.getStudentDetails();
  }
  register(registerForm:any){
this.studentService.registerStudent(registerForm.value).subscribe(

  (resp)=>{
    console.log(resp);
    registerForm.reset();
    this.getStudentDetails();
  },
  (err)=>{
    console.log(err);
  }
);
  }
  getStudentDetails(){
  this.studentService.getStudents().subscribe(
    (resp)=>{
      console.log(resp);
      this.studentDetails =resp;
    },
    (err)=>{
      console.log(err);
    }

  )}
  deleteStudent(student:any){
    this.studentService.deleteStudent(student.id).subscribe(
(resp)=>{

  console.log(resp);
  this.getStudentDetails();
},
(err)=>{
  console.log(err);
}


    );
  }
}
