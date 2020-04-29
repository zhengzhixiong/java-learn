package com.jmax4you.learn.cmd.service.impl;

import com.aliyuncs.IAcsClient;
import com.aliyuncs.alidns.model.v20150109.*;
import com.aliyuncs.exceptions.ClientException;
import com.jmax4you.learn.cmd.service.OprateDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OprateDomainServiceImpl implements OprateDomainService {

	@Value("${aliyun.update.domains}")
	private String domains;
	@Value("${aliyun.regionId}")
	String regionId;

	@Autowired
	private IAcsClient iAcsClient;

	@Override
	public DescribeDomainRecordsResponse getDescribeDomainRecordsList(DescribeDomainRecordsRequest request) {
		try {
			request.setSysRegionId(regionId);
			return iAcsClient.getAcsResponse(request);
		} catch (ClientException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public DescribeDomainRecordInfoResponse getDescribeDomainRecordInfo(DescribeDomainRecordInfoRequest request) {
		try {
			request.setSysRegionId(regionId);
			return iAcsClient.getAcsResponse(request);
		} catch (ClientException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public AddDomainRecordResponse addDomainRecord(AddDomainRecordRequest request) {
		try {
			request.setSysRegionId(regionId);
			return iAcsClient.getAcsResponse(request);
		} catch (ClientException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public DeleteDomainRecordResponse deleteDomainRecord(DeleteDomainRecordRequest request) {
		try {
			request.setSysRegionId(regionId);
			return iAcsClient.getAcsResponse(request);
		} catch (ClientException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public UpdateDomainRecordResponse updateDomainRecord(UpdateDomainRecordRequest request) {
		try {
			request.setSysRegionId(regionId);
			return iAcsClient.getAcsResponse(request);
		} catch (ClientException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SetDomainRecordStatusResponse setDomainRecordStatus(SetDomainRecordStatusRequest request) {
		try {
			request.setSysRegionId(regionId);
			return iAcsClient.getAcsResponse(request);
		} catch (ClientException e) {
			e.printStackTrace();
			return null;
		}
	}
}
