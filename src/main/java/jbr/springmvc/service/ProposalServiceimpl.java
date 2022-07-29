package jbr.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jbr.springmvc.dao.ProposalDao;
import jbr.springmvc.model.newProposal;

public class ProposalServiceimpl implements ProposalService {

	@Autowired
	public ProposalDao proposalDao;

	@Override
	public int register(newProposal newProposal) {
		return proposalDao.register(newProposal);
	}

	@Override
	public List<newProposal> queryAllUser() {
		return proposalDao.queryAllUser();
	}

	@Override
	public void deleteNewProposals(String firstName) {
		proposalDao.deleteNewProposals(firstName);
		
	}

}
