package repository;


import java.util.List;
import entity.Student;

public interface Repository {
	
	//CRUD
	//1.Read
	//학생목록 천제 들고오기
	List<Student> selcetStudents() throws Exception;
	//학생정보 하나 불러오기
	Student seletStudent(int stdNo) throws Exception;
	
	//학생이름으로 학생정보 불러오기
	//동명이인이 존재할 수 있으니
	List<Student> selectStudent(Student name) throws Exception;
	
	//최종 추가된 학생 하나 불러오기
	Student lastInertedStudent() throws Exception;
	
	//2.Create(Insert)
	//학생 입력하기
	boolean registStudent(Student student) throws Exception;
	
	//3.Update(Update)
	//학생 한명 수정하기
	int updateStudent(int stdNo, Student student) throws Exception;
	
	//4.Delete(Delete)
	//학생 한명 삭제하기
	boolean deletStudent(int stdNo) throws Exception;
	
	//5.자원반납(DB Close)
	void closeReponsutory() throws Exception;
		
}
