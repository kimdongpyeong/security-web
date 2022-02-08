package kr.supporti.api.common.mapper;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import kr.supporti.api.common.dto.InviteStudentParamDto;
import kr.supporti.api.common.dto.StudentDto;
import kr.supporti.api.common.dto.StudentGradeDto;
import kr.supporti.api.common.dto.UserDto;
import kr.supporti.api.common.dto.UserParamDto;
import kr.supporti.api.common.entity.InviteStudentEntity;
import kr.supporti.api.common.entity.StudentEntity;
import kr.supporti.api.common.entity.StudentGradeEntity;
import kr.supporti.api.common.entity.UserEntity;
import kr.supporti.common.util.PageRequest;
import kr.supporti.common.validation.group.ReadValidationGroup;

@Repository
@Mapper
public interface StudentGradeMapper {
    
    public List<StudentGradeEntity> selectStudentGradeList(@Param(value = "studentGradeDto") StudentGradeDto studentGradeDto,
            @Param(value = "pageRequest") PageRequest pageRequest);

    public Integer selectStudentGradeListCount(@Param(value = "studentGradeDto") StudentGradeDto studentGradeDto);
    
}