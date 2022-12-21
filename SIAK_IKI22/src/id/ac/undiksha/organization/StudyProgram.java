package id.ac.undiksha.organization;

public class StudyProgram implements Department, Faculty{
	
	private String studyProgramCode;
	private String studyProgramName;
	
	public StudyProgram(String studyProgramCode, String studyProgramName) {
		super();
		this.studyProgramCode = studyProgramCode;
		this.studyProgramName = studyProgramName;
	}
	
	public void setStudyProgramName(String studyProgramName) {
		this.studyProgramName = studyProgramName;
	}

	public String getStudyProgramName() {
		return this.studyProgramName;
	}
	
	private String departmentName;
	private String departmentCode;
	@Override
	public void setDeptName(String deptName) {
		// TODO Auto-generated method stub
		this.departmentName = deptName;
	}

	@Override
	public String getDeptName() {
		// TODO Auto-generated method stub
		return this.departmentName;
	}

	@Override
	public void setDeptCode(String deptCode) {
		// TODO Auto-generated method stub
		this.departmentCode = deptCode;
	}

	@Override
	public String getDeptCode() {
		// TODO Auto-generated method stub
		return this.departmentCode;
	}
	
	private String facultyName;

	@Override
	public String getNameFac() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
