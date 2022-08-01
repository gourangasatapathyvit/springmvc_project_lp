package jbr.springmvc.dao;

import java.util.List;

import jbr.springmvc.model.newProposal;

public interface ProposalDao {
	int register(newProposal newProposal);

	List<newProposal> queryAllUser();
	void deleteNewProposals(int id);
}
