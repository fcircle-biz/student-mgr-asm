import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, tap } from 'rxjs';
import { Student } from './student.model';
import { StudentC } from './student-c.model';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private url: string = "http://localhost:8080/api";

  /**
   * コンストラクタ
   */
  constructor(
    private httpClient: HttpClient
  ) {}

  /**
   * 生徒一覧取得
   * 
   * @param studentC 検索条件
   * @returns 
   */
  getStudentList(studentC: StudentC): Observable<Student[]> {

    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json'
      })
    };    
    return this.httpClient.get<Student[]>(
      `${this.url}/studentList?studentName=${studentC.studentName}&prefId=${studentC.prefId}`
      , httpOptions);
  }  
}
