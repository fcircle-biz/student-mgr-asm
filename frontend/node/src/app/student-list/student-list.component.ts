import { Component, OnInit } from '@angular/core';
import { Student } from '../student.model';
import { StudentC } from '../student-c.model';
import { Map, PREF_CODE_MAP, GENDER_CODE_MAP} from '../code';
import { StudentService } from '../student.service';

/**
 * 生徒情報一覧コンポーネント
 */
@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css'],
  providers: [StudentService],
})
export class StudentListComponent implements OnInit {

  title = '生徒情報一覧';

  /** 検索条件 */
  studentC: StudentC = new StudentC();
  /** 都道府県コードマスタ */
  prefCodeMap: Map = PREF_CODE_MAP;
  /** 性別コードマスタ */
  genderCodeMap: Map = GENDER_CODE_MAP;

  /** 生徒一覧 */
  studentList: Student[] = [];

  /**
   * コンストラクタ
   * サービスのインジェクションを行う
   * @param studentSerivce 
   */
   constructor(
    private studentSerivce: StudentService
  ) { }

  /**
   * 初期処理
   */
  ngOnInit(): void {
    this.doSearch();
  }

  /**
   * 検索実行
   */
  doSearch(): void {
    this.studentSerivce.getStudentList(this.studentC).subscribe(data => {
      console.log(data);
      this.studentList = data;
    });
  }
}
