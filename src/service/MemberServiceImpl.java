package service;

import java.util.ArrayList;

import dao.MemberDAO;
import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	
	private static MemberServiceImpl instance = new MemberServiceImpl();
	public MemberServiceImpl() {}
	public static MemberServiceImpl getInstance() {
		return instance;
	}


	MemberDAOImpl dao;
	
	@Override
	public void createMember(MemberBean member) {
		/*dao.insertMember(member);*/
		MemberDAOImpl.getInstance().insertMember(member);
		
	}

	@Override
	public ArrayList<MemberBean> findAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public MemberBean findMemberById(String id) {
		return dao.selectMemberById(id);
	}

	@Override
	public int countMembers() {
		int count = 0;
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean exist = false;
		MemberBean member = dao.selectMemberById(id);
		if(id.equals(member.getId())&& pass.equals(member.getPass())) {
			exist = true;
		}else {
			exist = false;
		}
		
		
		return exist;
	}

	@Override
	public void changeMember(MemberBean member) {
		
	}

	@Override
	public void removeMember(String id) {
		
	}

}