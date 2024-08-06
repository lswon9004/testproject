package user.security.approval;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ApprovalDao {
	@Select("select count(*) from Approval where empno = #{empno}")
	int Acount(int empno);
	@Select("select * from Approval where empno = #{empno}")
	List<ApprovalDto> alist(int empno);
	
	@Select({
	    "<script>",
	    "select * from Approval",
	    "<where>",
	        "<if test=\"approval_no != null\">",
	            "approval_no = #{approval_no}",
	        "</if>",
	        "<if test=\"approval_title != null and approval_title != ''\">",
	            "and approval_title like #{approval_title}",
	        "</if>",
	        "<if test=\"created_date != null and created_date != ''\">",
	            "and created_date between #{startDate} and #{endDate}",
	        "</if>",
	        "and empno = #{empno}",
	    "</where>",
	    "</script>"
	})
	 List<ApprovalDto> searchList(@Param("approval_no")int approval_no,
			 					  @Param("approval_title")String approval_title,
			 					  @Param("startDate")Date startDate,
			 					  @Param("endDate")Date endDate,
			 					  @Param("empno")int empno);
	@Select("select max(approval_no)+1 form approval where empno = #{empno}")
	int getApproval_no(int empno);
}
