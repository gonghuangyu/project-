package tedu.winter.mapper;

import tedu.winter.model.StudentHomework;

import java.util.List;

public interface StudentHomeworkMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StudentHomework record);

    int insertSelective(StudentHomework record);

    StudentHomework selectByPrimaryKey(Long id);
    List<StudentHomework> selectByHomeworkId(Long hid);

    // 通过studentid,homeworkid查询
    StudentHomework selectByDoublekey(StudentHomework studentHomework);

    int updateByPrimaryKeySelective(StudentHomework record);

    int updateByPrimaryKeyWithBLOBs(StudentHomework record);

    int updateByPrimaryKey(StudentHomework record);
}