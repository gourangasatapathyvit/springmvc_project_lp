package jbr.springmvc.service;

import java.util.List;

import jbr.springmvc.model.newProposal;

public interface ProposalService {
	int register(newProposal newProposal);

	List<newProposal> queryAllUser();
	void deleteNewProposals(String firstName);

}
