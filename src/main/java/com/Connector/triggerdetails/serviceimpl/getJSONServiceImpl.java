package com.Connector.triggerdetails.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Connector.triggerdetails.model.jSONModel;
import com.Connector.triggerdetails.service.getJSONService;

@Service
public class getJSONServiceImpl implements getJSONService{

	@Override
	public List<jSONModel> getJsonDetails(jSONModel jsonModel) {
		List<jSONModel> jsonModelList= new ArrayList<jSONModel>();
		jSONModel jSONModel1 = new jSONModel();
		jSONModel1.setObject_kind(jsonModel.getObject_kind());
		System.out.println("object kind: "+jsonModel.getObject_kind());
		jSONModel1.setBefore(jsonModel.getBefore());
		System.out.println("getbefore: "+jsonModel.getBefore());
		jSONModel1.setAfter(jsonModel.getAfter());
		System.out.println("getafter: "+jsonModel.getAfter());
		jSONModel1.setRef(jsonModel.getRef());
		System.out.println("reference: "+jsonModel.getRef());
		jsonModelList.add(jSONModel1);
		
		return jsonModelList;
	}
	
	

}
