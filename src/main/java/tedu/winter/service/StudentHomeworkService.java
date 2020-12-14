package tedu.winter.service;
import tedu.winter.model.StudentHomework;

import java.util.List;



public interface StudentHomeworkService {


    /**
     * 学生提交作业

     */
    int addStudentHomework(StudentHomework studentHomework);


    int updateStudentHomework(StudentHomework studentHomework);

    List<StudentHomework> selectByHomeworkId(Long homeworkId);


    StudentHomework selectByP(Long id);

    /**
     * 目前是通过studentid,homeworkid查询
     * @param studentHomework
     * @return
     */
    StudentHomework selectByDoublekey(StudentHomework studentHomework);
}
