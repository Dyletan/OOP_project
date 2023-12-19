package entities;

import data.DataBase;
import data.News;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ManagerDepartment extends Manager{

	
	public void puplishNews(News news) {
		DataBase.getInstance().getNews().add(news);
	}
	
	public void removeNews(News news) {
		DataBase.getInstance().getNews().remove(news);
	}
	
	
//	public List<Request> getAcceptedRequests() {
//        return requests.stream()
//                .filter(request -> request.isAccepted() == 1)
//                .collect(Collectors.toList());
//    }
//	должен быть в dean naverno
	
	
	public List<Request> viewRequests() {
        return dean.getAcceptedRequests();
    }
	
	
	
	
}
