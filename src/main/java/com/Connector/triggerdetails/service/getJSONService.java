package com.Connector.triggerdetails.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.Connector.triggerdetails.model.jSONModel;

@Service
public interface getJSONService {
	public List<jSONModel> getJsonDetails(jSONModel jsonModel);
}
