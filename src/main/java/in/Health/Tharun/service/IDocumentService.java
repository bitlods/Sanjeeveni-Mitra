package in.Health.Tharun.service;

import java.util.List;

import in.Health.Tharun.entity.Document;

public interface IDocumentService {

	void saveDocument(Document doc);
	List<Object[]> getDocumentIdAndName();
	void deleteDocumentById(Long id);
	Document getDocumentById(Long id);
}
