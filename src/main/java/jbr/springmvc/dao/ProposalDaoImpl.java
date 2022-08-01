package jbr.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.newProposal;

public class ProposalDaoImpl implements ProposalDao {
	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int register(newProposal newProposal) {
		String sql = "insert into proposal(firstName,lastName,DOB,email,contactNumber,gender,consume,annualIncome,policyType,ageOfInsurance,action) values(?,?,?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,
				new Object[] { newProposal.getFirstName(), newProposal.getLastName(), newProposal.getDOB(),
						newProposal.getEmail(), newProposal.getContactNumber(), newProposal.getGender(),
						newProposal.getConsume(), newProposal.getAnnualIncome(), newProposal.getPolicyType(),
						newProposal.getAgeOfInsurance(), "pending" });

	}

	public List<newProposal> queryAllUser() {
		String sql = "select * from proposal order by id asc";
		List<newProposal> newProposals = jdbcTemplate.query(sql, new newProposalMapper());
		return newProposals;
	}

	@Override
	public void deleteNewProposals(int id) {
		String sql = "DELETE FROM proposal WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public void actionNewProposals(int actionid, String val) {
		String sql = null;
		if (val == "accept") {
			sql = "UPDATE proposal SET action='acepted' WHERE id=?";
		} else if (val == "reject") {
			sql = "UPDATE proposal SET action='rejected' WHERE id=?";
		} else {
			sql = "DELETE FROM proposal WHERE id = ?";
		}

		jdbcTemplate.update(sql, actionid);
	}

}

class newProposalMapper implements RowMapper<newProposal> {

	public newProposal mapRow(ResultSet rs, int arg1) throws SQLException {
		newProposal newProposal = new newProposal();
		newProposal.setId(rs.getInt("id"));
		newProposal.setFirstName(rs.getString("firstName"));
		newProposal.setLastName(rs.getString("lastName"));
		newProposal.setDOB(rs.getString("DOB"));
		newProposal.setEmail(rs.getString("email"));
		newProposal.setContactNumber(rs.getString("contactNumber"));
		newProposal.setGender(rs.getString("gender"));
		newProposal.setConsume(rs.getString("consume"));
		newProposal.setAnnualIncome(rs.getInt("annualIncome"));
		newProposal.setPolicyType(rs.getString("policyType"));
		newProposal.setAgeOfInsurance(rs.getString("ageOfInsurance"));
		newProposal.setAction(rs.getString("action"));

		return newProposal;
	}
}
