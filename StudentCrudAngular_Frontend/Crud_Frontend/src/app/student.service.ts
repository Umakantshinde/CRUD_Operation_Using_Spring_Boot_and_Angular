import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http:HttpClient) { }
  API="http://localhost:9090";
  public registerStudent(studentData:any){

    return this.http.post(this.API+"/registerStudent",studentData);
  }

  public getStudents(){

    return this.http.get(this.API+"/getStudents");
  }
  public deleteStudent(id:any){
return this.http.delete(this.API+"/deleteStudent?id="+id);
  }
}
