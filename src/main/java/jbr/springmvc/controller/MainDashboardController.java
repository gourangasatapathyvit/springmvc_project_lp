package jbr.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.model.newProposal;
import jbr.springmvc.service.ProposalService;

@Controller
public class MainDashboardController {
	@Autowired
	public ProposalService ProposalService;

	@RequestMapping(value = "/proposalform", method = RequestMethod.GET)
	public ModelAndView showLogin() {
		ModelAndView mav = new ModelAndView("proposalform");
		mav.addObject("proposal", new newProposal());
		
		System.out.println(ProposalService.queryAllUser());
//		ProposalService.deleteNewProposals("wwww");
		return mav;
	}

	@RequestMapping(value = "/proposalprocess", method = RequestMethod.POST)
	public ModelAndView loginProcess(@ModelAttribute newProposal newProposal) {
		ModelAndView mav = null;
		System.out.println(newProposal);
		ProposalService.register(newProposal);
		mav = new ModelAndView("welcome");
		return mav;
	}

}
