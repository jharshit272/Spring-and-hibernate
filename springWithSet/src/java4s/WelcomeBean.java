package java4s;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class WelcomeBean {

	private Set studentsData;  
	private List studentsDataList;
	private Map data;


	public void setStudentsData(Set studentsData) {
		this.studentsData = studentsData;
	}

	public void show(){
		System.out.println(studentsData);
		System.out.println(studentsDataList);

		Set s = data.entrySet();
		Iterator it = s.iterator();

		while(it.hasNext()){
			Map.Entry me= (Map.Entry)it.next();
			System.out.println(me.getKey()+"-"+me.getValue());
		}
	}



	public void setStudentsDataList(List<String> studentsDataList) {
		this.studentsDataList = studentsDataList;
	}

	public Map getData() {
		return data;
	}

	public void setData(Map data) {
		this.data = data;
	}





}