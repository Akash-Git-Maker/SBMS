package in.akashit.impl;

import org.springframework.stereotype.Repository;

import in.akashit.dao.ReportDao;

@Repository("dao")
public class OracleDB implements ReportDao{

	public OracleDB() {
		System.out.println("OracleDB:: Constructor");
	}
	public void getData() {
		System.out.println("This is ORACLE-db");
	}

}
