package jbr.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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
		return mav;
	}

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView dashboardView() {
		List<newProposal> list = ProposalService.queryAllUser();
		System.out.println(list);

		ModelAndView mav = new ModelAndView("dashboard");
		mav.addObject("proposalList", list);
		return mav;
	}

	@RequestMapping("/delete/{id}")
	public RedirectView deleteItem(@PathVariable("id") int id, HttpServletRequest request) {
		ProposalService.actionNewProposals(id, "delete");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/dashboard");
		return redirectView;

	}

	@RequestMapping("/accept/{actionid}")
	public RedirectView acceptItem(@PathVariable("actionid") int actionid, HttpServletRequest request) {
		ProposalService.actionNewProposals(actionid, "accept");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/dashboard");
		return redirectView;

	}

	@RequestMapping("/reject/{actionid}")
	public RedirectView actionItem(@PathVariable("actionid") int actionid, HttpServletRequest request) {
		ProposalService.actionNewProposals(actionid, "reject");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/dashboard");
		return redirectView;

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
