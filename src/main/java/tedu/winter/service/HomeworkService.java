package tedu.winter.service;

import tedu.winter.model.Homework;

import java.util.List;


public interface HomeworkService {


    /**
     * 老师发布作业
     */
    int addHomework(Homework homework);
    List<Homework> selectAll();
    List<Homework> selectByTeacherId(String teacherId);
    List<Homework> selectByTeacherName(String teacherName);
    Homework selectByPK(Long id);
}
