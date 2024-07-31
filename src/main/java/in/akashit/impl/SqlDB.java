package in.akashit.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import in.akashit.dao.ReportDao;

@Repository("Dbo")
@Primary
public class SqlDB implements ReportDao{

	public SqlDB() {
		System.out.println("SqlDB:: Constructor");
	}
	
	public void getData() {
		System.out.println("This is SQL-db");
	}

}
