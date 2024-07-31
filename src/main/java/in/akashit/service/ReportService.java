package in.akashit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.akashit.dao.ReportDao;

@Service
public class ReportService {


	@Autowired
	//@Qualifier("dao")
	private ReportDao dao;

	/*
	 * public ReportService(ReportDao dao) { this.dao = dao; }
	 */

	public void generateData() {

		dao.getData();
		System.out.println("report generated");

	}

	

}
