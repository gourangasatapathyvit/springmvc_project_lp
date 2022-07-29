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
		String sql = "insert into proposal values(?,?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,
				new Object[] { newProposal.getFirstName(), newProposal.getLastName(), newProposal.getDOB(),
						newProposal.getEmail(), newProposal.getContactNumber(), newProposal.getGender(),
						newProposal.isConsume(), newProposal.getAnnualIncome(), newProposal.getPolicyType(),
						newProposal.getAgeOfInsurance() });

	}

	public List<newProposal> queryAllUser() {
		String sql = "select * from proposal";
		List<newProposal> newProposals = jdbcTemplate.query(sql, new newProposalMapper());
		return newProposals;
	}

	@Override
	public void deleteNewProposals(String firstName) {
		String sql = "DELETE FROM proposal WHERE firstName = ?";
		jdbcTemplate.update(sql, firstName);
	}

}

class newProposalMapper implements RowMapper<newProposal> {

	public newProposal mapRow(ResultSet rs, int arg1) throws SQLException {
		newProposal newProposal = new newProposal();

		newProposal.setFirstName(rs.getString("firstName"));
		newProposal.setLastName(rs.getString("lastName"));
		newProposal.setDOB(rs.getString("DOB"));
		newProposal.setEmail(rs.getString("email"));
		newProposal.setContactNumber(rs.getInt("contactNumber"));
		newProposal.setGender(rs.getString("gender"));
		newProposal.setConsume(rs.getString("isConsume"));
		newProposal.setAnnualIncome(rs.getInt("annualIncome"));
		newProposal.setPolicyType(rs.getString("policyType"));
		newProposal.setAgeOfInsurance(rs.getString("ageOfInsurance"));

		return newProposal;
	}
}
