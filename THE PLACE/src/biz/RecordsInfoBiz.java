package biz;

import bean.RecordsInfo;
import dao.RecordsInfoDAO;

public class RecordsInfoBiz {
	RecordsInfoDAO recordsInfoDAO = new RecordsInfoDAO();
	
	//���¼��������Ӽ�¼
	public void addRecords (RecordsInfo record) {
		recordsInfoDAO.addRecords(record);
	}
}
