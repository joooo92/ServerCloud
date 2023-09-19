package com.server.cloud.admin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;


import com.server.cloud.command.CsVO;

import com.server.cloud.command.CusVO;

import com.server.cloud.command.EngineerVO;
import com.server.cloud.command.NoticeVO;
import com.server.cloud.command.ProjectDetailVO;
import com.server.cloud.command.ProjectInfoVO;
import com.server.cloud.command.WorkInfoVO;
import com.server.cloud.pagenation.Criteria;

@Mapper
public interface AdminMapper {

	int getTotal();

	List<NoticeVO> getList(Criteria cri);

	
	//회원관리 - 엔지니어
	public List<EngineerVO> adEngineerList(EngineerVO engineerVO);


	List<CsVO> csList(Criteria cri);

	int csTotal();

	void csUpdate(CsVO vo);

	//회원관리 - 기업
	public List<CusVO> adClientList(CusVO cusVO);
	
	
	//프로젝트 리스트 불러오기
	public ArrayList<ProjectInfoVO> getProList();
	
	//프로젝트 리스트 (모달)
	public ArrayList<ProjectDetailVO> getProListDetail(String pro_id);
	
	//서버 점검 리스트 (모달)
	public ArrayList<WorkInfoVO> getServerInsList(String server_id);

}
